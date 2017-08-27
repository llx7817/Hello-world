package cn.art.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.BottomCaseService;
import cn.art.service.TypeService;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("facade/infrastructure")
public class U_bottomController {
	private BottomCaseService bottomCaseService;
	private TypeService typeService;

	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public BottomCaseService getBottomCaseService() {
		return bottomCaseService;
	}
	@Autowired
	public void setBottomCaseService(BottomCaseService bottomCaseService) {
		this.bottomCaseService = bottomCaseService;
	}
	
	//底层案列库  默认接口
	@RequestMapping("")
	public String bottomdefault(HttpServletRequest request){
		String types = typeService.getOnlyIdandName();
		request.setAttribute("types", types);
		
		List<typeIdName> typeIdNames = typeService.selectAllOnlyIdandName();
		
		//取出默认第一个物件类型的tid
		int tid = typeService.getFirstTid();
		
		String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TAnli = typeService.selectByPrimaryKey(tid).getTanli();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TAnli", TAnli);
		
		String bottomcases = bottomCaseService.selectBottomcaseBByTID(tid);
		request.setAttribute("bottomcases", bottomcases);
		
		return "manager/testlogin";
	}
	
	//底层案列库 类型分类接口
	@RequestMapping("{tid}")
	public String bottomTypedetail(@PathVariable Integer tid,HttpServletRequest request){
		
		String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TAnli = typeService.selectByPrimaryKey(tid).getTanli();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TAnli", TAnli);
		
		String bottomcases = bottomCaseService.selectBottomcaseBByTID(tid);
		request.setAttribute("bottomcases", bottomcases);
		return "manager/testlogin";
	}
	/*
	//底层案列 详细信息接口(比如"21070411a")
	@RequestMapping("bottomcase/{bcid}")
	public void bottomCasedetail(@PathVariable Integer bcid,HttpServletRequest request){
		
		String bottomcase = bottomCaseService.selectBottomcaseDByBCTID(bcid);
		request.setAttribute("bottomcase", bottomcase);
		//return "";
	}
	*/
	//底层案列 详细信息接口(比如"21070411a")
		@RequestMapping("bottomcase/{bcid}")
		public void bottomCasedetail(@PathVariable Integer bcid,
				HttpServletResponse response) throws IOException{
			
			String bottomcase = bottomCaseService.selectBottomcaseDByBCTID(bcid);
			response.getWriter().println(bottomcase);
			//request.setAttribute("bottomcase", bottomcase);
			//return "";
		}

}
