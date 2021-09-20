package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.TransactionService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TransactionService ts = new TransactionService();
			

			System.out.println("Enter the size of transaction array");
			int trnSize = sc.nextInt();

			int[] transactions = new int[trnSize];
			System.out.println("Enter the values of array");

			for (int i = 0; i < transactions.length; i++) {
				transactions[i] = sc.nextInt();
			}

			System.out.println("Enter the total no of targets that needs to be achieved");
			int targetNo = sc.nextInt();

			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			
			int target = ts.isTargetAchieved(transactions, targetNo, targetValue);
			
			
			
			if(target != -1) {
				System.out.println("Target Achieved after "+ target + " Transactions");
			}else {
				System.out.println("Given target is not achieved ");
			}

		
		sc.close();

	}

}
