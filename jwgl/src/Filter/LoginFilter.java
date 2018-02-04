package Filter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginFilter implements Filter{
	public void init(FilterConfig arg0) throws ServletException{}
    public void destroy(){}
    public void doFilter(ServletRequest request,ServletResponse response, FilterChain chain)throws IOException,ServletException{
        HttpServletRequest httprequest = (HttpServletRequest)request;
        HttpServletResponse httpresponse = (HttpServletResponse)response;
        HttpSession session = httprequest.getSession();
        if(session.getAttribute("user")!=null){
            chain.doFilter(request,response);
        }
        else {
        	httpresponse.sendRedirect(httprequest.getContextPath()+"/role_login.jsp");
        }
    }
}
