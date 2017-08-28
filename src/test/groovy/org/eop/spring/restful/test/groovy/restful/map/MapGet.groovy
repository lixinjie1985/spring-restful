package org.eop.spring.restful.test.groovy.restful.map

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractGetTest

class MapGet extends AbstractGetTest {

	@Override
	String getRestUri() {
		'/map/get'
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
		''
	}

}
