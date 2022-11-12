package com.lambdaassignment;

interface Order{
	void Criteria(int price);
}
public class Lambda2 {

	public static void main(String[] args) {
		Order s1=(a)->
		{
			if(a>10000) {
				System.out.println("order price is more than 100000");
				System.out.println("Completed");
			}
			else
			{
				System.out.println("Accepted");
			}
		};
		s1.Criteria(30000);
	}

}
