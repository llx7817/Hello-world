package cn.art.interceptor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.art.model.User;

/**
 * 
 * 拦截器必须实现HandlerInterceptor接口
 *
 */
public class AuthorizationInterceptor implements HandlerInterceptor {
	//不拦截  "/customerLogin"  "/customerRegister"  "/CLoginForm"  "/managerLogin"  "/MLoginForm"  等请求
	
	//暂时不拦截用户端的操作 即 "/customerLogin"  "/customerRegister" "/CLoginForm"
	private static final String[] IGNORE_URI = {"/customerLogin","/customerRegister",
		"/managerLogin","/CLoginForm","/MLoginForm"};
	
	/**
	 * 该方法将在整个请求完成后执行， 主要用于清理资源
	 * 该方法也只能在当前Interceptor的prehandler 方法返回值为true时才执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor afterComletion   -->");

	}
	
	/**
	 * 该方法将在Controller方法调用完成后执行， 方法中可以对ModelandView进行操作
	 * 该方法也只能在当前Interceptor的prehandler 方法返回值为true时才执行
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor postHandler   -->");

	}
	
	/**
	 * preHandler方法是进行处理器拦截用的， 该方法将在Controller处理之前进行调用
	 * 该方法返回值为true时，拦截器才会继续往下执行，该方法的值为false时 整个请求就结束了
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor preHandler   -->");
		 
		//flag 变量用户判断管理员是否登录，默认为false
		boolean flag = false;
		//获取请求路径进行判断
		String servletPath = request.getServletPath();
		System.out.println("111111111111111 servletPath "+servletPath);
		//判断请求是否需要拦截
		for (String  s : IGNORE_URI) {
			if(servletPath.contains(s)){
				flag = true;
				break;
			}
		}
		
		//拦截请求
		if(!flag){
			//1.获取session域中的用户
			User user = (User) request.getSession().getAttribute("user");
			System.out.println("222222222222222222222222222222222222222222222222");
			//2.判断用户是否已经登录
			if(user==null){
				//如果用户没有登录，则设置提示信息，跳转到登录界面
				System.out.println("AuthorizationInterceptor 拦截请求");
				request.setAttribute("message", "请先登录再访问网站");
				request.getRequestDispatcher("/manager/MLoginForm").forward(request, response);
			}else {
				//如果用户已登录，则验证通过，放行
				System.out.println("AuthorizationInterceptor 请求放行");
				flag = true;
			}
		}
		return flag;
	}

}
