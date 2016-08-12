package com.helian.interImpl;

import org.springframework.stereotype.Service;

import com.helian.interf.IDemoService;
@Service(value ="demoService")
public class DemoServiceImpl implements IDemoService {

	public String sayHello(String name) {
		
		 return "Hello Dubbo,Hello " + name;
	}

}
