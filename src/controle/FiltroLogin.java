package controle;

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

@WebFilter(servletNames = {"FacesServlet"})
public class FiltroLogin implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
        Object o = session.getAttribute("sessao");	
        System.out.println("Filtro: "+req.getRequestURI());
        if (req.getRequestURI().endsWith("ManAlterarSenha.xhtml") || req.getRequestURI().endsWith("Login.xhtml") 
        		|| o != null || req.getRequestURI().endsWith("js.xhtml") || req.getRequestURI().endsWith("css.xhtml")) {
        	chain.doFilter(request, response);
        } else if (o == null) {
        	HttpServletResponse res = (HttpServletResponse) response;
        	res.sendRedirect("Login.xhtml");
        }

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}