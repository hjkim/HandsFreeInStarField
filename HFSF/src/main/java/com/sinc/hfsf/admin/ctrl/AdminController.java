package com.sinc.hfsf.admin.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.hfsf.admin.service.AdminService;
import com.sinc.hfsf.admin.vo.AdminVO;
import com.sinc.hfsf.admin.vo.StockVO;

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
	public String home() {
		return "/index";
	}
	
	@RequestMapping(value="/pickInfo.do", method = RequestMethod.GET)
	public String info() {
		return "/pickUPinfo";
	}
	
	@RequestMapping(value="/getGraphData.do", method = RequestMethod.POST)
	@ResponseBody
	public Map graphDate(@RequestParam HashMap map) {
		Map hmap = null;
		if(map.get("id").equals("1")) {
			hmap = service.graphData(1);
		}else if(map.get("id").equals("2"))  {
			hmap = service.graphData(2);
		}
		return hmap;
	}
	
	@RequestMapping(value="/getDueTimeGraphData.do", method = RequestMethod.POST)
	@ResponseBody
	public Map graphDueDate(@RequestParam HashMap map) {
		Map hmap = null;
		if(map.get("id").equals("1")) {
			hmap = service.graphPackTime(1);
		}else if(map.get("id").equals("2"))  {
			hmap = service.graphPackTime(2);
		}
		return hmap;
	}
	
	@RequestMapping(value="/getPickUpBarData.do", method=RequestMethod.POST)
	 @ResponseBody
	 public Map pickUpBarData(@RequestParam HashMap map) {
	  Map hmap = null;
	  /*
	  hmap = service.pickupTermService();
	  return hmap;
	  */
		if(map.get("id").equals("1")) {
			hmap = service.pickupTermService(1);
		}else if(map.get("id").equals("2"))  {
			hmap = service.pickupTermService(2);
		}
		return hmap;
	 }
	 
	 @RequestMapping(value="/getPickUpAreaData.do", method=RequestMethod.POST)
	 @ResponseBody
	 public Map pickUpAreaData(@RequestParam HashMap map) {
		Map hmap = null;

		if (map.get("id").equals("1")) {
			hmap = service.pickupTimeService(1);
		
		} else if (map.get("id").equals("2")) {
			hmap = service.pickupTimeService(2);
		}
		return hmap;
	 } 
	
	
	@RequestMapping(value="/stockPage.do", method = RequestMethod.GET)
	public String stock() {
		return "/stockPage";
	}
	@RequestMapping(value="/getNowStock.do", method=RequestMethod.POST)
	@ResponseBody
	public Object getNowStock() {
		List<StockVO> list = service.stockListService();
		System.out.println(list);
		System.out.println("Here~~~~~~~~~~~~~~~~");
		Map<String, Object> mp = new HashMap<String, Object>();
		mp.put("data", list);
		Object result =mp;
		return result;
	}
	
	
	
}
