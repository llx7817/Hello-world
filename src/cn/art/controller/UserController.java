package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.User;
import cn.art.service.UserService;


@Controller
@RequestMapping("/userController")
public class UserController {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
    @RequestMapping("showuser")
	public String showUser(HttpServletRequest request){
		User user = userService.selectUserById(1);
		request.setAttribute("user", user);
		return "redirect:/userController/showme.do";
		
	}
    @RequestMapping("showme")
   	public String showMe(HttpServletRequest request){
    	String name = "wangzhe";
    	request.setAttribute("name",name);
    	System.out.println("1111111111");
    	return "showme";
    }

}
