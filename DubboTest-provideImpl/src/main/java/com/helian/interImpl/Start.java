package com.helian.interImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) throws Exception { 
		//ApplicationContext app = new ClassPathXmlApplicationContext("file:D:/eclipse-workspace/DubboDemo/DubboTest-provideImpl/src/main/resources/spring/spring-context.xml");
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath*:spring/spring-context.xml");
        com.alibaba.dubbo.container.Main.main(args); 
        
	} 
}
