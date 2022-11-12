package com.annotationassignments;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Excecute{
	int Sequence();
}
class MyClass{
	@Excecute(Sequence=2)
	public void myMethod1() {
		System.out.println("This is Method 1");
	}
	@Excecute(Sequence=1)
	public void myMethod2() {
		System.out.println("This is Method 2");
	}
	@Excecute(Sequence=3)
	public void myMethod3() {
		System.out.println("This is Method 3");
	}

}


public class Annotations3 {

	public static void main(String[] args)throws Exception {
		MyClass c=new MyClass();
		Method m=c.getClass().getMethod("myMethod2");
		Method m1=c.getClass().getMethod("myMethod1");
		Method m2=c.getClass().getMethod("myMethod3");
		
		Excecute e=m.getAnnotation(Excecute.class);
		Excecute e1=m1.getAnnotation(Excecute.class);
		Excecute e2=m2.getAnnotation(Excecute.class);
		
		System.out.println(e.Sequence());
		System.out.println(e1.Sequence());
		System.out.println(e2.Sequence());
	}

}
