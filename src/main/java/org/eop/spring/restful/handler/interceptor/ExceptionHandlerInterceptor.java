package org.eop.spring.restful.handler.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 通过拦截器统一修改状态码，重新设置响应内容的方法来处理异常是行不通的
 * 因此过滤器也是行不通的
 * @author lixinjie
 * @since 2017-09-11
 */
public class ExceptionHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//如果流程还没有执行到应用拦截器时就报错抛异常，那么拦截器不会被执行，直接跳到后面的异常处理阶段
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//response committed, can change nothing
		System.out.println("HandlerInterceptor:" + response.isCommitted());
		System.out.println("HandlerInterceptor:" + response.getStatus());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//response committed, can change nothing
		System.out.println("HandlerInterceptor:" + response.isCommitted());
		System.out.println("HandlerInterceptor:" + response.getStatus());
	}

}
