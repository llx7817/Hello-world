package cn.art.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.User;
import cn.art.service.UserService;
import cn.art.util.MD5;


@Controller
@RequestMapping("/html")
public class registerController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping("customerRegister")
	public String costomRegisterService(HttpServletRequest request) {
		String uname = request.getParameter("newAccount");
		String upassword = request.getParameter("newPassword");
		
		MD5 md5 = new MD5();
		User user = new User();
		user.setUname(uname);
		try {
			user.setUpassword(md5.str2md5(upassword));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		int i = userService.insertSelective(user);
		
		System.out.println(i);
		//HTML之间怎么传值
		HttpSession session = request.getSession();
		session.setAttribute("name", "登录成功");
		return "corpus";
	}

}
