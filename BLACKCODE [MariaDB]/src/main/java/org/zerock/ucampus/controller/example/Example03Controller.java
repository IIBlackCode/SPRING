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
@RequestMapping("/ucampus/example03")
public class Example03Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Example03Controller.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/example03_1", method = RequestMethod.GET)
	public ModelAndView example03_1(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example03_1 : " + clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example03/example03_1");
		return modelAndView;
	}
	
	@RequestMapping(value = "/example03_2", method = RequestMethod.GET)
	public ModelAndView example03_2(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] example03_2  : " + clientIp.getClientIP(request));
		modelAndView.setViewName("ucampus/example/example03/example03_2");
		return modelAndView;
	}
	
}// The end of Class Board Controller
