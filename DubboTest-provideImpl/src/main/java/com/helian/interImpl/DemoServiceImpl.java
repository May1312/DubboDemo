package com.helian.interImpl;


import org.springframework.stereotype.Service;

import com.helian.interf.IDemoService;

@Service(value ="demoService")//springframework的注解
public class DemoServiceImpl implements IDemoService {

	public String sayHello(String name) {
		
		 return "Hello Dubbo(版本1.0.0),Hello " + name;
	}
}