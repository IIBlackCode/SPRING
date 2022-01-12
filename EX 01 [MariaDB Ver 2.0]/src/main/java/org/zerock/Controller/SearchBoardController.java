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
import org.zerock.domain.SearchCriteria;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/sboard/*")
public class SearchBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchBoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		
		logger.info("test",cri.toString());
		
//		model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		
//		pageMaker.setTotalCount(service.listCountCriteria(cri));
		pageMaker.setTotalCount(service.listSearchCount(cri));
		
		model.addAttribute("pageMaker", pageMaker);
		
	}// The end of Method
	
	// 게시글 읽기
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") SearchCriteria cri,Model model) throws Exception{
		
		logger.info("[BOARD] _ /read GET : ",bno);
		
		model.addAttribute(service.read(bno));
		
	}// The end of method
	
	// 게시글 삭제
	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, SearchCriteria cri, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /remove POST : ",bno);
		
		service.remove(bno);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum",cri.getPerPageNum());
		rttr.addAttribute("searchType",cri.getSearchType());
		rttr.addAttribute("keyword",cri.getKeyword());
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/sboard/list";
	}// The end of method
	
	// 게시글 수정페이지 읽기
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(int bno, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		
		logger.info("[BOARD] _ /modifyPage GET : ",bno);
		
		model.addAttribute(service.read(bno));
	}// The end of method
	
	// 게시글 수정
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST(BoardVO board, SearchCriteria cri, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /modifyPage POST : ",cri.toString());
		service.modify(board);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum",cri.getPerPageNum());
		rttr.addAttribute("searchType",cri.getSearchType());
		rttr.addAttribute("keyword",cri.getKeyword());
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		logger.info(rttr.toString());
		
		return "redirect:/sboard/list";
	}// The end of method
	
	// 게시글 등록 GET
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET() throws Exception{
		
		logger.info("[BOARD] _ /register GET");
		
	}// The end of method
	
	
	// 게시글 등록 POST
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		
		logger.info("[BOARD] _ /register POST");
		logger.info("board : "+board.toString());
		
		service.regist(board);
		
		rttr.addFlashAttribute("msg", "success");
//		return "/board/success";
		return "redirect:/sboard/list";
		
	}// The end of method
}
