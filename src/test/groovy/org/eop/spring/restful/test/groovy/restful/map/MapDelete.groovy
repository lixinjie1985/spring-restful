package org.eop.spring.restful.test.groovy.restful.map

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractDeleteTest

class MapDelete extends AbstractDeleteTest {

	@Override
	String getRestUri() {
		'/map/delete'
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
		'{"method":"delete"}'
	}

}
