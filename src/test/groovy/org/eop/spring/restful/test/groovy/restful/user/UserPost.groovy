package org.eop.spring.restful.test.groovy.restful.user

import java.util.Map

import org.eop.spring.restful.test.groovy.restful.AbstractPostTest

class UserPost extends AbstractPostTest {

	@Override
	String getRestUri() {
		'/user/post'
	}

	@Override
	Map getUriVars() {
		[:]
	}

	@Override
	Map getHttpHeaders() {
		['Content-Type':'application/json;charset=UTF-8','Accept':'application/xml']
	}

	@Override
	<T> T getRequestBody() {
		'{"id":1010,"userName":"李新杰","password":"000000","registerTime":1503971529894}'
	}

}
