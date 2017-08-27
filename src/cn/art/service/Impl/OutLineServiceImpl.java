package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.OutLineMapper;
import cn.art.dao.OutLineTypeMapper;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.service.OutLineService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.outlineB;
import cn.art.util.pojo.outlineD;
import cn.art.util.pojo.outlinetypeD;

@Service("OutLineService")
public class OutLineServiceImpl implements OutLineService {
	private OutLineMapper outLineMapper;
	private OutLineTypeMapper outLineTypeMapper;
	
	private JsonConvert jsonConvert;
	
	public OutLineServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public OutLineTypeMapper getOutLineTypeMapper() {
		return outLineTypeMapper;
	}
	@Autowired
	public void setOutLineTypeMapper(OutLineTypeMapper outLineTypeMapper) {
		this.outLineTypeMapper = outLineTypeMapper;
	}
	public OutLineMapper getOutLineMapper() {
		return outLineMapper;
	}
	@Autowired
	public void setOutLineMapper(OutLineMapper outLineMapper) {
		this.outLineMapper = outLineMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return outLineMapper.deleteByPrimaryKey(oid);
	}

	@Override
	public int insert(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.insert(record);
	}

	@Override
	public int insertSelective(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.insertSelective(record);
	}

	@Override
	public OutLine selectByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return outLineMapper.selectByPrimaryKey(oid);
	}

	

	@Override
	public int updateByPrimaryKeySelective(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<OutLine> selectByTIDandOTID(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return outLineMapper.selectByTIDandOTID(map);
	}
	@Override
	public String selectD(Integer oid) {
		// TODO Auto-generated method stub
		OutLine  outline = outLineMapper.selectByPrimaryKey(oid);
		outlineD outlineD = new outlineD();
		
		outlineD.setOdata(outline.getOdata());
		outlineD.setTid(outline.getTid());
		outlineD.setOtid(outline.getOtid());
		outlineD.setOdescription(outline.getOdescription());
		outlineD.setOfile(outline.getOfile());
		outlineD.setOid(outline.getOid());
		outlineD.setOimg(outline.getOimg());
		outlineD.setOimg1(outline.getOimg1());
		outlineD.setOimg2(outline.getOimg2());
		outlineD.setOimg3(outline.getOimg3());
		outlineD.setOimg4(outline.getOimg4());
		outlineD.setOname(outLineTypeMapper.selectByPrimaryKey(outline.getOtid()).getOname());
		
		return jsonConvert.Bean2Json(outlineD);
	}

	@Override
	public int update(Integer oid, String odescription, String oname,
			String odata, String oimg1, String oimg2, String oimg3, String oimg4) {
		// TODO Auto-generated method stub
		int otid = outLineMapper.selectByPrimaryKey(oid).getOtid();
		OutLineType outlinetype = outLineTypeMapper.selectByPrimaryKey(otid);
		outlinetype.setOname(oname);
		int isok = outLineTypeMapper.updateByPrimaryKeySelective(outlinetype);
		
		OutLine outline = outLineMapper.selectByPrimaryKey(oid);
		outline.setOdescription(odescription);
		outline.setOdata(odata);
		outline.setOimg1(oimg1);
		outline.setOimg2(oimg2);
		outline.setOimg3(oimg3);
		outline.setOimg4(oimg4);
		
		return outLineMapper.updateByPrimaryKeySelective(outline);
	}

	@Override
	public int insertSelect(Integer tid, String odescription, String oname,
			String odata, String oimg1, String oimg2, String oimg3, String oimg4) {
		// TODO Auto-generated method stub
		List<OutLineType>  outLineTypes = outLineTypeMapper.selectByTID(tid);
		int otid = 1;
		for (OutLineType outLineType : outLineTypes) {
			if(oname.equals(outLineType.getOname())){
				otid = outLineType.getOtid();
				break;
			}
		}
		
		OutLine outLine = new OutLine();
		outLine.setTid(tid);
		outLine.setOtid(otid);
		outLine.setOdata(odata);
		outLine.setOdescription(odescription);
		outLine.setOimg1(oimg1);
		outLine.setOimg2(oimg2);
		outLine.setOimg3(oimg3);
		outLine.setOimg4(oimg4);
		
		return outLineMapper.insertSelective(outLine);
	}

	@Override
	public String selectByName(String odescription) {
		// TODO Auto-generated method stub
		List<OutLine> outLines = outLineMapper.selectByName(odescription);
		return jsonConvert.list2json(outLines);
	}

	@Override
	public int CountNumByName(String odescription) {
		// TODO Auto-generated method stub
		return outLineMapper.CountNumByName(odescription);
	}

	@Override
	public String selectOutlinetypeD(Integer tid) {
		// TODO Auto-generated method stub
		List<OutLine> outLines = outLineMapper.selectByTID(tid);
		List<outlinetypeD> outlinetypeDs = new LinkedList<outlinetypeD>();
		outlinetypeD outlinetypeD;
		for (OutLine outLine : outLines) {
			outlinetypeD = new outlinetypeD();
			OutLineType outLineType = outLineTypeMapper.selectByPrimaryKey(outLine.getOtid());
			outlinetypeD.setOid(outLine.getOid());
			outlinetypeD.setTid(outLine.getTid());
			outlinetypeD.setOimg(outLine.getOimg());
			outlinetypeD.setOname(outLineType.getOname());
			
			outlinetypeDs.add(outlinetypeD);
		}
		return jsonConvert.list2json(outlinetypeDs);
	}

	@Override
	public String selectOutlineB4(Integer tid) {
		// TODO Auto-generated method stub
		List<OutLine> outLines = outLineMapper.selectByTID(tid);
		List<outlineB> outlineBs = new LinkedList<outlineB>();
		outlineB outlineB;
		int i = 0;
		for (OutLine outLine : outLines) {
			if(i>=4) break;
			
			outlineB = new outlineB();
			OutLineType outLineType = outLineTypeMapper.selectByPrimaryKey(outLine.getOtid());
			outlineB.setOdescription(outLine.getOdescription());
			outlineB.setOid(outLine.getOid());
			outlineB.setTid(outLine.getTid());
			outlineB.setOimg(outLine.getOimg());
			outlineB.setOname(outLineType.getOname());

			outlineBs.add(outlineB);
			i++;
		}
		return jsonConvert.list2json(outlineBs);
		
	}

	@Override
	public String getOutlineB(Integer tid) {
		// TODO Auto-generated method stub
		List<OutLine> outLines = outLineMapper.selectByTID(tid);
		List<outlineB> outlineBs = new LinkedList<outlineB>();
		outlineB outlineB;
		for (OutLine outLine : outLines) {
			
			outlineB = new outlineB();
			OutLineType outLineType = outLineTypeMapper.selectByPrimaryKey(outLine.getOtid());
			outlineB.setOdescription(outLine.getOdescription());
			outlineB.setOid(outLine.getOid());
			outlineB.setTid(outLine.getTid());
			outlineB.setOimg(outLine.getOimg());
			outlineB.setOname(outLineType.getOname());

			outlineBs.add(outlineB);
		}
		return jsonConvert.list2json(outlineBs);
	}

}
