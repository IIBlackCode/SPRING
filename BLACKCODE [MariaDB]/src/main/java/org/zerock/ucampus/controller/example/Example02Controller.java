package org.zerock.ucampus.controller.example;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.board.ipChecker.ClientIp;

@Controller
@RequestMapping("/ucampus/example02")
public class Example02Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Example02Controller.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/example02_1", method = RequestMethod.GET)
	public String example02_1(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02_1 : " + clientIp.getClientIP(request));
		return "ucampus/example/example02/example02_1";
	}
	
	@RequestMapping(value = "/example02_2", method = RequestMethod.GET)
	public String example02_2(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02_2 : " + clientIp.getClientIP(request));
		return "ucampus/example/example02/example02_2";
	}
	
	@RequestMapping(value = "/example02_3", method = RequestMethod.GET)
	public String example02_3(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02_3 : " + clientIp.getClientIP(request));
		return "ucampus/example/example02/example02_3";
	}
	
	@RequestMapping(value = "/example02_4", method = RequestMethod.GET)
	public String example02_4(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02_4 : " + clientIp.getClientIP(request));
		return "ucampus/example/example02/example02_4";
	}
	
	@RequestMapping(value = "/example02_5", method = RequestMethod.GET)
	public String example02_5(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02_5 : " + clientIp.getClientIP(request));
		return "ucampus/example/example02/example02_5";
	}
	
}// The end of Class Board Controller
