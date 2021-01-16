package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange{
	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is total?"); //total input for charge
		String totalCharge = myScanner.nextLine(); 
		//System.out.println("you said " +totalCharge ); //test for input
		
		
		System.out.println("How much are you paying?");
		String totalPaid = myScanner.nextLine();
		//System.out.println("you said " + totalCost); // cost test
		
		
		double totalPaidDbl =Double.parseDouble(totalPaid);
		double totalChargeDbl = Double.parseDouble(totalCharge);
		
		
		double makeChange = (totalPaidDbl - totalChargeDbl);
		System.out.println("your Change Is $" +makeChange);
		
	

	}

}
