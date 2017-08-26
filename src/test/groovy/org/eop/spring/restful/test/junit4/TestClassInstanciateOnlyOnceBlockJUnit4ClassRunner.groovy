package org.eop.spring.restful.test.junit4

import org.junit.runners.BlockJUnit4ClassRunner

/**
 * @author lixinjie
 * @since 2017-08-26
 */
class TestClassInstanciateOnlyOnceBlockJUnit4ClassRunner extends BlockJUnit4ClassRunner {

	protected Object testClassInstance
	
	TestClassInstanciateOnlyOnceBlockJUnit4ClassRunner(Class<?> klass) {
		super(klass)
	}
	
	@Override
	protected Object createTest() throws Exception {
		if (!testClassInstance) {
			testClassInstance = super.createTest()
		}
		return testClassInstance
	}
}
