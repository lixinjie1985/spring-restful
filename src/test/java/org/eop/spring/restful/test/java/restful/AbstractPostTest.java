package org.eop.spring.restful.test.java.restful;

import org.springframework.http.HttpMethod;

/**
 * @author lixinjie
 * @since 2017-08-26
 */
public abstract class AbstractPostTest extends AbstractRestfulTest {

	@Override
	public String getBaseUri() {
		return "http://localhost:8080/spring-restful";
	}

	@Override
	public HttpMethod getHttpMethod() {
		return HttpMethod.POST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<String> getResponseType() {
		return String.class;
	}

}
