package org.eop.spring.restful.test.groovy.restful.user

import org.eop.spring.restful.test.java.restful.AbstractGetTest

class UserGet extends AbstractGetTest {

	@Override
	String getRestUri() {
		'/user/get'
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
		null
	}

}
