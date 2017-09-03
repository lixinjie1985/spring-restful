package org.eop.spring.restful.test.groovy.restful.map

import org.eop.spring.restful.test.java.restful.AbstractPostTest

class MapPost extends AbstractPostTest {

	@Override
	String getRestUri() {
		'/map/post'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json;charset=UTF-8','Accept':'application/xml']
	}

	@Override
	<T> T getRequestBody() {
		'{"method":"post-中文"}'
	}

}
