package cn.art.test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sun.misc.BASE64Encoder;
import cn.art.dao.NewCaseMapper;
import cn.art.dao.SurveyMapper;
import cn.art.dao.UserMapper;
import cn.art.model.User;
import cn.art.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testart {
	private UserService userService;
	private UserMapper userMapper;
	private SurveyMapper surveyMapper;
	private NewCaseMapper newCaseMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public NewCaseMapper getNewCaseMapper() {
		return newCaseMapper;
	}
	@Autowired
	public void setNewCaseMapper(NewCaseMapper newCaseMapper) {
		this.newCaseMapper = newCaseMapper;
	}
	public SurveyMapper getSurveyMapper() {
		return surveyMapper;
	}
	@Autowired
	public void setSurveyMapper(SurveyMapper surveyMapper) {
		this.surveyMapper = surveyMapper;
	}
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Test
	public void testUser(){
		//User user = userService.selectUserById(2);
		List<User> user = userService.selectUserByName("222");
		for (User user2 : user) {
			System.out.println(user2.getUname()+"  "+user2.getUpassword());
		}
	}
	
	@Test
	public void testManager(){
		//User user = userService.selectUserById(2);
		List<User> user = userService.selectManagerByName("222");
		for (User user2 : user) {
			System.out.println(user2.getUname()+"  "+user2.getUpassword());
		}
	}
	
	public String testmd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//确定计算方法
		MessageDigest mDigest = MessageDigest.getInstance("MD5");
		BASE64Encoder base64 = new BASE64Encoder();
		
		//加密后的字符串
		return base64.encode(mDigest.digest(str.getBytes("utf-8")));
		//System.out.println(string);
	}
	@Test
	public void testupdate() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		User user = userService.selectUserById(3);
		user.setUpassword(testmd5(user.getUpassword()));
		userService.updateByPrimaryKeySelective(user);
		System.out.println(userService.selectUserById(1).getUpassword());
	}
	@Test
	public void testdelete() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
		userService.deleteByPrimaryKey(4);
		System.out.println("删除成功");
	}
	
	@Test
	public void testUserinsertSelectiveAndGetID(){
		//User user = userService.selectUserById(2);
		User user = new User();
		user.setUemail("www.neteast.163");
		user.setUname("haohao12");
		user.setUpassword("111");
		user.setUprivilege(0);
		int getid = userMapper.insert(user);
		
		System.out.println(" generate id  "+getid);
		System.out.println(" generate id  "+user.getUid());		
	}
	
	

}
