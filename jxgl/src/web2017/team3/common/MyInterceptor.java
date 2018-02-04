package web2017.team3.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.Admin;
import web2017.team3.domain.Student;
import web2017.team3.domain.Teacher;

public class MyInterceptor implements HandlerInterceptor {

	private static final String[] IGNORE_URI={"/login","/checkImgCode","html","login.jsp"};
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		boolean flag = false;
		String servletPath = request.getServletPath();
		for (String str : IGNORE_URI) {
			if(servletPath.contains(str)){
				flag = true;
				break;
			}
		}
		if(!flag){
			Student student = (Student) request.getSession().getAttribute("student");
			Admin admin = (Admin) request.getSession().getAttribute("admin");
			Teacher teacher = (Teacher) request.getSession().getAttribute("teacher");
			if(student == null || admin == null || teacher == null ){
				System.out.println("已拦截");
				request.setAttribute("message", "请登录操作");
				request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
			}else{
				System.out.println("");
				flag = true;
			}
		}
		return flag;
	}

}
