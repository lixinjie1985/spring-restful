package org.eop.spring.restful.test.groovy.restful

import java.util.Map

import org.springframework.http.HttpMethod

/**
 * @author lixinjie
 * @since 2017-08-26
 */
abstract class AbstractPostTest extends AbstractRestfulTest {

	@Override
	String getBaseUri() {
		'http://localhost:8080/spring-restful'
	}

	@Override
	HttpMethod getHttpMethod() {
		HttpMethod.POST
	}

	@Override
	<T> Class<T> getResponseType() {
		String.class
	}

}
