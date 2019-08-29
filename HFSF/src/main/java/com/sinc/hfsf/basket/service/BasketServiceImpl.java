package com.sinc.hfsf.basket.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.hfsf.basket.vo.DetailVO;
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

	@Override
	public List<OdrVO> getOdrListByCusId(String customerId) {
		return dao.getOdrListByCusId(customerId);
	}

	@Override
	public List<ProductVO> getHistoryProduct(String odrId) {
		return dao.getHistoryProduct(odrId);
	}
	
	@Override
	public OdrVO getOrder( String odr_id ) {
		return dao.getOrder(odr_id);
	}
	
	@Override
	public List<OdrVO> getOrderListBeforePacking() {
		return dao.getOrderListBeforePacking();
	}

	@Override
	public DetailVO getOrderDetail(String odr_id) {
		return dao.getOrderDetail(odr_id);
	}
	
	@Override
	public List<DetailVO> getOrderDetailList( String odr_id ) {
		return dao.getOrderDetailList(odr_id);
	}

	@Override
	public List<OdrVO> getOrderListAfterPacking() {
		return dao.getOrderListAfterPacking();
	}

	@Override
	public void odrPackComplete(String odr_id) {
		dao.odrPackComplete(odr_id);
	}

	@Override
	public void odrPickupComplete(String odr_id) {
		dao.odrPickupComplete(odr_id);
	}
	
}
