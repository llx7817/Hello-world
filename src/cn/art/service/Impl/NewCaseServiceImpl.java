package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.ColorMapper;
import cn.art.dao.NewCaseMapper;
import cn.art.dao.TextureMapper;
import cn.art.model.NewCase;
import cn.art.service.NewCaseService;
import cn.art.util.JsonConvert;


@Service("NewCaseService")
public class NewCaseServiceImpl implements NewCaseService {
	private NewCaseMapper newCaseMapper;
	private ColorMapper colorMapper;
	private TextureMapper textureMapper;

	private JsonConvert jsonConvert;
	
	public NewCaseServiceImpl(){
		jsonConvert = new JsonConvert();
	}
	
	public TextureMapper getTextureMapper() {
		return textureMapper;
	}

	public void setTextureMapper(TextureMapper textureMapper) {
		this.textureMapper = textureMapper;
	}
	@Autowired
	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	@Autowired
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}
	public NewCaseMapper getNewCaseMapper() {
		return newCaseMapper;
	}
	@Autowired
	public void setNewCaseMapper(NewCaseMapper newCaseMapper) {
		this.newCaseMapper = newCaseMapper;
	}


	@Override
	public int insert(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insertSelective(record);
	}

	@Override
	public List<NewCase> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKey(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		return newCaseMapper.deleteByPrimaryKey(nid);
	}
	@Override
	public NewCase selectByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByPrimaryKey(nid);
	}
	@Override
	public int update(Integer nid, String newcasename, String newcaseRtotal,
			String newcaseRoutline, String newcaseRcolor,
			String newcaseRtexture, String newcaseAtotal,
			String newcaseAoutline, String newcaseAcolor, String newcaseAtexture) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		newCase.setNid(nid);
		newCase.setNewcasename(newcasename);
		newCase.setNewcasertotal(newcaseRtotal);
		newCase.setNewcaseroutline(newcaseRoutline);
		newCase.setNewcasercolor(newcaseRcolor);
		newCase.setNewcasertexture(newcaseRtexture);
		
		newCase.setNewcaseatotal(newcaseAtotal);
		newCase.setNewcaseaoutline(newcaseAoutline);
		newCase.setNewcaseacolor(newcaseAcolor);
		newCase.setNewcaseatexture(newcaseAtexture);
		
		return newCaseMapper.updateByPrimaryKeySelective(newCase);
	}
	@Override
	public int insertSelect(Integer tid, String newcasename,
			String newcaseRtotal, String newcaseRoutline, String newcaseRcolor,
			String newcaseRtexture, String newcaseAtotal,
			String newcaseAoutline, String newcaseAcolor, String newcaseAtexture) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		
		newCase.setTid(tid);
		newCase.setNewcasename(newcasename);
		newCase.setNewcasertotal(newcaseRtotal);
		newCase.setNewcaseroutline(newcaseRoutline);
		newCase.setNewcasercolor(newcaseRcolor);
		newCase.setNewcasertexture(newcaseRtexture);
		
		newCase.setNewcaseatotal(newcaseAtotal);
		newCase.setNewcaseaoutline(newcaseAoutline);
		newCase.setNewcaseacolor(newcaseAcolor);
		newCase.setNewcaseatexture(newcaseAtexture);
		
		return newCaseMapper.insertSelective(newCase);
	}
	@Override
	public int SaveRecommend(Integer nid, Integer tid, String newcaseimg,
			String newcasercolor, String newcasertexture) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		newCase.setNid(nid);
		newCase.setTid(tid);
		newCase.setNewcaseimg(newcaseimg);
		newCase.setNewcasercolor(newcasercolor);
		newCase.setNewcasertexture(newcasertexture);
		
		return newCaseMapper.insertSelective(newCase);
	}

	@Override
	public String selectByName(String newcasename) {
		// TODO Auto-generated method stub
		List<NewCase> newCases = newCaseMapper.selectByName(newcasename);
		return jsonConvert.list2json(newCases);
	}

	@Override
	public int CountNumByName(String newcasename) {
		// TODO Auto-generated method stub
		return newCaseMapper.CountNumByName(newcasename);
	}

	@Override
	public int InsertRecommendAdjust(Integer tid, String NewCaseArg,
			String recommendRtotal, String recommendRoutline,
			Integer recommendRcolorID, Integer recommendRtextureID,
			String recommendAtotal, String recommendAoutline,
			Integer recommendAcolorID, Integer recommendAtextureID) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		newCase.setTid(tid);
		newCase.setNewcasearg(NewCaseArg);
		
		newCase.setNewcaseroutline(recommendRoutline);
		newCase.setNewcasertotal(recommendRtotal);
		newCase.setNewcasercolorid(recommendRcolorID);
		newCase.setNewcasercolor(colorMapper.selectByPrimaryKey(recommendRcolorID).getCimg());
		newCase.setNewcasertextureid(recommendRtextureID);
		newCase.setNewcasertexture(textureMapper.selectByPrimaryKey(recommendRtextureID).getTimg());
		
		newCase.setNewcaseatotal(recommendAtotal);
		newCase.setNewcaseaoutline(recommendAoutline);
		newCase.setNewcaseacolorid(recommendAcolorID);
		newCase.setNewcaseacolor(colorMapper.selectByPrimaryKey(recommendAcolorID).getCimg());
		newCase.setNewcaseatextureid(recommendAtextureID);
		newCase.setNewcaseatexture(textureMapper.selectByPrimaryKey(recommendAtextureID).getTimg());
		
		return newCaseMapper.insertSelective(newCase);
	}

	@Override
	public String selectNewcaseByTID(Integer tid) {
		// TODO Auto-generated method stub
		List<NewCase> newCases = newCaseMapper.selectByTID(tid);
		return jsonConvert.list2json(newCases);
	}

	@Override
	public String getNewCaseByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		NewCase newCase = newCaseMapper.selectByPrimaryKey(nid);
		return jsonConvert.Bean2Json(newCase);
	}
	
	

}
