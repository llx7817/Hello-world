package cn.art.util.Bean2PartBean;

import cn.art.model.Type;
import cn.art.util.pojo.typeYUYI;

public class Type2PartBean {
	public typeYUYI type2YUYI(Type type){
		typeYUYI typeYUYI = new typeYUYI();
		
		typeYUYI.setTid(type.getTid());
		typeYUYI.setTname(type.getTname());
		typeYUYI.setTalgorithm(type.getTalgorithm());
		typeYUYI.setTicon(type.getTicon());
		typeYUYI.setTwordtype(type.getTwordtype());
		typeYUYI.setTyuyi(type.getTyuyi());
		return typeYUYI;
	}

}
