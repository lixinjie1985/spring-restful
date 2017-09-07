package org.eop.spring.restful.test.groovy.restful.cnblogs

import java.util.Map

import org.eop.spring.restful.test.java.restful.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-09-07
 */
class CnblogsGet extends AbstractGetTest {

	@Override
	String getBaseUri() {
		'https://www.cnblogs.com/'
	}
	
	@Override
	String getRestUri() {
		''
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		[:]
	}

	@Override
	<T> T getRequestBody() {
		null
	}

}
