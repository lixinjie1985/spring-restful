package org.eop.spring.restful.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author lixinjie
 * @since 2017-09-12
 */
public class CommonLogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		RepeatableHttpServletRequest rrequest = new RepeatableHttpServletRequest((HttpServletRequest)request);
		System.out.println(rrequest.getMethod() + " " + rrequest.getRequestURI());
		System.out.println(rrequest.getContentType() + ";charset=" + rrequest.getCharacterEncoding());
		System.out.println(rrequest.getReader().readLine());
		chain.doFilter(rrequest, response);
	}

	@Override
	public void destroy() {
		
	}

}
