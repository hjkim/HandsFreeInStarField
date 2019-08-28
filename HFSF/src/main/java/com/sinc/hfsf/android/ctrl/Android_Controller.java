package com.sinc.hfsf.android.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinc.hfsf.android.service.Android_Service;

@Controller
@RequestMapping("/aroid")
public class Android_Controller {
	
	@Resource(name="mobile_service")
	private Android_Service service;
	
}
