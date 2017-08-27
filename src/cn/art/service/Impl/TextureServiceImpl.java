package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.TextureMapper;
import cn.art.dao.TextureTypeMapper;
import cn.art.model.Texture;
import cn.art.model.TextureType;
import cn.art.service.TextureService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.textureB;
import cn.art.util.pojo.textureD;

@Service("TextureService")
public class TextureServiceImpl implements TextureService {
	private TextureMapper textureMapper;
	private TextureTypeMapper textureTypeMapper;
	
	private JsonConvert jsonConvert ;
	
	public TextureServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public TextureTypeMapper getTextureTypeMapper() {
		return textureTypeMapper;
	}
	@Autowired
	public void setTextureTypeMapper(TextureTypeMapper textureTypeMapper) {
		this.textureTypeMapper = textureTypeMapper;
	}
	public TextureMapper getTextureMapper() {
		return textureMapper;
	}
	@Autowired
	public void setTextureMapper(TextureMapper textureMapper) {
		this.textureMapper = textureMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer textureid) {
		// TODO Auto-generated method stub
		return textureMapper.deleteByPrimaryKey(textureid);
	}

	@Override
	public int insert(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.insert(record);
	}

	@Override
	public int insertSelective(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.insertSelective(record);
	}

	@Override
	public Texture selectByPrimaryKey(Integer textureid) {
		// TODO Auto-generated method stub
		return textureMapper.selectByPrimaryKey(textureid);
	}

	@Override
	public List<Texture> selectByTIDandTTID(Map map) {
		// TODO Auto-generated method stub
		return textureMapper.selectByTIDandTTID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.updateByPrimaryKey(record);
	}

	@Override
	public String selectTextureD(Integer textureid) {
		// TODO Auto-generated method stub
		Texture texture = textureMapper.selectByPrimaryKey(textureid);
		textureD textureD = new textureD();
		
		textureD.setTdescription(texture.getTdescription());
		textureD.setTextureid(textureid);
		textureD.setTid(texture.getTid());
		textureD.setTtid(texture.getTtid());
		textureD.setTfile(texture.getTfile());
		textureD.setTtname(textureTypeMapper.selectByPrimaryKey(texture.getTtid()).getTtname());
		textureD.setTimg(texture.getTimg());
		textureD.setTimg1(texture.getTimg1());
		textureD.setTimg2(texture.getTimg2());
		textureD.setTimg3(texture.getTimg3());
		textureD.setTimg4(texture.getTimg4());
		
		return jsonConvert.Bean2Json(textureD);
	}

	@Override
	public int update(Integer textureid, String tdescription, String ttname,
			String timg, String timg1, String timg2, String timg3, String timg4) {
		// TODO Auto-generated method stub
		int ttid = textureMapper.selectByPrimaryKey(textureid).getTtid();
		TextureType texturetype = textureTypeMapper.selectByPrimaryKey(ttid);
		texturetype.setTtname(ttname);
		int isok = textureTypeMapper.updateByPrimaryKeySelective(texturetype);
		
		Texture texture = textureMapper.selectByPrimaryKey(textureid);
		texture.setTdescription(tdescription);
		texture.setTimg(timg);
		texture.setTimg1(timg1);
		texture.setTimg2(timg2);
		texture.setTimg3(timg3);
		texture.setTimg4(timg4);
		
		return textureMapper.updateByPrimaryKeySelective(texture);
	}

	@Override
	public int insertSelect(Integer tid, String tdescription, String ttname,
			String timg, String timg1, String timg2, String timg3, String timg4) {
		// TODO Auto-generated method stub
		List<TextureType> textureTypes = textureTypeMapper.selectByTID(tid);
		int ttid = 1;
		for (TextureType textureType : textureTypes) {
			if(ttname.equals(textureType.getTtname())){
				ttid = textureType.getTtid();
				break;
			}
		}
		
		Texture texture = new Texture();
		texture.setTid(tid);
		texture.setTtid(ttid);
		texture.setTdescription(tdescription);
		texture.setTimg(timg);
		texture.setTimg1(timg1);
		texture.setTimg2(timg2);
		texture.setTimg3(timg3);
		texture.setTimg4(timg4);
		
		return textureMapper.insertSelective(texture);
	}

	@Override
	public String selectByName(String tdescription) {
		// TODO Auto-generated method stub
		 List<Texture> textures = textureMapper.selectByName(tdescription);
		return jsonConvert.list2json(textures);
	}

	@Override
	public int CountNumByName(String tdescription) {
		// TODO Auto-generated method stub
		return textureMapper.CountNumByName(tdescription);
	}

	@Override
	public String getTextureBasic(Integer tid) {
		// TODO Auto-generated method stub
		List<textureB> textureBs = new LinkedList<textureB>();
		textureB textureB;
		List<Texture> textures = textureMapper.selectByTID(tid);
		for (Texture texture : textures) {
			textureB = new textureB();
			textureB.setTid(texture.getTid());
			textureB.setTextureid(texture.getTextureid());
			textureB.setTtname(textureTypeMapper.selectByPrimaryKey(texture.getTtid()).getTtname());
			textureB.setTdescription(texture.getTdescription());
			textureB.setTimg(texture.getTimg());
			
			textureBs.add(textureB);
		}
		return jsonConvert.list2json(textureBs);
	}

	@Override
	public String getTextureBasic4(Integer tid) {
		// TODO Auto-generated method stub
		List<textureB> textureBs = new LinkedList<textureB>();
		textureB textureB;
		int i = 0;
		List<Texture> textures = textureMapper.selectByTID(tid);
		for (Texture texture : textures) {
			if(i>=4) break;
			textureB = new textureB();
			textureB.setTid(texture.getTid());
			textureB.setTextureid(texture.getTextureid());
			textureB.setTtname(textureTypeMapper.selectByPrimaryKey(texture.getTtid()).getTtname());
			textureB.setTdescription(texture.getTdescription());
			textureB.setTimg(texture.getTimg());
			
			textureBs.add(textureB);
			i++;
		}
		return jsonConvert.list2json(textureBs);
	}

}
