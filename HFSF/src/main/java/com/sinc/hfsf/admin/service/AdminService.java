package com.sinc.hfsf.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.Map;
import com.sinc.hfsf.admin.vo.AdminDAO;
import com.sinc.hfsf.admin.vo.AdminVO;

@Service("adminS")
public class AdminService {
	
	@Resource(name="adminD")
	private AdminDAO dao;
	
	public List<AdminVO> printService(){
		
		return dao.printRow();
	}
	
	public Map pickupTimeService() {
		return dao.pickupTime();
	}
	public Map pickupTermService() {
		return dao.pickupTerm();
	}
}
