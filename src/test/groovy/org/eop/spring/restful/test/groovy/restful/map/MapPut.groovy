package org.eop.spring.restful.test.groovy.restful.map

import org.eop.spring.restful.test.java.restful.AbstractPutTest

class MapPut extends AbstractPutTest {

	@Override
	String getRestUri() {
		'/map/put'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json','Accept':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		["method":"put"]
	}

}
