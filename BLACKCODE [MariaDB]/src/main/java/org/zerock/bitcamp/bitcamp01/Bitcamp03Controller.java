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
@RequestMapping("/bitcamp/bitcamp03")
public class Bitcamp03Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Bitcamp03Controller.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request) throws Exception{
		logger.info("[Controller] loginForm : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp03/loginForm");
		return modelAndView;
	}
	
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public ModelAndView memberList(HttpServletRequest request) throws Exception{
		logger.info("[Controller] memberList : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp03/memberList");
		return modelAndView;
	}
	
	@RequestMapping(value = "/memberRegForm", method = RequestMethod.GET)
	public ModelAndView memberRegForm(HttpServletRequest request) throws Exception{
		logger.info("[Controller] memberRegForm : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp03/memberRegForm");
		return modelAndView;
	}
	
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public ModelAndView myPage(HttpServletRequest request) throws Exception{
		logger.info("[Controller] myPage : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp03/myPage");
		return modelAndView;
	}
	
}// The end of Class Board Controller
