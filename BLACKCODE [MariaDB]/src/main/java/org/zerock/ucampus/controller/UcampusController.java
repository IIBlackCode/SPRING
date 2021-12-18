package org.zerock.ucampus.controller;

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
@RequestMapping("/ucampus")
public class UcampusController {
	
	private static final Logger logger = LoggerFactory.getLogger(UcampusController.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/example01/home", method = RequestMethod.GET)
	public ModelAndView example01(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example01 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example01/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example02/home", method = RequestMethod.GET)
	public ModelAndView example02(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example02 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example02/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example03/home", method = RequestMethod.GET)
	public ModelAndView example03(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example03 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example03/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example04/home", method = RequestMethod.GET)
	public ModelAndView example04(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example04 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example04/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example05/home", method = RequestMethod.GET)
	public ModelAndView example05(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example05 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example05/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example06/home", method = RequestMethod.GET)
	public ModelAndView example06(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example06 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example06/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example07/home", method = RequestMethod.GET)
	public ModelAndView example07(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example07 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example07/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example08/home", method = RequestMethod.GET)
	public ModelAndView example08(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example08 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example08/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example09/home", method = RequestMethod.GET)
	public ModelAndView example09(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example09 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example09/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example10/home", method = RequestMethod.GET)
	public ModelAndView example10(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example10 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example10/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example11/home", method = RequestMethod.GET)
	public ModelAndView example11(HttpServletRequest request) throws Exception{
		logger.info("[Controller] example11 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example11/home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example12/home", method = RequestMethod.GET)
	public ModelAndView example12(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example12 : " +clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example12/home");
		return modelAndView;
	}
	
}// The end of Class Board Controller
