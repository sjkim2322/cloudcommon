/*
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.seongjin.cloudCommonBug;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

@Configuration
public class MockPropertySourceLocator implements PropertySourceLocator {
	@Override
	public PropertySource<?> locate(Environment environment) {
		return new CompositePropertySource("Mock");
	}
}
