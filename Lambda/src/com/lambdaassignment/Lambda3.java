package com.lambdaassignment;


import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Functions{
	public void Demo(int a);
}
public class Lambda3 {

	public static void main(String[] args) {
		Predicate<Integer> pr=a->a%2==0;
		System.out.println(pr.test(5));
		
		Supplier<Date> S = () -> new Date();
        System.out.println(S.get());
		
		Consumer<String>cs=(t)->System.out.println(t);
		cs.accept("Hello");
		
		Function<Integer,Integer>fn=a->a*a;
		System.out.println(fn.apply(5));
	}

}
