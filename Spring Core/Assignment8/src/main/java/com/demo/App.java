package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springQ8.xml");
        HelloWorld hw = context.getBean(HelloWorld.class);
        System.out.println(hw.getMessage());
        context.registerShutdownHook();
    }
}
