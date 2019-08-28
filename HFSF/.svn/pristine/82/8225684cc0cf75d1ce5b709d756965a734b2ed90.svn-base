package com.sinc.hfsf.qr.vo;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class QrDAO {

	@Resource
	private SqlSession session;
	
	public QrVO getQrInfo( String qrid )  {
		return session.selectOne("qr.getQrInfo", qrid);
	}

}
