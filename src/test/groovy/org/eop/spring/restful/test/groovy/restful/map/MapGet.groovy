package org.eop.spring.restful.test.groovy.restful.map

import org.eop.spring.restful.test.java.restful.AbstractGetTest

class MapGet extends AbstractGetTest {

	@Override
	String getRestUri() {
		'/map/get'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json','Accept':'application/xml']
	}

	@Override
	<T> T getRequestBody() {
		''
	}

}
