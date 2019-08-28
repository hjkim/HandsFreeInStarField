package com.sinc.hfsf.qr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.hfsf.qr.service.QrService;
import com.sinc.hfsf.qr.vo.QrVO;

@Controller
public class QrController {
	
	@Resource
	private QrService service;
	
	@RequestMapping(value="/qrinfo.do", method=RequestMethod.GET)
	public String getQrInfo(ModelMap model, HttpServletRequest req) {
		
		String qr_id = req.getQueryString(); 
		// System.out.println(qr_id);
		
		QrVO qrVO = service.getQrInfo( qr_id );
		model.addAttribute(qrVO);
				
		return "/qrInfo";
	}

}
