package com.sinc.hfsf.result.service;

import java.util.List;

import com.sinc.hfsf.basket.vo.OdrVO;

public interface ResultService {

	List<OdrVO> getOdrResult(String odrId);

}
