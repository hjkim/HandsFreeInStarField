package com.sinc.hfsf.result.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.basket.vo.OdrVO;
import com.sinc.hfsf.result.vo.ResultDAO;

@Service
public class ResultServiceImpl implements ResultService {
	
	@Resource
	private ResultDAO dao;

	@Override
	public List<OdrVO> getOdrResult(String odrId) {
		return dao.getOdrResult(odrId);
	}

}
