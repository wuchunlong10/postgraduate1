package web2017.team3.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		if(session.getAttribute("student") != null){
			chain.doFilter(req, resp);
		}else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

	/*public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)

	  throws ServletException, IOException {

	       if (this.encoding != null && (this.forceEncoding || request.getCharacterEncoding() == null)) {

               request.setCharacterEncoding(this.encoding);

            if (this.forceEncoding && responseSetCharacterEncodingAvailable) {

                  response.setCharacterEncoding(this.encoding);

                }

           }

	           filterChain.doFilter(request, response);

  }*/
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
