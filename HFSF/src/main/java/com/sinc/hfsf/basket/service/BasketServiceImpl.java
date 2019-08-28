package com.sinc.hfsf.basket.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.basket.vo.OdrVO;
import com.sinc.hfsf.basket.vo.ProductDAO;
import com.sinc.hfsf.basket.vo.ProductVO;
import com.sinc.hfsf.qr.vo.QrVO;

@Service
public class BasketServiceImpl implements BasketService {

	@Resource
	private ProductDAO dao;

	@Override
	public List<ProductVO> getProductList(ProductVO paramVO) {
		return dao.getProductList(paramVO);
	}

	@Override
	public void insertOrders(List<ProductVO> list) {
		dao.insertOrders(list);
		
	}

	@Override
	public String generateOdrId() {
		return dao.generateOdrId();
	}

	@Override
	public void insertOrderRequest(OdrVO odrVO) {
		dao.insertOrderRequest(odrVO);
	}

	@Override
	public List<ProductVO> getProductList(List<ProductVO> paramList) {
		return dao.getProductList(paramList);
	}
}
