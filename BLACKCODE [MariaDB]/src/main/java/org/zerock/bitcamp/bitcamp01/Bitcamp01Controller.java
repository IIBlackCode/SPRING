package org.zerock.bitcamp.bitcamp01;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.board.ipChecker.ClientIp;

@Controller
@RequestMapping("/bitcamp/bitcamp01")
public class Bitcamp01Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Bitcamp01Controller.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/memberRegForm", method = RequestMethod.GET)
	public ModelAndView memberRegForm(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp01/memberRegForm");
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp01/loginForm");
		return modelAndView;
	}
	
}// The end of Class Board Controller
