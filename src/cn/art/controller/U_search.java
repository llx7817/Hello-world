package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.BottomCaseService;
import cn.art.service.ColorService;
import cn.art.service.NewCaseService;
import cn.art.service.OutLineService;
import cn.art.service.PartService;
import cn.art.service.TextureService;

@Controller
@RequestMapping("search")
public class U_search {
	private BottomCaseService bottomCaseService ;
	private PartService partService;
	private ColorService colorService;
	private OutLineService outLineService;
	private TextureService textureService;
	private NewCaseService newCaseService ;


	public BottomCaseService getBottomCaseService() {
		return bottomCaseService;
	}
	@Autowired
	public void setBottomCaseService(BottomCaseService bottomCaseService) {
		this.bottomCaseService = bottomCaseService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}

	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}

	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
	}


	@RequestMapping("facade")
	public String UserSearch(HttpServletRequest request){
		String Xname = request.getParameter("Xname");
		int bottomcasesNum = bottomCaseService.CountNumByName(Xname);
		String  bottomcases = bottomCaseService.selectByName(Xname);
		request.setAttribute("bottomcasesNum", bottomcasesNum);
		request.setAttribute("bottomcases", bottomcases);
		
		int partsNum = partService.CountNumByName(Xname);
		String parts = partService.selectByName(Xname);
		request.setAttribute("partsNum", partsNum);
		request.setAttribute("parts", parts);
		
		int colorsNum = colorService.CountNumByName(Xname);
		String colors = colorService.selectByName(Xname);
		request.setAttribute("colorsNum", colorsNum);
		request.setAttribute("colors", colors);
		
		int outlinesNum = outLineService.CountNumByName(Xname);
		String outlines = outLineService.selectByName(Xname);
		request.setAttribute("outlinesNum", outlinesNum);
		request.setAttribute("outlines", outlines);
		
		int texturesNum = textureService.CountNumByName(Xname);
		String textures = textureService.selectByName(Xname);
		request.setAttribute("texturesNum", texturesNum);
		request.setAttribute("textures", textures);
		
		int newcasesNum = newCaseService.CountNumByName(Xname);
		String newcases = newCaseService.selectByName(Xname);
		request.setAttribute("newcasesNum", newcasesNum);
		request.setAttribute("newcases", newcases);
		
		return "manager/testlogin";
	}
	

}
