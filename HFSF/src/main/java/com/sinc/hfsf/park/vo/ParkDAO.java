package com.sinc.hfsf.park.vo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.hfsf.user.vo.CustomerVO;

@Repository
public class ParkDAO {

	@Resource
	private SqlSession session;
	
	public List<ParkVO> getParkList(ParkVO paramVO)  {
		return session.selectList("park.getParkList", paramVO);
	}

}
