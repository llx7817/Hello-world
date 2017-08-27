package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.ColorService;
import cn.art.service.OutLineService;
import cn.art.service.PartService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;


@Controller
@RequestMapping("facade/code")
public class U_codingController {
	private TypeService typeService;
	private OutLineService outLineService;
	private ColorService colorService;
	private PartService partService;
	private TextureService textureService;
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	
	//编码案列库 默认接口
	@RequestMapping("")
	public String codeingDefault(HttpServletRequest request){
		String types = typeService.getOnlyIdandName();
		request.setAttribute("types", types);
		
		//获取默认的第一个物件类型的id号
		int tid = typeService.getFirstTid();
		
		String TBianma = typeService.selectByPrimaryKey(tid).getTbianma();
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		request.setAttribute("TBianma", TBianma);
		request.setAttribute("TIcon", TIcon);
		
		String colors = colorService.getColorBasic4(tid);
		String outlines = outLineService.selectOutlineB4(tid);
		String parts = partService.getPartBasic4(tid);
		String textures = textureService.getTextureBasic4(tid);
		request.setAttribute("colors", colors);
		request.setAttribute("outlines", outlines);
		request.setAttribute("parts", parts);
		request.setAttribute("textures", textures);
		
		return "";
	}
	
	//编码案列库 类型分类详细 接口
	@RequestMapping("{tid}")
	public String codeingtypeClassify(@PathVariable Integer tid,HttpServletRequest request){
		
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		request.setAttribute("TIcon", TIcon);
		
		String colors = colorService.getColorBasic4(tid);
		String outlines = outLineService.selectOutlineB4(tid);
		String parts = partService.getPartBasic4(tid);
		String textures = textureService.getTextureBasic4(tid);
		request.setAttribute("colors", colors);
		request.setAttribute("outlines", outlines);
		request.setAttribute("parts", parts);
		request.setAttribute("textures", textures);
		
		return "";
	}
	
	//"加载更多"  接口
	@RequestMapping("{tid}/{xmore}")
	public String codeingAddMore(@PathVariable Integer tid,@PathVariable String xmore,HttpServletRequest request){
		
		if("outline".equals(xmore)){
			String outlines = outLineService.getOutlineB(tid);
			request.setAttribute("outlines", outlines);
			
		}else if("color".equals(xmore)){
			String colors = colorService.getColorBasic(tid);
			request.setAttribute("colors", colors);
			
		}else if("part".equals(xmore)){
			String parts = partService.getPartBasic(tid);
			request.setAttribute("parts", parts);
			
		}else if("texture".equals(xmore)){
			String textures = textureService.getTextureBasic(tid);
			request.setAttribute("textures", textures);
			
		}else{
			request.setAttribute("errorMessage", "请正确填写加载更多信息的物件类型");
		}
		
		return "";
	}
	
	//"详细信息"接口
	@RequestMapping("detail/{xmore}/{xid}")
	public String codeingAddMore(@PathVariable String xmore,@PathVariable Integer xid,HttpServletRequest request){
		
		if("outline".equals(xmore)){
			String outline = outLineService.selectD(xid);
			request.setAttribute("outline", outline);
			
		}else if("color".equals(xmore)){
			String color = colorService.selectColorD(xid);
			request.setAttribute("color", color);
			
		}else if("part".equals(xmore)){
			String part = partService.selectPartD(xid);
			request.setAttribute("part", part);
			
		}else if("texture".equals(xmore)){
			String texture = textureService.selectTextureD(xid);
			request.setAttribute("texture", texture);
			
		}else{
			request.setAttribute("errorMessage", "请正确填写详细信息的物件类型和id号");
		}
		
		return "manager/testlogin";
	}

}
