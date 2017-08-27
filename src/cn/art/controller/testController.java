package cn.art.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.art.model.User;
import cn.art.service.UserService;

@Controller
// @RequestMapping("json")
@RequestMapping("manager")
public class testController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("{formname}")
	public String formservice(@PathVariable String formname) {
		// 动态跳转页面
		return "manager/" + formname;
	}

	// 接收 JSON格式的数据
	@RequestMapping("testRequestBody")
	public void setJson(@RequestBody User user, HttpServletResponse response) throws Exception {

		// ObjectMapper类是 Jackson库的主要类，它提供一些功能将Java对象转换成对应的json格式的数据
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("11111111111111111111111111111");
		// 将user对象转换成json输出
		System.out.println(mapper.writeValueAsString(user));
		user.setUemail("csdn@163.com");
		userService.insertSelective(user);
		response.setContentType("text/html;charset=UTF-8");

		// 将user对象转换为json 写到客户端
		response.getWriter().println(mapper.writeValueAsString(user));
	}

	// 返回JSON格式的数据 fastjson 自定义接收json格式的数据
	@RequestMapping("testRequestBody2")
	public void setJson2(@RequestBody User user, HttpServletResponse response) throws Exception {

		// JSONObject-lib包是一个beans,collections,maps,java arrays和xml和json相互转化的包
		System.out.println("11111111111111111111111111111");
		// 将user对象转换成json输出
		System.out.println(JSONObject.toJSONString(user));
		// user.setUemail("csdn-haohao@163.com");
		int isok = userService.insertSelective(user);
		System.out.println("isok " + isok);
		response.setContentType("text/html;charset=UTF-8");

		// 将user对象转换为json 写到客户端
		response.getWriter().println(JSONObject.toJSONString(user));
	}

	// 返回JSON格式的数据
	@RequestMapping("testRequestBody3")
	// @ResponseBody 会将集合数据转换为json 格式 并将其返回客户端
	@ResponseBody
	public Object getJson2() {

		List<User> users = userService.selectall();
		System.out.println("11111111111111111111111111111");

		return users;
	}

	// 文件上传
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String upload(HttpServletRequest request, @RequestParam("description") String description,
			@RequestParam("file") MultipartFile file) throws Exception {
		System.out.println("description " + description + " file " + file);
		if (!file.isEmpty()) {
			// 上传文件路径
			String path = request.getServletContext().getRealPath("/image/");
			System.out.println("file " + file);
			// 上传文件名
			String filename = file.getOriginalFilename();
			System.out.println("filename " + filename);
			File filepath = new File(path, filename);
			System.out.println("filepath " + filepath);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件夹中
			file.transferTo(new File(path + File.separator + filename));
			request.setAttribute("filename", filename);
			return "manager/success";
		} else {
			return "manager/error";
		}
	}

	@RequestMapping("download")
	public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam("filename") String filename,
			Model model) throws IOException {
		// 下载文件路径
		String path = request.getServletContext().getRealPath("/image/");

		System.out.println("filename " + filename);
		File file = new File(path + File.separator + filename);

		HttpHeaders headers = new HttpHeaders();
		// 下载显示的文件名，解决中文名称轮吗问题
		String downloadfilename = new String(filename.getBytes("UTF-8"), "iso-8859-1");

		// 通知浏览器以attachment(下载方式) 打开图片
		headers.setContentDispositionFormData("attachment", downloadfilename);

		// application/octet-stream；二进制流数据(最常见的下载方式)
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		// 201 httpstatus.CREATED

		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}

}
