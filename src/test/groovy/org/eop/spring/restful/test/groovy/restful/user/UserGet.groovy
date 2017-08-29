package org.eop.spring.restful.test.groovy.restful.user

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractGetTest

class UserGet extends AbstractGetTest {

	@Override
	String getRestUri() {
		'/user/get'
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
