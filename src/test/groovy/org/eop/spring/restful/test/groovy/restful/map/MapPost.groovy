package org.eop.spring.restful.test.groovy.restful.map

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractPostTest

class MapPost extends AbstractPostTest {

	@Override
	String getRestUri() {
		'/map/post'
	}

	@Override
	Map getUriVars() {
		[:]
	}

	@Override
	Map getHttpHeaders() {
		['Content-Type':'application/json','Accept':'application/xml']
	}

	@Override
	<T> T getRequestBody() {
		'{"method":"post"}'
	}

}
