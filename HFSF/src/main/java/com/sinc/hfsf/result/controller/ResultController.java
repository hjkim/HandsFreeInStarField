package com.sinc.hfsf.result.controller;

import java.util.List;

import javax.annotation.Resource;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.hfsf.basket.vo.OdrVO;
import com.sinc.hfsf.result.service.ResultService;
import com.sinc.hfsf.result.vo.ResultVO;

@Controller
public class ResultController {
	
	@Resource
	private ResultService service;
	
	@RequestMapping(value="/getOdrResult.do", method=RequestMethod.POST ,produces = "application/json")
	@ResponseBody
	public JSONArray getOdrResult(String odrId) {
		
		List<OdrVO> list = service.getOdrResult(odrId);
		
		JSONArray jArr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			JSONObject jObj = new JSONObject();
			jObj.put("odrId", list.get(i).getOdrId());
			jObj.put("pickupId", list.get(i).getPickupId());
			jObj.put("customerId", list.get(i).getCustomerId());
			jObj.put("odrDate", list.get(i).getOdrDate());
			jObj.put("packDate", list.get(i).getPackDate());
			jObj.put("pickupDate", list.get(i).getPickupDate());
			jObj.put("odrState", list.get(i).getOdrState());
			jObj.put("token", list.get(i).getToken());
			jObj.put("totalPrice", list.get(i).getTotalPrice());
			jArr.add(jObj);
		}
		
		return jArr;
		
	}
	
	
}
