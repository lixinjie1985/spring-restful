package org.eop.spring.restful.filter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;

/**
 * @author lixinjie
 * @since 2017-09-12
 */
public class RepeatableServletInputStream extends ServletInputStream {

	private byte[] datas;
	private int index = 0;
	private int length;
	
	public RepeatableServletInputStream(ServletInputStream inputStream) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream(1024 * 1024);
		byte[] buf = new byte[1024 * 10];
		int count;
		while ((count = inputStream.read(buf, 0, buf.length)) > 0) {
			out.write(buf, 0, count);
		}
		length = out.size();
		datas = out.toByteArray();
	}
	
	@Override
	public boolean isFinished() {
		return index >= length;
	}

	@Override
	public boolean isReady() {
		return true;
	}

	@Override
	public void setReadListener(ReadListener readListener) {
	}

	@Override
	public int read() throws IOException {
		if (isFinished()) {
			return -1;
		}
		return datas[index++];
	}

	public byte[] getDatas() {
		return datas;
	}
}
