package org.eop.spring.restful.test.groovy.restful.file

import org.eop.spring.restful.test.java.restful.AbstractPostTest
import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

class FilePost extends AbstractPostTest {

	@Override
	String getRestUri() {
		'/file/post'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'multipart/form-data','Accept':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>()
		FileSystemResource fsr = new FileSystemResource(new File('C:\\Users\\Administrator\\Desktop\\新建文本文档.txt'))
		body.add('name', '中文')
		body.add('file', fsr)
		body
	}

}
