package task8;

import java.util.Scanner;

public class IntegerDigits {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value");
		int number =sc.nextInt();
				
		int total = 0;
		
		while(number != 0)
		{
			int count = number % 10;
			total++;
			number = number / 10;
		}

		System.out.println("Number of IntergerDigits  "+total);
	}

}
