package com.sinc.hfsf.android.vo;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("mobile_VO")
public class Android_VO {
	
	@Resource(name = "sqlSession")
	private SqlSession session;
}
