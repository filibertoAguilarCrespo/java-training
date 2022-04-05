package capitulo3;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");

		double rate = inp.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");

		int option = inp.nextInt();

		double amount;
		switch(option)		{
			case 0: System.out.print("Enter the dollar amount: ");
					  amount = inp.nextDouble();
					  System.out.println("$" + amount + " is " + (amount * rate) + " yuan"); break;
			
			case 1: System.out.print("Enter the RMB amount: ");
					
				amount = inp.nextDouble();
			
					System.out.println(amount + " yuan is $" + ((int)((amount * 100) / rate)) / 100.0); break;
			
			default: System.out.println("Incorrect input");
		} 
	}

}
