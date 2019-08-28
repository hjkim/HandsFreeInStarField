package com.sinc.hfsf.basket.vo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.hfsf.qr.vo.QrVO;

@Repository
public class ProductDAO {

	@Resource
	private SqlSession session;

	public List<ProductVO> getProductList(ProductVO paramVO) {
		return session.selectList("product.getProductList", paramVO);
	}

	public void insertOrders(List<ProductVO> list) {
		session.insert("product.insertOrders", list);
		
	}

	public String generateOdrId() {
		return session.selectOne("product.generateOdrId");
	}

	public void insertOrderRequest(OdrVO odrVO) {
		session.insert("product.insertOrderRequest", odrVO);
	}

	public List<ProductVO> getProductList(List<ProductVO> paramList) {
		return session.selectList("product.getProductListList", paramList);
	}
	
}
