package com.oops.assignments;
public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount s1= new SavingsAccount("subha",10301,"Savings");
		s1.totCash(30000, 5, 3);
		CurrentAccount c1= new CurrentAccount("mangala",10305,"Current");
		c1.totCash(2500000);
	}

}
