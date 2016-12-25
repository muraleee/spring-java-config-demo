package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = ctx.getBean("beanB", BeanA.class);
		
		beanA.execute();

	}

}
