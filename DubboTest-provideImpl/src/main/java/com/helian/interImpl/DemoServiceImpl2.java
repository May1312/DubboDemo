package com.helian.interImpl;

import org.springframework.stereotype.Service;
import com.helian.interf.IDemoService;

@Service(value ="demoService2")//springframework的注解
public class DemoServiceImpl2 implements IDemoService {

	public String sayHello(String name) {
		return "Hello Dubbo(版本2.0.0),Hello " + name;
	}

}
