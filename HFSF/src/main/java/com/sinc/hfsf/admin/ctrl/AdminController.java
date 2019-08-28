package com.sinc.hfsf.admin.ctrl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.hfsf.Map;
import com.sinc.hfsf.admin.service.AdminService;
import com.sinc.hfsf.admin.vo.AdminVO;

@Controller
public class AdminController {
	@Resource(name="adminS")
	private AdminService service;
	
	@RequestMapping(value="/admin.do", method=RequestMethod.GET)
	public String print(ModelMap model) {
		List<AdminVO> list = service.printService();
		model.addAttribute("list",list);
		return "/admin";
	}
	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public String home(ModelMap model) {

		Map hashMap = service.pickupTimeService();
		model.addAllAttributes(hashMap);
		
		Map hashMap2 = service.pickupTermService();
		model.addAllAttributes(hashMap2);
		
		return "/index";
	}
	
	@RequestMapping(value="/getPickUpBarData.do", method=RequestMethod.POST)
	@ResponseBody
	public Map pickUpBarData(@RequestParam HashMap map) {
		Map hmap = null;
		hmap = service.pickupTermService();
		return hmap;
	}
	
	@RequestMapping(value="/getPickUpAreaData.do", method=RequestMethod.POST)
	@ResponseBody
	public Map pickUpAreaData(@RequestParam HashMap map) {
		Map hmap = null;
		hmap = service.pickupTimeService();
		return hmap;
	}
	

	
	
	
	
}
