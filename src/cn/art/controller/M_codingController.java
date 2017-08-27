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

import cn.art.model.Color;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.model.Part;
import cn.art.model.Texture;
import cn.art.service.ColorService;
import cn.art.service.ColorTypeService;
import cn.art.service.OutLineService;
import cn.art.service.OutLineTypeService;
import cn.art.service.PartService;
import cn.art.service.PartTypeService;
import cn.art.service.TextureService;
import cn.art.service.TextureTypeService;
import cn.art.service.TypeService;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.codecase;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/code")
public class M_codingController {
	
	private TypeService typeService;
	private OutLineTypeService outLineTypeService;
	private OutLineService outLineService;
	private ColorTypeService colorTypeService;
	private ColorService colorService;
	private PartTypeService partTypeService;
	private PartService partService;
	private TextureTypeService textureTypeService;
	private TextureService textureService;
	private WordService wordService;

	private JsonConvert jsonConvert;
	
	public M_codingController(){
		jsonConvert = new JsonConvert();
	}
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public OutLineTypeService getOutLineTypeService() {
		return outLineTypeService;
	}
	@Autowired
	public void setOutLineTypeService(OutLineTypeService outLineTypeService) {
		this.outLineTypeService = outLineTypeService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public ColorTypeService getColorTypeService() {
		return colorTypeService;
	}
	@Autowired
	public void setColorTypeService(ColorTypeService colorTypeService) {
		this.colorTypeService = colorTypeService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public PartTypeService getPartTypeService() {
		return partTypeService;
	}
	@Autowired
	public void setPartTypeService(PartTypeService partTypeService) {
		this.partTypeService = partTypeService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public TextureTypeService getTextureTypeService() {
		return textureTypeService;
	}
	@Autowired
	public void setTextureTypeService(TextureTypeService textureTypeService) {
		this.textureTypeService = textureTypeService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	
	
	//编码案例库（默认接口(xx/轮廓编码/xx型)）
	@RequestMapping("")
	public String facadeCoding(HttpServletRequest request){
		List<typeIdName> type1 = typeService.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(type1));
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<OutLineType> outLineTypes = outLineTypeService.selectByTID(tid);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));
		
		//确认默认的轮廓类型ID
		int otid = 1;
		for (OutLineType outLineType:outLineTypes) {
			otid = outLineType.getOtid();
			break;
		}
		
		Map<String, Integer> map = new HashMap<>();
		map.put("tid", tid);
		map.put("otid", otid);
		List<OutLine> outLines = outLineService.selectByTIDandOTID(map);
		
		codecase code;
		List<codecase> codes = new LinkedList<>();
		for(OutLine outLine:outLines){
			code = new codecase();
			code.setCaseName(outLine.getOdescription());
			code.setCodeID(outLine.getOid());
			code.setCodeTypeID(otid);
			code.setTID(tid);
			codes.add(code);
		}
		
		request.setAttribute("codecases", jsonConvert.list2json(codes));
		return "manager/testlogin";
	}
	
	//编码案例库 编码类型明细接口
	@RequestMapping("{tid}/{codeType}/{xid}")
	public String facadeCodingDetail(@PathVariable int tid,@PathVariable String codeType,@PathVariable int xid,HttpServletRequest request){
		codecase code;
		if("outline".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("otid", xid);
			List<OutLine> outLines = outLineService.selectByTIDandOTID(map);
			
			
			List<codecase> codes = new LinkedList<>();
			for(OutLine outLine:outLines){
				code = new codecase();
				code.setCaseName(outLine.getOdescription());
				code.setCodeID(outLine.getOid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}else if("part".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("pbid", xid);
			List<Part> parts = partService.selectByTIDandPBID(map);
			
			List<codecase> codes = new LinkedList<>();
			for(Part part:parts){
				code = new codecase();
				code.setCaseName(part.getPdescription());
				code.setCodeID(part.getPid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		else if("color".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("cbid", xid);
			List<Color> colors = colorService.selectByTIDandCBID(map);
			
			List<codecase> codes = new LinkedList<>();
			for(Color color:colors){
				code = new codecase();
				code.setCaseName(color.getCdescription());
				code.setCodeID(color.getCid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		else if("texture".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("ttid", xid);
			List<Texture>  textures = textureService.selectByTIDandTTID(map);

			List<codecase> codes = new LinkedList<>();
			for(Texture texture:textures){
				code = new codecase();
				code.setCaseName(texture.getTdescription());
				code.setCodeID(texture.getTextureid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		return "manager/testlogin";
	}
	
	//编码案例库 编辑接口
	@RequestMapping("edit/{codeType}/{id}")
	public String facadeCodingEdit(@PathVariable String codeType,@PathVariable int id,HttpServletRequest request){
		if("outline".equals(codeType)){
			String outLine = outLineService.selectD(id);
			request.setAttribute("outline", outLine);
			
		}else if("part".equals(codeType)){
			String part = partService.selectPartD(id);
			request.setAttribute("part", part);
			
		}else if("color".equals(codeType)){
			String  color = colorService.selectColorD(id);
			request.setAttribute("color", color);
			
		}else if("texture".equals(codeType)){
			String  texture = textureService.selectTextureD(id);
			request.setAttribute("texture", texture);
		}
		
		return "manager/testlogin";
	}
	
	
	//                        编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//编码案例库 编辑保存接口
	@RequestMapping("edit/{codeType}/{id}/confirm")
	public String facadeCodingEditSave(@PathVariable String codeType,@PathVariable Integer id,HttpServletRequest request){
		String cname = request.getParameter("cname");
		String ctypename = request.getParameter("ctypename");
		String cdate = request.getParameter("cdate");
		String cimg = request.getParameter("cimg");
		String cimg1 = request.getParameter("cimg1");
		String cimg2 = request.getParameter("cimg2");
		String cimg3 = request.getParameter("cimg3");
		String cimg4 = request.getParameter("cimg4");
		
		if("outline".equals(codeType)){
			int isok = outLineService.update(id, cname.trim(), ctypename, cdate.trim(), cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("outline_status", 200);
			}else{
				request.setAttribute("outline_status", 100);
				request.setAttribute("outline_erroeMesage", cname+"编辑保存失败");
			}
		}else if("part".equals(codeType)){
			int isok = partService.update(id, cname.trim(), ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("part_status", 200);
			}else{
				request.setAttribute("part_status", 100);
				request.setAttribute("part_erroeMesage", cname+"编辑保存失败");
			}
			
		}else if("color".equals(codeType)){
			int isok = colorService.update(id, cname.trim(), ctypename, cdate.trim(), cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("color_status", 200);
			}else{
				request.setAttribute("color_status", 100);
				request.setAttribute("color_erroeMesage", cname+"编辑保存失败");
			}
			
		}else if("texture".equals(codeType)){
			int isok = textureService.update(id, cname.trim(), ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("texture_status", 200);
			}else{
				request.setAttribute("texture_status", 100);
				request.setAttribute("texture_erroeMesage", cname+"编辑保存失败");
			}
		}
		
		return "manager/testlogin";
	}
	
	//编码案例库 添加新案例接口
	@RequestMapping("addCase/{tid}/{codeType}")
	public String facadeCodingAddCase(@PathVariable int tid,@PathVariable String codeType,@PathVariable String codecase,HttpServletRequest request){
		String cname = request.getParameter("cname");
		String ctypename = request.getParameter("ctypename");
		String cdate = request.getParameter("cdate");
		String cimg = request.getParameter("cimg");
		String cimg1 = request.getParameter("cimg1");
		String cimg2 = request.getParameter("cimg2");
		String cimg3 = request.getParameter("cimg3");
		String cimg4 = request.getParameter("cimg4");
		
		if("outline".equals(codeType)){
			int isok = outLineService.insertSelect(tid, cname, ctypename, cdate, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("outline_status", 200);
			}else{
				request.setAttribute("outline_status", 100);
				request.setAttribute("outline_erroeMesage", cname+"新案例添加失败");
			}
			
		}else if("part".equals(codeType)){
			int isok = partService.insertSelect(tid, cname, ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("part_status", 200);
			}else{
				request.setAttribute("part_status", 100);
				request.setAttribute("part_erroeMesage", cname+"新案例添加失败");
			}
			
		}else if("color".equals(codeType)){
			int isok = colorService.insertSelect(tid, cname, ctypename, cdate, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("color_status", 200);
			}else{
				request.setAttribute("color_status", 100);
				request.setAttribute("color_erroeMesage", cname+"新案例添加失败");
			}
			
		}else if("texture".equals(codeType)){
			int isok = textureService.insertSelect(tid, cname, ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if(isok==1){
				request.setAttribute("texture_status", 200);
			}else{
				request.setAttribute("texture_status", 100);
				request.setAttribute("texture_erroeMesage", cname+"新案例添加失败");
			}
			
		}
		
		return "manager/testlogin";
	}
	
	
		
		
		
	/*	                               删除接口  该功能模块风险较大 很容易对数据库造成不可估量的风险  咱不对外提供
	//编码案例库 删除接口
	@RequestMapping("delete/{codeType}/{id}")
	public String facadeCodingEditDelete(@PathVariable String codeType,@PathVariable int id,HttpServletRequest request){
		if("outline".equals(codeType)){
			int isDelete = outLineService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "轮廓编码删除失败");
			}
			
			
		}else if("part".equals(codeType)){
			int isDelete = partService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "部件编码删除失败");
			}
			
		}else if("color".equals(codeType)){
			int isDelete = colorService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "色彩编码删除失败");
			}
			
		}else if("texture".equals(codeType)){
			int isDelete = textureService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "材质编码删除失败");
			}
		}
		
		return "manager/testlogin";
	}
	*/
	
	
}
