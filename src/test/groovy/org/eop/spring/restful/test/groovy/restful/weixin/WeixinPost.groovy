package org.eop.spring.restful.test.groovy.restful.weixin

import java.util.Map

import org.eop.spring.restful.test.java.restful.AbstractPostTest

/**
 * @author lixinjie
 * @since 2017-09-07
 */
class WeixinPost extends AbstractPostTest {

	@Override
	String getBaseUri() {
		'https://api.weixin.qq.com/cgi-bin/template/api_set_industry?access_token=ACCESS_TOKEN'
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
'''{
"industry_id1":"1",
"industry_id2":"4"
}'''
	}

}
