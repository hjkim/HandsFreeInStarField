package com.sinc.hfsf.qr.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.qr.vo.QrDAO;
import com.sinc.hfsf.qr.vo.QrVO;

@Service
public class QrServiceImpl implements QrService {
	
	@Resource
	private QrDAO dao;
	
	@Override

	public QrVO getQrInfo(String qrid) {
		return dao.getQrInfo(qrid);
	}

}
