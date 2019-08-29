package com.sinc.hfsf.basket.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParser;
import com.mysql.cj.x.json.JsonArray;
import com.sinc.hfsf.basket.service.BasketService;
import com.sinc.hfsf.basket.vo.OdrVO;
import com.sinc.hfsf.basket.vo.ProductVO;
import com.sinc.hfsf.park.service.ParkService;
import com.sinc.hfsf.qr.vo.QrVO;

@Controller
public class BasketController {
	
	@Resource
	private BasketService service;
	
	@RequestMapping(value="/getProduct.do", method=RequestMethod.POST ,produces = "application/json")
	@ResponseBody
	public JSONArray getPark(String prodId) {
		
		System.out.println("prodId ============ " + prodId);
		
		ProductVO paramVO = new ProductVO();
		paramVO.setProdId(prodId);
		
		List<ProductVO> list = service.getProductList(paramVO);
		
		JSONArray jArr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			JSONObject jObj = new JSONObject();
			jObj.put("prodId", list.get(i).getProdId());
			jObj.put("prodName", list.get(i).getProdName());
			jObj.put("prodPrice", list.get(i).getProdPrice());
			jObj.put("prodTaggable", list.get(i).isProdTaggable());
			jObj.put("prodImgDir", list.get(i).getProdImgDir());
			jArr.add(jObj);
		}
		
		return jArr;
	}
	

	@RequestMapping(value="/submitBasket.do", method=RequestMethod.POST ,produces = "application/json")
	@ResponseBody
	public String submitBasket(String params) {
		System.out.println(params);

		//qr id ����
		String odrId = service.generateOdrId();
		
		//orderRequest ���̺� insert
		OdrVO odrVO = new OdrVO();
		odrVO.setOdrId(odrId);
		odrVO.setPickupId("1"); //�ϴ� 1������ ����
		
		//ord_list ���̺� insert
		JSONParser jParser = new JSONParser();
		JSONArray jArr = null;
		
		ArrayList<ProductVO> paramList = new ArrayList<ProductVO>();
		String customerId = "";
		String token ="";
		try {
			jArr = (JSONArray)jParser.parse(params);
			for(int i=0; i<jArr.size(); i++) {
				JSONObject jObj = (JSONObject) jArr.get(i);
				
				String prodId = jObj.get("prodId").toString();
				/*
				 * String prodName = jObj.get("prodName").toString(); int prodPrice =
				 * Integer.parseInt(jObj.get("prodPrice").toString()); boolean prodTaggable =
				 * jObj.get("prodTaggable").toString().equals("1")? true:false; String
				 * prodImgDir = jObj.get("prodImgDir").toString(); 
				 * 
				 */
				int prodQty = Integer.parseInt(jObj.get("prodQty").toString());
				customerId = jObj.get("customerId").toString();
				token = jObj.get("token").toString();
				
				
				ProductVO vo = new ProductVO();
				vo.setProdId(prodId);
				vo.setCustomerId(customerId);
				vo.setProdQty(prodQty);
				
				if(prodQty != 0)paramList.add(vo);
				//odrVO.setTotalPrice(odrVO.getTotalPrice()+(prodPrice*prodQty));
			}
			odrVO.setCustomerId(customerId);
			
			List<ProductVO> list = new ArrayList<ProductVO>();
			list = service.getProductList(paramList);
			for(int i=0 ; i<list.size();i++) {
				for(int j=0 ; j<paramList.size();j++) {
					if(list.get(i).getProdId().equals(paramList.get(j).getProdId())) {
						list.get(i).setProdQty(paramList.get(j).getProdQty());
					}
				}
				list.get(i).setOdrId(odrId);
				list.get(i).setCustomerId(customerId);
				int price = list.get(i).getProdPrice();
				int qty = list.get(i).getProdQty();
				odrVO.setTotalPrice(odrVO.getTotalPrice()+(price*qty));
				odrVO.setToken(token);
			}
			
			
			
			
			service.insertOrderRequest(odrVO);
			service.insertOrders(list);
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "odrId:"+odrId;
	}
	
	@RequestMapping(value="/orderManageBoard.do", method=RequestMethod.GET)
	public String getOrderListBeforePacking(ModelMap model, HttpServletRequest req) {
		
		List<OdrVO> odrListBeforePacking = service.getOrderListBeforePacking();
		model.addAttribute("odrListBeforePacking", odrListBeforePacking);
		// System.out.println("DEBUG : " + odrListBeforePacking.get(0).getOdrId());

		List<OdrVO> odrListAfterPacking = service.getOrderListAfterPacking();
		model.addAttribute("odrListAfterPacking", odrListAfterPacking);
				
		return "/orderManageBoard";
	}
	
	@RequestMapping(value="/odrPackComplete.do", method=RequestMethod.GET)
	public String odrPackComplete( HttpServletRequest req ) {
		
		String odr_id = req.getQueryString(); 
		service.odrPackComplete(odr_id);
		
		return "redirect:orderManageBoard.do";
	}
	@RequestMapping(value="/odrPickupComplete.do", method=RequestMethod.GET)
	public String odrPickupComplete( HttpServletRequest req ) {
		
		String odr_id = req.getQueryString(); 
		service.odrPickupComplete(odr_id);
		
		return "redirect:orderManageBoard.do";
	}

}
