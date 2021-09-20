package com.greatlearning.services;

public class TransactionService {
	
	
	
	 public int isTargetAchieved(int[] transactions, int targetNo, int targetValue){
	
		int sum = 0;
		int targetIndex = -1;
		for(int i=0; i<targetNo; i++) {
			
			sum = sum + transactions[i];
			
			if (targetValue <= sum) {
				targetIndex = i+1;
				break;
			}
		
		}
		
		
		return targetIndex;
	}

}
