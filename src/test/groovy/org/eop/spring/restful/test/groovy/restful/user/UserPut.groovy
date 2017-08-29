package org.eop.spring.restful.test.groovy.restful.user

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractPutTest

class UserPut extends AbstractPutTest {

	@Override
	String getRestUri() {
		'/user/put'
	}

	@Override
	Map getUriVars() {
		[:]
	}

	@Override
	Map getHttpHeaders() {
		['Content-Type':'application/json','Accept':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		["id":1010,"userName":"李新杰","password":"000000","registerTime":1503971529894]
	}

}
