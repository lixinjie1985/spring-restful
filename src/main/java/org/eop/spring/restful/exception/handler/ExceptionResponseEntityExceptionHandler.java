package org.eop.spring.restful.exception.handler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 这种方式可以用来统一处理异常，但是需要继承spring的类
 * 有点耦合
 * @author lixinjie
 * @since 2017-09-12
 */
@Order(Ordered.LOWEST_PRECEDENCE)
@RestControllerAdvice
public class ExceptionResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		System.out.println("ResponseEntityExceptionHandler:" + ex.getClass());
		System.out.println("ResponseEntityExceptionHandler:" + status);
		return super.handleExceptionInternal(ex, body, headers, status, request);
	}
}
