package org.eop.spring.restful.test.groovy.restful.map

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractPutTest

class MapPut extends AbstractPutTest {

	@Override
	String getRestUri() {
		'/map/put'
	}

	@Override
	Map getUriVars() {
		[:]
	}

	@Override
	Map getHttpHeaders() {
		['Content-Type':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		'{"method":"put"}'
	}

}
