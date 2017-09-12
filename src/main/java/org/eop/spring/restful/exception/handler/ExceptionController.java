package org.eop.spring.restful.exception.handler;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 采用此种方式来统一处理异常，根据异常类型进入相应的方法
 * 将异常转换为适合的内容，发送会客户端，将原来异常的响应
 * 状态码放到内容里发送，重新修改响应状态码为200,OK
 * @author lixinjie
 * @since 2017-09-11
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ExceptionController {

	@SuppressWarnings("deprecation")
	@ExceptionHandler(org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException.class)
	public String handleNoSuchRequestHandlingMethodException(org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException ex) {
		return "{\"code\":404,\"desc\":\"Not Found\"}";
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public String handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
		return "{\"code\":405,\"desc\":\"Method Not Allowed\"}";
	}
	
	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	public String handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException ex) {
		return "{\"code\":415,\"desc\":\"Unsupported Media Type\"}";
	}
	
	@ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	public String handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException ex) {
		return "{\"code\":406,\"desc\":\"Not Acceptable\"}";
	}
	
	@ExceptionHandler(MissingPathVariableException.class)
	public String handleMissingPathVariableException(MissingPathVariableException ex) {
		return "{\"code\":500,\"desc\":\"Internal Server Error\"}";
	}
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(ServletRequestBindingException.class)
	public String handleServletRequestBindingException(ServletRequestBindingException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(ConversionNotSupportedException.class)
	public String handleConversionNotSupportedException(ConversionNotSupportedException ex) {
		return "{\"code\":500,\"desc\":\"Internal Server Error\"}";
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public String handleTypeMismatchException(TypeMismatchException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public String handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(HttpMessageNotWritableException.class)
	public String handleHttpMessageNotWritableException(HttpMessageNotWritableException ex) {
		return "{\"code\":500,\"desc\":\"Internal Server Error\"}";
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(MissingServletRequestPartException.class)
	public String handleMissingServletRequestPartException(MissingServletRequestPartException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(BindException.class)
	public String handleBindException(BindException ex) {
		return "{\"code\":400,\"desc\":\"Bad Request\"}";
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String handleNoHandlerFoundException(NoHandlerFoundException ex) {
		return "{\"code\":404,\"desc\":\"Not Found\"}";
	}
	
	@ExceptionHandler(AsyncRequestTimeoutException.class)
	public String handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex) {
		return "{\"code\":503,\"desc\":\"Service Unavailable\"}";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		return "{\"code\":500,\"desc\":\"Internal Server Error\"}";
	}
	
	@ExceptionHandler(Throwable.class)
	public String handleThrowable(Throwable ex) {
		return "{\"code\":500,\"desc\":\"Internal Server Error\"}";
	}
}
