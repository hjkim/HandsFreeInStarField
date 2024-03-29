package com.sinc.hfsf.admin.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.admin.vo.AdminDAO;
import com.sinc.hfsf.admin.vo.AdminVO;
import com.sinc.hfsf.admin.vo.StockVO;

@Service("adminS")
public class AdminService {
	
	@Resource(name="adminD")
	private AdminDAO dao;
	
	public List<AdminVO> printService(){
		
		return dao.printRow();
	}
	
	public Map graphData(int i) {
		
		return dao.graphDate(i);
	}
	
	public Map graphPackTime(int i) {
		return dao.graphDueTime(i);
	}
	
	 public Map pickupTimeService(int i) {
		  return dao.pickupTime(i);
		 }
	 public Map pickupTermService(int i) {
		  return dao.pickupTerm(i);
	}
	 public List<StockVO> stockListService() {
		  return dao.stockList();
	}
}
