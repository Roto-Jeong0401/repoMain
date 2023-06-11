package cmnMain.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cmnMain.DAO.CmnMainDAO;
import cmnMain.Service.CmnMainService;
import cmnMain.Service.CmnMainVO;

@Controller
public class CmnMainController {
	

	@Resource(name = "cmnService")
	private CmnMainService cmnService;

	
	@RequestMapping(value = "/reqUrl.do")
	public String selectReqUrl(@ModelAttribute("cmnVO") CmnMainVO cmnVO, ModelMap model) throws Exception {
		
		List<EgovMap> resultList = cmnService.selectTargetUrl(cmnVO);
		
		System.out.println(resultList);
		String URL = (String) resultList.get(0).get("urlStr");
		
		return "redirect:http://"+URL;
		
	}
}