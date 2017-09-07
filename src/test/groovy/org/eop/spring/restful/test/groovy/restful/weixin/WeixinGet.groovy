package org.eop.spring.restful.test.groovy.restful.weixin

import java.util.Map

import org.eop.spring.restful.test.java.restful.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-09-07
 */
class WeixinGet extends AbstractGetTest {

	@Override
	String getBaseUri() {
		'https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET'
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
