package task8;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int prime, num=0;		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value");
		prime = sc.nextInt();
		
		for(int i=2; i<prime; i++)
	      {
	         if(prime%i == 0)
	         {
	            num++;
	            break;
	         }
	      }
	
		if(num==0)  
		System.out.print("The given number is prime number");
				else
			System.out.print("The given number is not prime number");
}
}
	
