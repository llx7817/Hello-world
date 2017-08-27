package cn.art.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.art.model.User;
import cn.art.service.UserService;
import cn.art.util.MD5;

@Controller
@RequestMapping("")
public class loginController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 验证 注解 @requestparam()

	@RequestMapping(value = "manager/register", method = RequestMethod.GET)
	public String registerForm() {
		System.out.println("1111111111111111111222");
		return "manager/registerForm";
	}

	@RequestMapping(value = "manager/register", method = RequestMethod.POST)
	public String register(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			@RequestParam("username") String username) {
		System.out.println("loginname " + loginname + " password " + password + " username " + username);

		return "manager/loginForm";
	}

	// 用户登录
	@RequestMapping("user/customerLogin")
	public String costomlogin(HttpServletRequest request, @RequestParam("account") String account,
			@RequestParam("password") String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// request.get
		boolean isRegister = false;

		System.out.println(account + "  " + password);
		MD5 md = new MD5();
		List<User> users = userService.selectUserByName(account);
		for (User user : users) {
			System.out.println(user.getUname() + "  " + user.getUpassword());
			if (md.str2md5(password).equals(user.getUpassword())) {
				System.out.println("登录成功" + password + "  " + user.getUname() + "  " + user.getUpassword());
				isRegister = true;
				break;
			}
		}
		// HTML之间怎么传值
		HttpSession session = request.getSession();
		if (isRegister) {
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "redirect:/user/corpus";
		} else {
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			return "user/customerLogin";
		}
	}

	// 用户注册
	@RequestMapping(value = "user/customerRegister", method = RequestMethod.POST)
	public String costomuserRegister(HttpServletRequest request, @RequestParam("newAccount") String newAccount,
			@RequestParam("newPassword") String newPassword, @RequestParam("confirmPassword") String confirmPassword,
			@RequestParam("newEmail") String newEmail) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// request.get
		boolean isRegister = false;

		// 判断用户注册时两次输入密码是否一致
		if (newPassword.trim() != confirmPassword.trim()) {
			request.setAttribute("errorMessage", "两次输入的密码不一致");
		} else {
			int isok = userService.insertSelect(newAccount.trim(), newPassword.trim(), newEmail.trim());
			if (isok == 1) {
				// 插入成功
				request.setAttribute("status", 200);
			} else {
				request.setAttribute("status", 100);
				request.setAttribute("errorMessage", "用户注册失败");
			}
		}

		return "user/customerLogin";
	}

	@RequestMapping("customerRegister")
	public String costommanager() {
		return "index";
	}

	// 管理员登录
	@RequestMapping("manager/managerLogin")
	public String costommanagerlogin(HttpServletRequest request,
			@RequestParam(value = "account", required = false) String account,
			@RequestParam(value = "password", required = false) String password)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// request.get
		boolean isRegister = false;
		System.out.println(account + "22" + password + "33");
		MD5 md = new MD5();
		List<User> users = userService.selectManagerByName(account.trim());
		for (User user : users) {
			System.out.println(user.getUname() + "  " + user.getUpassword());
			if (md.str2md5(password).equals(user.getUpassword())) {
				// System.out.println("登录成功"+password+" "+user.getUname()+"
				// "+user.getUpassword());
				isRegister = true;
				break;
			}
		}
		// HTML之间怎么传值
		HttpSession session = request.getSession();
		if (isRegister) {
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "redirect:/manager/testlogin";
		} else {
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			// return "manager/managerLogin";
			return "manager/productMaintenance/productMaintenance";
		}
	}

	@RequestMapping("manager/testlogin")
	public void managertest(HttpServletRequest request) {
		// String name = "wangzhe";
		// request.setAttribute("name",name);
		HttpSession session = request.getSession();
		String account = (String) session.getAttribute("name");
		System.out.println(account);
		// return "corpus";
	}

	@RequestMapping("user/corpus")
	public void costomcorpus(HttpServletRequest request) {
		// String name = "wangzhe";
		// request.setAttribute("name",name);
		HttpSession session = request.getSession();
		String account = (String) session.getAttribute("name");
		System.out.println(account);
		// return "corpus";
	}

}
