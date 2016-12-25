package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean(name={"beanB", "beanC"})
	public BeanA beanA()
	{
		return new BeanA();
	}
}
