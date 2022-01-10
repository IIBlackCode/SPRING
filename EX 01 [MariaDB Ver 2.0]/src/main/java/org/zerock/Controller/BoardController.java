package org.zerock.Controller;

import javax.inject.Inject;
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
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageMaker;
import org.zerock.service.BoardServiceImpl;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// 게시글 등록 GET
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void boardRegisterGET(BoardVO board, Model model, HttpServletRequest request) throws Exception{
		
		logger.info("[BOARD] _ /register GET");
		
	}// The end of method
	
	
	// 게시글 등록 POST
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String boardRegisterPOST(BoardVO board, Model model, HttpServletRequest request, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /register POST");
		logger.info("board : "+board.toString());
		
		service.regist(board);
		
		model.addAttribute("result","SUCCESS");
		
		rttr.addFlashAttribute("msg", "success");
//		return "/board/success";
		return "redirect:/board/listAll";
		
	}// The end of method
	
	
	// 게시판 LIST 조회
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{

		logger.info("[BOARD] _ /listAll GET");
		
		model.addAttribute("list", service.listAll());
	
	}// The end of method
	
	// 게시글 읽기
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri,Model model) throws Exception{
		
		logger.info("[BOARD] _ /read GET : ",bno);
		
		model.addAttribute(service.read(bno));
		
	}// The end of method
	
	// 게시글 삭제
	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, Criteria cri, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /remove POST : ",bno);
		
		service.remove(bno);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum",cri.getPerPageNum());
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listPage";
	}// The end of method
	
	// 게시글 수정페이지 읽기
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("bno") int bno, Model model) throws Exception{
		
		logger.info("[BOARD] _ /modify GET : ",bno);
		
		model.addAttribute(service.read(bno));
		
	}// The end of method
	
	// 게시글 수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, Model model, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /modify POST : ",board);
		
		service.modify(board);
		
		rttr.addFlashAttribute("msg", "success");
		
		return "redirect:/board/listAll";
	}// The end of method
	
	// 페이징처리
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listAll(Criteria cri, Model model) throws Exception{

		logger.info("[BOARD] _ /listAll_Criteria GET",cri.toString());
		
		model.addAttribute("list", service.listCriteria(cri));
	
	}// The end of method
	
	// 페이징처리
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(Criteria cri, Model model) throws Exception{
		
		System.out.println("[BOARD] _ /listPage GET" + cri.toString());
		
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		//pageMaker.setTotalCount(101);								// TEST 데이터 131개
		pageMaker.setTotalCount(service.listCountCriteria(cri));	// 실제 데이터 개수 조회
		System.out.println(pageMaker.toString());
		 
		model.addAttribute("pageMaker", pageMaker);
		
	}// The end of method
	
	// 게시글 수정페이지 읽기
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(BoardVO board ,@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		
		logger.info("[BOARD] _ /modifyPage GET : ",bno);
		
		service.read(bno);
		model.addAttribute(service.read(bno));
	}// The end of method
	
	// 게시글 수정
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, Criteria cri, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /modify POST : ",board);
		
		service.modify(board);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum",cri.getPerPageNum());
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listPage";
	}// The end of method
}// The end of class
