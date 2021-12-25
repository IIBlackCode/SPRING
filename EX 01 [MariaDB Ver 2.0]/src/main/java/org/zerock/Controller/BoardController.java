package org.zerock.Controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardServiceImpl;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardServiceImpl service;
	
	// 게시글 등록 GET
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void boardRegisterGET(BoardVO board, Model model, HttpServletRequest request) throws Exception{
		
		logger.info("[BOARD] _ /register GET");
		
	}// The end of method
	
	
	// 게시글 등록 POST
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String boardRegisterPOST(BoardVO board, Model model, HttpServletRequest request) throws Exception{
		
		logger.info("[BOARD] _ /register POST");
		logger.info("board : "+board.toString());
		
		service.regist(board);
		
		model.addAttribute("result","SUCCESS");
//		return "/board/success";
		return "redirect:/board/listAll";
		
	}// The end of method
	
	
	// 게시판 LIST 조회
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{

		logger.info("[BOARD] _ /listAll GET");
		
		model.addAttribute("list", service.listAll());
	
	}// The end of method
	
	// 게시판 읽기
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		
		logger.info("[BOARD] _ /read GET");
		
		model.addAttribute(service.read(bno));
		
	}// The end of method
}// The end of class
