package com.sinc.hfsf.park.controller;

import java.util.List;

import javax.annotation.Resource;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.hfsf.park.service.ParkService;
import com.sinc.hfsf.park.vo.ParkVO;

@Controller
public class ParkController {
	
	@Resource
	private ParkService service;
	
	@RequestMapping(value="/getPark.do", method=RequestMethod.POST ,produces = "application/json")
	@ResponseBody
	public JSONArray getPark(String carId) {
		
		System.out.println("carId ============ " + carId);
		
		ParkVO paramVO = new ParkVO();
		paramVO.setCarId(carId);
		
		List<ParkVO> list = service.getParkList(paramVO);
		
		JSONArray jArr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			JSONObject jObj = new JSONObject();
			jObj.put("carId", list.get(i).getCarId());
			jObj.put("carFloor", list.get(i).getCarFloor());
			jObj.put("carLoc", list.get(i).getCarLoc());
			jArr.add(jObj);
		}
		
		return jArr;
	}

}
