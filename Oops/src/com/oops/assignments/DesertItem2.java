package com.oops.assignments;

import java.util.Scanner;

abstract class Desertitem
{
abstract int getCost(int cost);
}
class CandyItem extends Desertitem
{
int dollarCurrency=60;
@Override
int getCost(int cost)
{
return cost*dollarCurrency;
}
}
class Cookie extends Desertitem
{
int euroCurrency=70;
@Override
int getCost(int cost)
{
return cost*euroCurrency;
}

}
class IceCream extends Desertitem
{
@Override
int getCost(int cost)
{
return cost;
}
}
class DesertItems
{
public String addItemsToStorage(String item1,String item2,String item3){
return item1+item2+item3 +" : 3 Deserts added succesfully";
}

}
public class DesertItem2 extends DesertItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the role : customer(OR)owner ");
		String role=sc.next();
		if(role.equals("owner"))
		{
		DesertItem2 ds=new DesertItem2();
		System.out.println(ds.addItemsToStorage("Candy "," Cookie "," IceCream "));
		}
		else if(role.equals("customer"))
		{
		System.out.println("Candies available ");
		System.out.println("------------------");
		Desertitem desertitem1=new CandyItem();
		System.out.println("Candy : "+desertitem1.getCost(1)+" in rupees");
		Desertitem desertitem2=new Cookie();
		System.out.println("Cookie : "+desertitem2.getCost(1)+" in rupees");
		Desertitem desertitem3=new IceCream();
		System.out.println("IceCream : "+desertitem3.getCost(1)+" in rupees");
		System.out.println("Please select products");
		}
		else
		{
		System.out.println("Please enter valid input");
		}
		sc.close();
	}

}
