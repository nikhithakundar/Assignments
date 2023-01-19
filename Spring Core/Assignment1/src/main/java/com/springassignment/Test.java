package com.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Customer c= (Customer) context.getBean("customerAdd");
        c.display();
    }
}
