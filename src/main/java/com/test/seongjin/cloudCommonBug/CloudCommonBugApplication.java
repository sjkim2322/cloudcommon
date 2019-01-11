package com.test.seongjin.cloudCommonBug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

@SpringBootApplication
public class CloudCommonBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCommonBugApplication.class, args);
	}

}

