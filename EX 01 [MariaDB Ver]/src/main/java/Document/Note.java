package Document;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/patchnote")
public class Note {
	
	private static final Logger logger = LoggerFactory.getLogger(Note.class);
	
	ClientIp clientIp = new ClientIp();
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public ModelAndView patchNote(HttpServletRequest request) throws Exception{
		logger.info("[Controller] patchNote : " +clientIp.getClientIP(request));
		modelAndView.setViewName("PatchNote");
		return modelAndView;
	}

}
