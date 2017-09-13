package org.eop.spring.restful.test.groovy.restful.result

import java.util.Map

import org.eop.spring.restful.test.java.restful.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-09-13
 */
class ListResultGet extends AbstractGetTest {

	@Override
	public String getRestUri() {
		return '/result/list'
	}

	@Override
	public Map<String, Object> getUriVars() {
		return [:]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		return ['Content-Type':'application/json;charset=UTF-8','Accept':'application/json;charset=UTF-8']
	}

	@Override
	public <T> T getRequestBody() {
		return null
	}

}
