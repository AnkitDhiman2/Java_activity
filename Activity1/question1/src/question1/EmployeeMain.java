package question1;

import java.util.Scanner;

public class EmployeeMain {
	
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		Employee emp = new Employee();
		
		System.out.println("Enter the name");
		input = sc.nextLine();
		emp.setName(input);
		
		
		System.out.println("Enter the adress");
		input = sc.nextLine();
		emp.setAdress(input);
		
		
		System.out.println("Enter the mobile");
		input = sc.nextLine();
		emp.setMobile(input);
		
		
		System.out.println("Employee Details");
		System.out.println("Name: " + emp.getName());
		System.out.println("Adress: "+ emp.getAdress());
		System.out.println("Mobile: "+emp.getMobile());
		
		sc.close();
		
	}

}
