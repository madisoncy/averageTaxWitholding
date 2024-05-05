package averageTaxWitholding;

import java.util.Scanner;

public class taxWitholding {

	public static void main(String[] args) {
		
		final double taxRate10 = 0.1;
		final double taxRate15 = 0.15;
		final double taxRate20 = 0.2;
		final double taxRate30 = 0.3;
		double avgTaxWithholding;
		
		// Enter income
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter weekly income in whole numbers only: ");
		double income = scanner.nextDouble();

		// Calculate tax withholding
		if (income < 500.0) { 
			avgTaxWithholding = income * taxRate10;
			System.out.println ("Your average tax withholding should be: " + avgTaxWithholding);	
    	} else if (income >= 500.0 && income < 1500.0) {
    		avgTaxWithholding = income * taxRate15;
    		System.out.println ("Your average tax withholding should be: " + avgTaxWithholding);
        } else if (income >= 1500.0 && income < 2500.0) {
        	avgTaxWithholding = income * taxRate20;
        	System.out.println ("Your average tax witholding should be: " + avgTaxWithholding);
		} else if (income >= 2500.0) {
			avgTaxWithholding = income * taxRate30;
			System.out.println ("Your average tax withholding should be: " + avgTaxWithholding);
		}
	}
}
