package com.sinc.hfsf.admin.vo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.hfsf.Map;

@Repository("adminD")
public class AdminDAO {
	@Resource(name="sqlSession")
	private SqlSession session;
	
	
	public List<AdminVO> printRow() {
		
		return session.selectList("com.sinc.admin.list");
		
	}
	public Map pickupTime() {
		
		return session.selectOne("com.sinc.admin.pickuptime");
	}
	public Map pickupTerm() {
		return session.selectOne("com.sinc.admin.pickupterm");
	}
}
