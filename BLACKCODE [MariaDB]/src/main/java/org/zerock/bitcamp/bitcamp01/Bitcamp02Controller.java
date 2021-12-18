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
@RequestMapping("/bitcamp/bitcamp02")
public class Bitcamp02Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Bitcamp02Controller.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/css01", method = RequestMethod.GET)
	public ModelAndView css01(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css01");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css02", method = RequestMethod.GET)
	public ModelAndView css02(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css02 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css02");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css03", method = RequestMethod.GET)
	public ModelAndView css03(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css03 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css03");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css04", method = RequestMethod.GET)
	public ModelAndView css04(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css04 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css04");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css05", method = RequestMethod.GET)
	public ModelAndView css05(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css05 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css05");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css06", method = RequestMethod.GET)
	public ModelAndView css06(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css06 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css06");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css07", method = RequestMethod.GET)
	public ModelAndView css07(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css07 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css07");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css08", method = RequestMethod.GET)
	public ModelAndView css08(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css08 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css08");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css09", method = RequestMethod.GET)
	public ModelAndView css09(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css09 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css09");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css10", method = RequestMethod.GET)
	public ModelAndView css10(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css10 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css10");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css11", method = RequestMethod.GET)
	public ModelAndView css11(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css11 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css11");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css12", method = RequestMethod.GET)
	public ModelAndView css12(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css12 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css12");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css13", method = RequestMethod.GET)
	public ModelAndView css13(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css13 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css13");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css14", method = RequestMethod.GET)
	public ModelAndView css14(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css14 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css14");
		return modelAndView;
	}
	
	@RequestMapping(value = "/css15", method = RequestMethod.GET)
	public ModelAndView css15(HttpServletRequest request) throws Exception{
		logger.info("[Controller] css15 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("bitcamp/bitcamp02/css15");
		return modelAndView;
	}
	
}// The end of Class Board Controller
