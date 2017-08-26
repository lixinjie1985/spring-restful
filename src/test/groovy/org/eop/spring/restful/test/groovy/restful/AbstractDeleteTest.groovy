package org.eop.spring.restful.test.groovy.restful

import java.util.Map

import org.springframework.http.HttpMethod

/**
 * @author lixinjie
 * @since 2017-08-26
 */
abstract class AbstractDeleteTest extends AbstractRestfulTest {

	@Override
	String getBaseUri() {
		''
	}

	@Override
	HttpMethod getHttpMethod() {
		HttpMethod.DELETE
	}

	@Override
	<T> Class<T> getResponseType() {
		String.class
	}

}
