package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.BottomCaseMapper;
import cn.art.dao.BottomCaseTypeMapper;
import cn.art.model.BottomCase;
import cn.art.model.BottomCaseType;
import cn.art.service.BottomCaseService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.bottomCaseB;
import cn.art.util.pojo.bottomCaseD;
@Service("BottomCaseService")
public class BottomCaseServiceImpl implements BottomCaseService {
	private BottomCaseMapper bottomCaseMapper;
	private BottomCaseTypeMapper bottomCaseTypeMapper;
	private JsonConvert jsonConvert;
	
	public BottomCaseServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public BottomCaseTypeMapper getBottomCaseTypeMapper() {
		return bottomCaseTypeMapper;
	}
	@Autowired
	public void setBottomCaseTypeMapper(BottomCaseTypeMapper bottomCaseTypeMapper) {
		this.bottomCaseTypeMapper = bottomCaseTypeMapper;
	}
	public BottomCaseMapper getBottomCaseMapper() {
		return bottomCaseMapper;
	}
	@Autowired
	public void setBottomCaseMapper(BottomCaseMapper bottomCaseMapper) {
		this.bottomCaseMapper = bottomCaseMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.deleteByPrimaryKey(bcid);
	}

	@Override
	public int insert(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insertSelective(record);
	}

	@Override
	public BottomCase selectByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByPrimaryKey(bcid);
	}

	@Override
	public List<BottomCase> selectByTIDandBCTID(Map map) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByTIDandBCTID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKey(record);
	}
	@Override
	public int update(Integer bcid, String casename, String casebrand,
			String bctname, String caseimg, String caseimg1, String caseimg2,
			String caseimg3) {
		// TODO Auto-generated method stub
		//更新底层案例类型名称
		int bctid = bottomCaseMapper.selectByPrimaryKey(bcid).getBctid();
		BottomCaseType bottomCaseType = new BottomCaseType();
		//如果底层案例类型名称 已编辑修改，则更新
		if(!bctname.equals(bottomCaseType.getBctname())){
			bottomCaseType.setBctname(bctname);
			bottomCaseType.setBctid(bctid);
			int isok = bottomCaseTypeMapper.updateByPrimaryKeySelective(bottomCaseType);
		}
		BottomCase bottomCase = new BottomCase();
		bottomCase.setBcid(bcid);
		bottomCase.setCasebrand(casebrand);
		bottomCase.setCaseimg(caseimg);
		bottomCase.setCaseimg1(caseimg1);
		bottomCase.setCaseimg2(caseimg2);
		bottomCase.setCaseimg3(caseimg3);
		bottomCase.setCasename(casename);
		return bottomCaseMapper.updateByPrimaryKeySelective(bottomCase);
		

	}
	@Override
	public int insertselect(Integer tid, String casename, String casebrand,
			String bctname, String caseimg, String caseimg1, String caseimg2,
			String caseimg3) {
		// TODO Auto-generated method stub
		int bctid = 1;
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(tid);
		for (BottomCaseType bottomCaseType : bottomCaseTypes) {
			if(bctname.equals(bottomCaseType.getBctname())){
				bctid = bottomCaseType.getBctid();
				break;
			}
		}
		BottomCase bottomCase = new BottomCase();
		bottomCase.setTid(tid);
		bottomCase.setBctid(bctid);
		bottomCase.setCasebrand(casebrand);
		bottomCase.setCaseimg(caseimg);
		bottomCase.setCaseimg1(caseimg1);
		bottomCase.setCaseimg2(caseimg2);
		bottomCase.setCaseimg3(caseimg3);
		bottomCase.setCasename(casename);
		return bottomCaseMapper.insertSelective(bottomCase);
		
	}
	@Override
	public String selectByName(String casename) {
		// TODO Auto-generated method stub
		List<BottomCase> bottomCases = bottomCaseMapper.selectByName(casename);
		return jsonConvert.list2json(bottomCases);
	}
	@Override
	public int CountNumByName(String casename) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.CountNumByName(casename);
	}

	@Override
	public String selectBottomcaseBByTID(Integer tid) {
		// TODO Auto-generated method stub
		 List<BottomCase> bottomCases = bottomCaseMapper.selectByTID(tid);
		 List<bottomCaseB> bottomCaseBs = new LinkedList<bottomCaseB>();
		 bottomCaseB bottomCaseB;
		 for (BottomCase bottomCase : bottomCases) {
			bottomCaseB = new bottomCaseB();
			bottomCaseB.setBcid(bottomCase.getBcid());
			bottomCaseB.setTid(bottomCase.getTid());
			bottomCaseB.setBctname(bottomCaseTypeMapper.selectByPrimaryKey(bottomCase.getBctid()).getBctname());
			bottomCaseB.setCasename(bottomCase.getCasename());
			bottomCaseB.setCaseimg(bottomCase.getCaseimg());
			
			bottomCaseBs.add(bottomCaseB);
		}
		return jsonConvert.list2json(bottomCaseBs);
	}

	@Override
	public String selectBottomcaseDByBCTID(Integer bcid) {
		// TODO Auto-generated method stub
		 BottomCase bottomCase = bottomCaseMapper.selectByPrimaryKey(bcid);
		 bottomCaseD bottomCaseD= new bottomCaseD();
		 
		 bottomCaseD.setBcid(bottomCase.getBcid());
		 bottomCaseD.setTid(bottomCase.getTid());
		 bottomCaseD.setCasename(bottomCase.getCasename());
		 bottomCaseD.setBctname(bottomCaseTypeMapper.selectByPrimaryKey(bottomCase.getBctid()).getBctname());
		 bottomCaseD.setCasebrand(bottomCase.getCasebrand());
		 bottomCaseD.setCaseimg(bottomCase.getCaseimg());
		 bottomCaseD.setCaseimg1(bottomCase.getCaseimg1());
		 bottomCaseD.setCaseimg2(bottomCase.getCaseimg2());
		 bottomCaseD.setCaseimg3(bottomCase.getCaseimg3());
		 bottomCaseD.setCaseimg4(bottomCase.getCaseimg4());
		 
		return jsonConvert.Bean2Json(bottomCaseD);
	}
	

}
