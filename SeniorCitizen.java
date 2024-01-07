package task8;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
				int age;
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter the age");
				age=sc.nextInt();
				
				if(age>18)
				{
					System.out.println("Senior Citizen");
					
				}
				else 
				{
					System.out.println("not a Senior Citizen");
				}

	}

}
