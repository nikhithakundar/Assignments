package com.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean, BeanNameAware {

	@Override
	public void setBeanName(String name) {
		 System.out.println("Setting the Bean Name");

	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("Destroying the Method");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing the bean");

	}

}
