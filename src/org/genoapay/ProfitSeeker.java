package org.genoapay;

public class ProfitSeeker {
	
	public int getMaxProfit(int[] prices) {
		//Lowest and highest price points
		int lowest = 0;
		int highest = 0;
		
		//Nested loop to compare prices after every price 
		for (int i=0; i<prices.length; i++) {
			for (int j=i+1; j<prices.length; j++) {
				//Higher profit found, record it in lowest and highest
				if (prices[j]-prices[i]> highest-lowest) {
					highest = prices[j];
					lowest = prices[i];
				}
			}
		}
		return highest - lowest;
	}

}
