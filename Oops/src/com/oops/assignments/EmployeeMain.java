package com.oops.assignments;
class Employee{
	String name;
	double salary;
	
	public Employee() {
		name=null;
		salary=0.0;
	}
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	double getSalary() {
		return salary;
	}
}
class Manager extends Employee{
	int pf,tx;
	public Manager() {
		super();
		pf=tx=0;
	
	}
	Manager(String name,double salary,int p,int tax){
		super(name,salary);
		pf=p;
		tx=tax;
	}
	double getSalary() {
		return (super.getSalary()+pf+tx);
	}
}
class Labour extends Employee{
	int pf,tx;
	 public Labour() {
		super();
		pf=tx=0;
	}
	 
	 Labour(String name,double salary,int pff,int tax){
		 super(name,salary);
		 pf=pff;
		 tx=tax;
	 }
	 double getSalary() {
		 return (super.getSalary()+pf+tx);
	 }
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager("Aarti", 45327.87, 5000, 2000);
		System.out.println("Manager is Incentive");
		System.out.println("Total Salary of Manager is: "+m1.getSalary());
		
		Labour L1=new Labour("Akash", 42231.2, 3000, 2000);
		System.out.println("Labour is Over Time");
		System.out.println("Total Salary of Labour is: "+L1.getSalary());
	}

}
