package com.sinc.hfsf.qr.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinc.hfsf.basket.service.BasketService;
import com.sinc.hfsf.basket.vo.DetailVO;
import com.sinc.hfsf.basket.vo.OdrVO;

@Controller
public class QrController {
	
	@Resource
	private BasketService service;
	
	@RequestMapping(value="/qrinfo.do", method=RequestMethod.GET)
	public String getOrder(ModelMap model, HttpServletRequest req) {
		
		String odr_id = req.getQueryString(); 

		OdrVO odrVO = service.getOrder( odr_id );
		
		model.addAttribute("odrVO", odrVO);
		
		List<DetailVO> detailList = service.getOrderDetailList( odr_id );
		//System.out.println( "debug01 : " + detailList.get(0).getProdId() );
		//System.out.println( "debug02 : " + detailList.get(1).getProdId() );
		model.addAttribute("detailList" ,detailList);
				
		return "/qrInfo";
	}

}
