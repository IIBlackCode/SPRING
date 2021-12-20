package org.zerock.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.board.domain.PageMaker;
import org.zerock.board.domain.SearchCriteria;
import org.zerock.board.service.IBoardService;

@Controller
@RequestMapping("/sboard/*")
public class SearchBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchBoardController.class);
	
	@Inject
	private IBoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("criteria") SearchCriteria criteria, Model model) throws Exception{
		
		logger.info("[Controller - SearchBoardController] listPage");
		logger.info("[criteria] >>>>>>>>"+criteria.toString());
		
		model.addAttribute("list", boardService.boardListCriteria(criteria));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
		
		pageMaker.setTotalCount(boardService.boardListCountCriteria(criteria));
		model.addAttribute("pageMaker",pageMaker);
	}
	
}
