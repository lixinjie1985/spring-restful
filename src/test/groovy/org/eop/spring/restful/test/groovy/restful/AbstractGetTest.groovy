package org.eop.spring.restful.test.groovy.restful

import java.util.Map

import org.springframework.http.HttpMethod

/**
 * @author lixinjie
 * @since 2017-08-26
 */
abstract class AbstractGetTest extends AbstractRestfulTest {

	@Override
	String getBaseUri() {
		''
	}

	@Override
	HttpMethod getHttpMethod() {
		HttpMethod.GET
	}

	@Override
	<T> Class<T> getResponseType() {
		String.class
	}

}
