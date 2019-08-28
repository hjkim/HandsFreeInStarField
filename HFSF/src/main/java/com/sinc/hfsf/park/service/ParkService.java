package com.sinc.hfsf.park.service;

import java.util.List;

import com.sinc.hfsf.park.vo.ParkVO;
import com.sinc.hfsf.user.vo.CustomerVO;


public interface ParkService {

	public List<ParkVO> getParkList(ParkVO paramVO);

}
