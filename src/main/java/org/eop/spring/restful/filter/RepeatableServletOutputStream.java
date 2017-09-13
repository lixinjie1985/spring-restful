package org.eop.spring.restful.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

/**
 * @author lixinjie
 * @since 2017-09-13
 */
public class RepeatableServletOutputStream extends ServletOutputStream {

	private ServletOutputStream outputStream;
	private ByteArrayOutputStream output;
	
	public RepeatableServletOutputStream(ServletOutputStream outputStream) {
		this.outputStream = outputStream;
		this.output = new ByteArrayOutputStream(1024 * 10);
	}
	
	@Override
	public boolean isReady() {
		return outputStream.isReady();
	}

	@Override
	public void setWriteListener(WriteListener writeListener) {
		outputStream.setWriteListener(writeListener);
	}

	@Override
	public void write(int b) throws IOException {
		outputStream.write(b);
		output.write(b);
	}
	
	@Override
	public void flush() throws IOException {
		outputStream.flush();
		output.flush();
	}

	@Override
	public void close() throws IOException {
		outputStream.close();
		output.close();
	}
	
	public byte[] getDatas() {
		return output.toByteArray();
	}
}
