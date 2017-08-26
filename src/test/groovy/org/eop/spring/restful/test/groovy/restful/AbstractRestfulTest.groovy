package org.eop.spring.restful.test.groovy.restful

import org.eop.spring.restful.test.groovy.AbstractGroovyTest
import org.junit.Test
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

/**
 * @author lixinjie
 * @since 2017-08-26
 */
abstract class AbstractRestfulTest extends AbstractGroovyTest {

	abstract String getBaseUri()
	
	abstract String getRestUri()
	
	abstract Map getUriVars()
	
	abstract Map getHttpHeaders()
	
	abstract HttpMethod getHttpMethod()
	
	abstract <T> T getRequestBody()
	
	abstract <T> Class<T> getResponseType()
	
	@Test
	void execute() {
		def restTplt = new RestTemplate(new HttpComponentsClientHttpRequestFactory())
		def headers = new HttpHeaders()
		httpHeaders.each{name, value ->
			headers.add(name, value)
		}
		def requestEntity = new HttpEntity(requestBody, headers)
		def responseEntity = restTplt.exchange(baseUri + restUri, httpMethod, requestEntity, responseType, uriVars)
		println responseEntity.getBody()
	}
}
