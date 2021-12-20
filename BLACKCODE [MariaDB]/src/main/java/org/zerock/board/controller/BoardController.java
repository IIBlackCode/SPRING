package org.zerock.board.controller;

import java.security.Provider.Service;

import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.board.domain.BoardVO;
import org.zerock.board.domain.Criteria;
import org.zerock.board.domain.PageMaker;
import org.zerock.board.ipChecker.ClientIp;
import org.zerock.board.service.IBoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private IBoardService boardService;
	
//	@RequestMapping(value = "/success", method = RequestMethod.GET)
//	public String success() throws Exception{
//		logger.info("[Controller] success GET");
//		return "redirect:/board/success";
//	}
	
	ClientIp clientIp = new ClientIp();
		
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void boardRegisterGET(BoardVO board, Model model, HttpServletRequest request) throws Exception{
		clientIp.getClientIP(request);
		logger.info("[Controller] register GET : "+clientIp.getClientIP(request));
	}
	
	// POST 방식 : 주소창에 보여지면 안되는 정보 전송시 사용
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String boardRegisterPOST(BoardVO board, Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] register POST ip :"+clientIp.getClientIP(request));
		logger.info(board.toString());
		board.setIp(clientIp.getClientIP(request));
		boardService.boardRegist(board);
		
		model.addAttribute("result", "success");
		
//		return "/board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void boardList(Model model, HttpServletRequest request) throws Exception{
		logger.info("[Controller] boardList : " +clientIp.getClientIP(request));
		model.addAttribute("list", boardService.boardListAll());
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void boardRead(@RequestParam("bno") int bno, Model model) throws Exception{
		logger.info("[Controller] read");
		model.addAttribute(boardService.boardRead(bno));
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String boardRemove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		logger.info("[Controller] remove, 삭제처리는 POST 방식");
		boardService.boardRemove(bno);
		rttr.addAttribute("msg","SUCCESS");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void boardModifyGET(int bno, Model model) throws Exception{
		logger.info("[Controller] modify GET, 게시글 수정 SELECT");
		model.addAttribute(boardService.boardRead(bno));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("[Controller] modify POST, 게시글 수정 UPDATE");
		boardService.boardModify(board);
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void boardListAll(Criteria criteria, Model model) throws Exception{
		logger.info("[Controller] boardListAll, 페이징처리 : " + criteria.toString());
		model.addAttribute("list",boardService.boardListCriteria(criteria));
	}
	
	/*페이징처리된 게시글 리스트 SELECT*/
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void boardListPage(@ModelAttribute("criteria") Criteria criteria, Model model) throws Exception{
		logger.info("[Controller] boardListPage, 페이징처리");
		logger.info("[criteria.getPage()] >>>>"+ criteria.getPage());
		logger.info("[criteria.getPerPageNum()] >>>>"+ criteria.getPerPageNum());
		logger.info("[model] >>>>"+model.toString());
		model.addAttribute("list",boardService.boardListCriteria(criteria));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
		pageMaker.setTotalCount(boardService.boardListCountCriteria(criteria));
//		pageMaker.setTotalCount(11);
		model.addAttribute("pageMaker", pageMaker);
	}
	
	/*페이징처리된 게시글 읽기*/
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void boardReadPage(@RequestParam("bno") int bno,@ModelAttribute("criteria") Criteria criteria, Model model) throws Exception{
		logger.info("[Controller] readPage");
		logger.info("[criteria] :" + criteria.toString());
		logger.info("[bno] :" + bno);
		model.addAttribute(boardService.boardRead(bno));
	}
	
	/*페이징처리된 게시글 수정*/
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void boardModifyPageGET(@RequestParam("bno") int bno, @ModelAttribute("criteria") Criteria criteria, Model model) throws Exception{
		logger.info("[Controller] modifyPage GET, 게시글 수정 SELECT");
		logger.info("[criteria] >>>>" + criteria.getPage());
		model.addAttribute(boardService.boardRead(bno));
	}

	/*페이징처리된 게시글 수정*/
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String boardModifyPagePOST(BoardVO board, Criteria criteria, RedirectAttributes rttr) throws Exception{
		logger.info("[Controller] modifyPage POST, 게시글 수정 UPDATE");
		logger.info("[criteria]" + criteria.toString());
		logger.info("[board]" + board.toString());
		boardService.boardModify(board);
		
		rttr.addAttribute("page",criteria.getPage());
		rttr.addAttribute("perPageNum",criteria.getPerPageNum());
		rttr.addAttribute("msg","SUCCESS");
		
		return "redirect:/board/listPage";
	}
}// The end of Class Board Controller
