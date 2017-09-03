package org.eop.spring.restful.test.groovy.restful.user

import org.eop.spring.restful.test.java.restful.AbstractPutTest

class UserPut extends AbstractPutTest {

	@Override
	String getRestUri() {
		'/user/put'
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
		["id":1010,"userName":"李新杰","password":"000000","registerTime":1503971529894]
	}

}
