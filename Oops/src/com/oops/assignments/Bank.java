package com.oops.assignments;

public class Bank {
	String uName;
	int accNo;
	String acctype;
	
	Bank(String name, int accno, String acctype) {
		super();
		this.uName = name;
		this.accNo = accno;
		this.acctype = acctype;
	}
	
	public static void totCash() {
		System.out.println("Total cash in your account");
	}	
}
class SavingsAccount extends Bank{
	SavingsAccount(String name, int accno, String accType){
		super(name,accno,accType);
	}
	public void totCash(int fdAmt,int interest,int years) {
		int totAmt=(fdAmt*interest*years);
		System.out.println("Total cash in "+super.acctype+ " account is  : "+totAmt);
	}
}
class CurrentAccount extends Bank{
	CurrentAccount(String name, int accno, String accType){
		super(name,accno,accType);
	}
	public void totCash(int limit) {
		int totAmt=1000000;
		int bal=limit-totAmt;
		System.out.println("Total cash in "+super.acctype+ " account is  : "+totAmt);
		System.out.println("you can still withdraw"+bal+"rupees");
	}

}
