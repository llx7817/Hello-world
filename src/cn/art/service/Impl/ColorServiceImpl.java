package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.ColorMapper;
import cn.art.dao.ColorTypeMapper;
import cn.art.model.Color;
import cn.art.model.ColorType;
import cn.art.service.ColorService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.colorB;
import cn.art.util.pojo.colorD;
@Service("ColorService")
public class ColorServiceImpl implements ColorService {
	private ColorMapper colorMapper;
	private ColorTypeMapper colorTypeMapper;
	
	private JsonConvert jsonConvert ;
	
	public ColorServiceImpl(){
		jsonConvert = new JsonConvert();
	}
	
	public ColorTypeMapper getColorTypeMapper() {
		return colorTypeMapper;
	}
	@Autowired
	public void setColorTypeMapper(ColorTypeMapper colorTypeMapper) {
		this.colorTypeMapper = colorTypeMapper;
	}

	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	@Autowired
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return colorMapper.deleteByPrimaryKey(cid);
	}

	@Override
	public int insert(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.insert(record);
	}

	@Override
	public int insertSelective(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.insertSelective(record);
	}

	@Override
	public Color selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return colorMapper.selectByPrimaryKey(cid);
	}

	@Override
	public List<Color> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return colorMapper.selectByTID(tid);
	}

	@Override
	public List<Color> selectByTIDandCBID(Map map) {
		// TODO Auto-generated method stub
		return colorMapper.selectByTIDandCBID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.updateByPrimaryKey(record);
	}
	@Override
	public String selectColorD(Integer cid) {
		// TODO Auto-generated method stub
		Color color = colorMapper.selectByPrimaryKey(cid);
		colorD colorD = new colorD();
		
		colorD.setCbid(color.getCbid());
		colorD.setCbname(colorTypeMapper.selectByPrimaryKey(color.getCbid()).getCbname());
		colorD.setCdescription(color.getCdescription());
		colorD.setCfile(color.getCfile());
		colorD.setCid(color.getCid());
		colorD.setCnum(color.getCnum());
		colorD.setCrgb(color.getCrgb());
		colorD.setTid(color.getTid());
		colorD.setCimg(color.getCimg());
		colorD.setCimg1(color.getCimg1());
		colorD.setCimg2(color.getCimg2());
		colorD.setCimg3(color.getCimg3());
		colorD.setCimg4(color.getCimg4());
		
		return jsonConvert.Bean2Json(colorD);
	}

	@Override
	public int update(Integer cid, String cdescription, String cbname,
			String crgb, String cimg1, String cimg2, String cimg3, String cimg4) {
		// TODO Auto-generated method stub
		int cbid = colorMapper.selectByPrimaryKey(cid).getCbid();
		ColorType colortype = colorTypeMapper.selectByPrimaryKey(cbid);
		colortype.setCbname(cbname);
		int isok = colorTypeMapper.updateByPrimaryKeySelective(colortype);
		
		Color color = colorMapper.selectByPrimaryKey(cid);
		color.setCdescription(cdescription);
		color.setCrgb(crgb);
		color.setCimg1(cimg1);
		color.setCimg2(cimg2);
		color.setCimg3(cimg3);
		color.setCimg4(cimg4);
		
		return colorMapper.updateByPrimaryKeySelective(color);
	}

	@Override
	public int insertSelect(Integer tid, String cdescription, String cbname,
			String crgb, String cimg1, String cimg2, String cimg3, String cimg4) {
		// TODO Auto-generated method stub
		List<ColorType> colorTypes = colorTypeMapper.selectByTID(tid);
		int cbid = 1;
		for (ColorType colorType : colorTypes) {
			if(cbname.equals(colorType.getCbname())){
				cbid = colorType.getCbid();
				break;
			}
		}
		Color color = new Color();
		color.setCbid(cbid);
		color.setCdescription(cdescription);
		color.setTid(tid);
		color.setCrgb(crgb);
		color.setCimg1(cimg1);
		color.setCimg2(cimg2);
		color.setCimg3(cimg3);
		color.setCimg4(cimg4);
		
		return colorMapper.insertSelective(color);
	}

	@Override
	public String selectByName(String cdescription) {
		// TODO Auto-generated method stub
		List<Color> colors = colorMapper.selectByName(cdescription);
		return jsonConvert.list2json(colors);
	}

	@Override
	public int CountNumByName(String cdescription) {
		// TODO Auto-generated method stub
		return colorMapper.CountNumByName(cdescription);
	}

	@Override
	public String getColorBasic(Integer tid) {
		// TODO Auto-generated method stub
		List<Color> colors = colorMapper.selectByTID(tid);
		List<colorB> colorBs = new LinkedList<colorB>();
		colorB colorB;
		for (Color color : colors) {
			colorB = new colorB();
			colorB.setCid(color.getCid());
			colorB.setTid(color.getTid());
			colorB.setCbname(colorTypeMapper.selectByPrimaryKey(color.getCbid()).getCbname());
			colorB.setCdescription(color.getCdescription());
			colorB.setCimg(color.getCimg());
			
			colorBs.add(colorB);
		}
		return jsonConvert.list2json(colorBs);
	}

	@Override
	public String getColorBasic4(Integer tid) {
		// TODO Auto-generated method stub
		List<Color> colors = colorMapper.selectByTID(tid);
		List<colorB> colorBs = new LinkedList<colorB>();
		colorB colorB;
		int i = 0;
		for (Color color : colors) {
			if(i>=4) break;
			colorB = new colorB();
			colorB.setCid(color.getCid());
			colorB.setTid(color.getTid());
			colorB.setCbname(colorTypeMapper.selectByPrimaryKey(color.getCbid()).getCbname());
			colorB.setCdescription(color.getCdescription());
			colorB.setCimg(color.getCimg());
			
			colorBs.add(colorB);
			i++;
		}
		return jsonConvert.list2json(colorBs);
	}

}
