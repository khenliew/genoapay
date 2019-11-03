package org.genoapay;

import org.junit.Assert;
import org.junit.Test;

public class ProfitSeekerTest {

	@Test
	public void testGetMaxProfit() {
		
		ProfitSeeker seeker = new ProfitSeeker();

		//Normal Scenario, should pick up 15-3=12
		int[] stockPrices = {10, 7, 5, 8, 11, 9, 3, 6, 15, 1, 10};
		Assert.assertEquals(12, seeker.getMaxProfit(stockPrices));

		//Scenario without price
		stockPrices = new int[] {};
		Assert.assertEquals(0, seeker.getMaxProfit(stockPrices));

		//Scenario without sufficient price to compare
		stockPrices = new int[] {10};
		Assert.assertEquals(0, seeker.getMaxProfit(stockPrices));
		
		//No profit scenario
		stockPrices = new int[] {10, 9, 8, 7, 6};
		Assert.assertEquals(0, seeker.getMaxProfit(stockPrices));
		
	}

}
