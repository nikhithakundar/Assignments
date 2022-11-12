package com.collectionAssignments;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose any of the option");
        String options;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 id");
        System.out.println("2 Name");
        System.out.println("3 Department");
        System.out.println("4 Salary");
        int menuOption = sc.nextInt();
        switch (menuOption)
        {
            case 1:
                options = "(a) ID";
            break;
            case 2:
                options = "(b) Name";
                TreeSet<employeeDetails> Employee = new TreeSet<>(new FirstComparator());
                Employee.add(new employeeDetails(111,"anu","sales",24000));
                Employee.add(new employeeDetails(112,"neenu","planning",25000));
                Employee.add(new employeeDetails(113,"sara","admin",50000));
                Employee.add(new employeeDetails(114,"ansu","HR",40000));
                for (employeeDetails empdt : Employee)
                {
                    System.out.println(empdt);
                }

            break;
            case 3:
                options = "(c) Department";
            break;
            case 4:
                options = "(d) Salary";
            break;
        }

    }
}

class FirstComparator implements Comparator<employeeDetails>
{
    public int compare(employeeDetails e1, employeeDetails e2)
    {
        return(e1.name).compareTo(e2.name);
    }
}

class employeeDetails
{
    public int id;
    public String name;
    public String department;
    public double salary;
    employeeDetails()
    {

    }

        employeeDetails(int id, String name, String department, double salary)
        {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        public String toString()
        {
            return " "+this.id+" "+this.name+" "+this.department+" "+this.salary;
	}

}
