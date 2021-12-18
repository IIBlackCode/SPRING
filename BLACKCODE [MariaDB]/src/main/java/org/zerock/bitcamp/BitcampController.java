package org.zerock.bitcamp;

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
@RequestMapping("/bitcamp")
public class BitcampController {
	
	private static final Logger logger = LoggerFactory.getLogger(BitcampController.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/bitcamp01", method = RequestMethod.GET)
	public ModelAndView example01(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp01/index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/bitcamp02", method = RequestMethod.GET)
	public ModelAndView bitcamp02(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/bitcamp03", method = RequestMethod.GET)
	public ModelAndView bitcamp03(HttpServletRequest request) throws Exception{
		logger.info("[Controller] bitcamp03 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp03/index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/bitcamp04", method = RequestMethod.GET)
	public ModelAndView bitcamp04(HttpServletRequest request) throws Exception{
		logger.info("[Controller] bitcamp04 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp04/layoutForm");
		return modelAndView;
	}
	
}// The end of Class Board Controller
