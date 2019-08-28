package com.sinc.hfsf.qr.vo;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class QrDAO {

	@Resource
	private SqlSession session;
	
	public QrVO getQrInfo( String odr_id )  {
		System.out.println("DAO 들어왓다");
		System.out.println(odr_id);
		return session.selectOne("qr.getQrInfo", odr_id);
	}

}
