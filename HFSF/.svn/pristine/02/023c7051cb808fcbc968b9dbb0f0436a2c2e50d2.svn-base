package com.sinc.hfsf.park.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.park.vo.ParkDAO;
import com.sinc.hfsf.park.vo.ParkVO;
import com.sinc.hfsf.user.vo.CustomerVO;

@Service
public class ParkServiceImpl implements ParkService {
	
	@Resource
	private ParkDAO dao;
	
	@Override
	public List<ParkVO> getParkList(ParkVO paramVO) {
		return dao.getParkList(paramVO);
	}

}
