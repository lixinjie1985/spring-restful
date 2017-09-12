package org.eop.spring.restful.filter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author lixinjie
 * @since 2017-09-12
 */
public class RepeatableHttpServletRequest extends HttpServletRequestWrapper {

	private RepeatableServletInputStream inputStream;
	
	public RepeatableHttpServletRequest(HttpServletRequest request) throws IOException {
		super(request);
		inputStream = new RepeatableServletInputStream(request.getInputStream());
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		return inputStream;
	}
	
	@Override
	public BufferedReader getReader() throws IOException {
		String charset = this.getCharacterEncoding();
		return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(inputStream.getDatas()), charset != null ? charset : "UTF-8"));
	}
}
