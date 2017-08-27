package cn.art.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.BottomCase;
import cn.art.model.BottomCaseType;
import cn.art.service.BottomCaseService;
import cn.art.service.BottomCaseTypeService;
import cn.art.service.TypeService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.codecase;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/bottom")
public class M_bottomController {
	
	private TypeService typeService;
	private BottomCaseService bottomCaseService;
	private BottomCaseTypeService bottomCaseTypeService;
	
	private JsonConvert jsonConvert ;
	public M_bottomController(){
		jsonConvert = new JsonConvert();
	}
	
	public BottomCaseService getBottomCaseService() {
		return bottomCaseService;
	}
	@Autowired
	public void setBottomCaseService(BottomCaseService bottomCaseService) {
		this.bottomCaseService = bottomCaseService;
	}

	public BottomCaseTypeService getBottomCaseTypeService() {
		return bottomCaseTypeService;
	}
	@Autowired
	public void setBottomCaseTypeService(BottomCaseTypeService bottomCaseTypeService) {
		this.bottomCaseTypeService = bottomCaseTypeService;
	}

	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	
	//底层案例库 (外观库默认接口  )
	@RequestMapping("")
	public String facadeBottom(HttpServletRequest request){
		List<typeIdName> type1 = typeService.selectAllOnlyIdandName();
		System.out.println("haohaode");
		request.setAttribute("types", jsonConvert.list2json(type1));
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeService.selectByTID(tid);
		request.setAttribute("bottomtypes", jsonConvert.list2json(bottomCaseTypes));
		//确认默认的底层类型ID
		int bctid = 1;
		for (BottomCaseType bottomCaseType:bottomCaseTypes) {
			bctid = bottomCaseType.getBctid();
			break;
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tid", tid);
		map.put("bctid", bctid);
		
		List<BottomCase> bottomCases = bottomCaseService.selectByTIDandBCTID(map);
		
		codecase code;
		List<codecase> codes = new LinkedList<>();
		for(BottomCase bottomCase:bottomCases){
			code = new codecase();
			code.setCaseName(bottomCase.getCasename());
			code.setCodeID(bottomCase.getBcid());
			code.setCodeTypeID(bctid);
			code.setTID(tid);
			codes.add(code);
		}
		request.setAttribute("codecases", jsonConvert.list2json(codes));
		
		return "manager/testlogin";
	}
	
	
	//底层案例库 底层案例明细接口
	@RequestMapping("{tid}/{bctid}")
	public String facadeBottomDetail(@PathVariable int tid,@PathVariable int bctid,HttpServletRequest request){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tid", tid);
		map.put("bctid", bctid);
		List<BottomCase> bottomCases = bottomCaseService.selectByTIDandBCTID(map);
		
		codecase code = new codecase();
		List<codecase> codecases = new LinkedList<>();
		for(BottomCase bottomCase:bottomCases){
			code.setCaseName(bottomCase.getCasename());
			code.setCodeID(bottomCase.getBcid());
			code.setCodeTypeID(bottomCase.getBctid());
			code.setTID(bottomCase.getTid());
			codecases.add(code);
		}
		request.setAttribute("codecases", jsonConvert.list2json(codecases));
		
		
		return "manager/testlogin";
	}
	
	//底层案例库 编辑接口
	@RequestMapping("edit/{bcid}")
	public String facadeBottomEdit(@PathVariable int bcid,HttpServletRequest request){
		BottomCase bottomCase = bottomCaseService.selectByPrimaryKey(bcid);
		request.setAttribute("bottomcase", bottomCase);
		
		
		return "manager/testlogin";
	}
	
	
    //                       编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//底层案例库 编辑保存接口 
	@RequestMapping("edit/{bcid}/confirm")
	public String facadeBottomEditSave(@PathVariable int bcid,HttpServletRequest request){
		String casename = request .getParameter("CaseName");
		String casebrand = request.getParameter("CaseBrand");
		String bctname = request.getParameter("BCTName");
		String caseimg = request.getParameter("CaseImg");
		String caseimg1 = request.getParameter("CaseImg1");
		String caseimg2 = request.getParameter("CaseImg2");
		String caseimg3 = request.getParameter("CaseImg3");
		int isok = bottomCaseService.update(bcid, casename.trim(), casebrand.trim(), bctname.trim(), caseimg, caseimg1, caseimg2, caseimg3);
		if(isok==1){
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("erroeMessage", "底层案例库编辑保存失败");
		}
		return "manager/testlogin";
	}
	
	//底层案例库 添加新案例接口
	@RequestMapping("addCase/{tid}")
	public String facadeBottomAddCase(@PathVariable int tid,HttpServletRequest request){
		String casename = request .getParameter("CaseName");
		String casebrand = request.getParameter("CaseBrand");
		String bctname = request.getParameter("BCTName");
		String caseimg = request.getParameter("CaseImg");
		String caseimg1 = request.getParameter("CaseImg1");
		String caseimg2 = request.getParameter("CaseImg2");
		String caseimg3 = request.getParameter("CaseImg3");
		bottomCaseService.insertselect(tid, casename.trim(), casebrand.trim(), bctname.trim(), caseimg, caseimg1, caseimg2, caseimg3);
		
		return "manager/testlogin";
	}

		
		
		
	/*	                               删除接口  该功能模块风险较大 很容易对数据库造成不可估量的风险  咱不对外提供
	//底层案例库 删除接口 
	@RequestMapping("delete/{BCID}")
	public String facadeBottomDelete(@PathVariable int bcid,HttpServletRequest request){
		int isDelete = bottomCaseService.deleteByPrimaryKey(bcid);
		if(isDelete==1){
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("erroeMessage", "底层案例删除失败");
		}
		
		return "manager/testlogin";
	}	
	*/
		
		
}
