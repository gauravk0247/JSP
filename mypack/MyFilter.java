package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
//@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Filter Destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res= (HttpServletResponse)response;
		
		PrintWriter out = res.getWriter();
		String un = req.getParameter("t1");
		String cn = req.getParameter("t2");
		String regexForUserName = "[A-Za-z//s]{3,}";
		String creditCriteria = "[1-8]{4}[-]{1}[2-8]{4}[-]{1}[0-9]{4}[-]{1}[6-9]{2}";
		
		if(un.matches(regexForUserName)) {
			out.println("<center><h2><font color='green'> "+" "+"valid user "+"</font></h2></center>");
		}else {
			out.println("<center><h2><font color='red'> "+" "+"Invalid user "+"</font></h2></center>");
		}
		
		if(cn.matches(creditCriteria)) {
			out.println("<center><h2><font color='green'> "+" "+"valid credit card "+"</font></h2></center>");
		}else {
			out.println("<center><h2><font color='red'> "+" "+"Invalid credit card "+"</font></h2></center>");
		}
		
		
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
