package com.sf.gxl.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCallService {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/spring-*.xml");
		context.start();

		TextTransform textTransform = context.getBean(TextTransform.class);
		String result = textTransform.transform2Upper("hello dubbo!!");
		System.out.println("调用服务,返回结果:" + result);
	}
}
