package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.PartMapper;
import cn.art.dao.PartTypeMapper;
import cn.art.model.Part;
import cn.art.model.PartType;
import cn.art.service.PartService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.partB;
import cn.art.util.pojo.partD;

@Service("PartService")
public class PartServiceImpl implements PartService {
	private PartMapper partMapper;
	private PartTypeMapper partTypeMapper ;
	
	private JsonConvert jsonConvert;
	
	public PartServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public PartTypeMapper getPartTypeMapper() {
		return partTypeMapper;
	}
	@Autowired
	public void setPartTypeMapper(PartTypeMapper partTypeMapper) {
		this.partTypeMapper = partTypeMapper;
	}

	public PartMapper getPartMapper() {
		return partMapper;
	}
	@Autowired
	public void setPartMapper(PartMapper partMapper) {
		this.partMapper = partMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return partMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public int insert(Part record) {
		// TODO Auto-generated method stub
		return partMapper.insert(record);
	}

	@Override
	public int insertSelective(Part record) {
		// TODO Auto-generated method stub
		return partMapper.insertSelective(record);
	}

	@Override
	public Part selectByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return partMapper.selectByPrimaryKey(pid);
	}

	@Override
	public List<Part> selectByTIDandPBID(Map map) {
		// TODO Auto-generated method stub
		return partMapper.selectByTIDandPBID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Part record) {
		// TODO Auto-generated method stub
		return partMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Part record) {
		// TODO Auto-generated method stub
		return partMapper.updateByPrimaryKey(record);
	}
	@Override
	public String selectPartD(Integer pid) {
		// TODO Auto-generated method stub
		Part part = partMapper.selectByPrimaryKey(pid);
		partD partD = new partD();
		
		partD.setPbid(part.getPbid());
		partD.setPbname(partTypeMapper.selectByPrimaryKey(part.getPbid()).getPbname());
		partD.setPdescription(part.getPdescription());
		partD.setPfile(part.getPfile());
		partD.setPid(pid);
		partD.setTid(part.getTid());
		partD.setPimg(part.getPimg());
		partD.setPimg1(part.getPimg1());
		partD.setPimg2(part.getPimg2());
		partD.setPimg3(part.getPimg3());
		partD.setPimg4(part.getPimg4());
		
		return jsonConvert.Bean2Json(partD);
	}

	@Override
	public int update(Integer pid, String pdescription, String pbname,
			String pimg, String pimg1, String pimg2, String pimg3, String pimg4) {
		// TODO Auto-generated method stub
		int pbid = partMapper.selectByPrimaryKey(pid).getPbid();
		PartType parttype = partTypeMapper.selectByPrimaryKey(pbid);
		parttype.setPbname(pbname);
		int isok = partTypeMapper.updateByPrimaryKeySelective(parttype);
		
		Part part = partMapper.selectByPrimaryKey(pid);
		part.setPdescription(pdescription);
		part.setPimg(pimg);
		part.setPimg1(pimg1);
		part.setPimg2(pimg2);
		part.setPimg3(pimg3);
		part.setPimg4(pimg4);
		
		return partMapper.updateByPrimaryKeySelective(part);
	}

	@Override
	public int insertSelect(Integer tid, String pdescription, String pbname,
			String pimg, String pimg1, String pimg2, String pimg3, String pimg4) {
		// TODO Auto-generated method stub
		List<PartType>  partTypes = partTypeMapper.selectByTID(tid);
		int pbid = 1;
		for (PartType partType : partTypes) {
			if(pbname.equals(partType.getPbname())){
				pbid = partType.getPbid();
				break;
			}
		}
		
		Part part = new Part();
		part.setTid(tid);
		part.setPbid(pbid);
		part.setPdescription(pdescription);
		part.setPimg(pimg);
		part.setPimg1(pimg1);
		part.setPimg2(pimg2);
		part.setPimg3(pimg3);
		part.setPimg4(pimg4);
		
		return partMapper.insertSelective(part);
	}

	@Override
	public String selectByName(String pdescription) {
		// TODO Auto-generated method stub
		 List<Part> parts = partMapper.selectByName(pdescription);
		return jsonConvert.list2json(parts);
	}

	@Override
	public int CountNumByName(String pdescription) {
		// TODO Auto-generated method stub
		return partMapper.CountNumByName(pdescription);
	}

	@Override
	public String getPartBasic(Integer tid) {
		// TODO Auto-generated method stub
		List<Part> parts = partMapper.selectByTID(tid);
		List<partB> partBs = new LinkedList<partB>();
		partB partB;
		for (Part part : parts) {
			partB = new partB();
			partB.setPid(part.getPid());
			partB.setTid(part.getTid());
			partB.setPbname(partTypeMapper.selectByPrimaryKey(part.getPbid()).getPbname());
			partB.setPdescription(part.getPdescription());
			partB.setPimg(part.getPimg());
			
			partBs.add(partB);
		}
		return jsonConvert.list2json(partBs);
	}

	@Override
	public String getPartBasic4(Integer tid) {
		// TODO Auto-generated method stub
		List<Part> parts = partMapper.selectByTID(tid);
		List<partB> partBs = new LinkedList<partB>();
		partB partB;
		int i = 0;
		for (Part part : parts) {
			if(i>=4) break;
			partB = new partB();
			partB.setPid(part.getPid());
			partB.setTid(part.getTid());
			partB.setPbname(partTypeMapper.selectByPrimaryKey(part.getPbid()).getPbname());
			partB.setPdescription(part.getPdescription());
			partB.setPimg(part.getPimg());
			
			partBs.add(partB);
			i++;
		}
		return jsonConvert.list2json(partBs);
	}

}
