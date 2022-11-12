package com.oops.assignments;
abstract class Sample{
	public void display() {
		System.out.println("It is a non abstract method");
	}
}
abstract class Bike{
	public abstract void run();
	void changeGear(){
		System.out.println("Changing the gear");
	}
}
class Honda extends Bike{
	public void run() {
		System.out.println("Motocycle is running");
	}
}

public class AbstractExamp {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike h= new Honda();
			h.run();
			h.changeGear();
	}

}
