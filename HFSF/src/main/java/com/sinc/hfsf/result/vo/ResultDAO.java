package com.sinc.hfsf.result.vo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.hfsf.basket.vo.OdrVO;

@Repository
public class ResultDAO {
	
	@Resource
	private SqlSession session;

	public List<OdrVO> getOdrResult(String odrId) {
		return session.selectList("product.getOrder",odrId);
	}

}
