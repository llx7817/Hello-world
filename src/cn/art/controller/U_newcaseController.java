package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.ColorService;
import cn.art.service.JWordService;
import cn.art.service.NewCaseService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("facade/newcase")
public class U_newcaseController {
	private TypeService typeService;
	private NewCaseService newCaseService;
	private JWordService jWordService;
	private ColorService colorService;
	private TextureService textureService;
	
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	public JWordService getjWordService() {
		return jWordService;
	}
	@Autowired
	public void setjWordService(JWordService jWordService) {
		this.jWordService = jWordService;
	}
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
	}
	
	//新造型库 默认接口
	@RequestMapping("")
	public String newCasedefault(HttpServletRequest request){
		String types = typeService.getOnlyIdandName();
		request.setAttribute("types", types);
		
		List<typeIdName> typeIdNames = typeService.selectAllOnlyIdandName();
		
		//取出默认第一个物件类型的tid
		int tid = typeService.getFirstTid();
		
		String newcases = newCaseService.selectNewcaseByTID(tid);
		request.setAttribute("newcases", newcases);
		
		String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TZaoxing", TZaoxing);
		
		return "";
	}
	
	//新造型库 类型分类接口
	@RequestMapping("{tid}")
	public String newCaseTypecalssify(@PathVariable Integer tid,HttpServletRequest request){
		
		String newcases = newCaseService.selectNewcaseByTID(tid);
		request.setAttribute("newcases", newcases);
		
		String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TZaoxing", TZaoxing);
		
		return "";
	}
	
	//"调整前后详细展示"  接口
	@RequestMapping("detail/{nid}")
	public String newCaseDetailInfo(@PathVariable Integer nid,HttpServletRequest request){
		
		int tid = newCaseService.selectByPrimaryKey(nid).getTid();
		String jWords = jWordService.getAllJwordByTID(tid);
		request.setAttribute("jWords", jWords);
		
		int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
		request.setAttribute("TWordType", TWordType);
		
		String newcase = newCaseService.getNewCaseByPrimaryKey(nid);
		request.setAttribute("newcase", newcase);
		
		return "";
	}
	
	//推荐信息详情 接口
	@RequestMapping("{detailInfo}/{xid}")
	public void newCaseRecommendInfoDetail(@PathVariable String detailInfo,@PathVariable Integer xid,HttpServletRequest request){
		
		if("color".equals(detailInfo)){
			String color = colorService.selectColorD(xid);
			request.setAttribute("color", color);
			
		}else if("texture".equals(detailInfo)){
			String texture = textureService.selectTextureD(xid);
		}else{
			request.setAttribute("status", "url填写错误");
		}
		
		//return "";
	}

}
