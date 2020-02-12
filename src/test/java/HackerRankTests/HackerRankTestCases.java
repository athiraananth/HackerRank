package HackerRankTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.Problems1.ConditionalActions;

public class HackerRankTestCases {

	
	@Test
	public static void conditionalActions_Test() {
		Assert.assertEquals(ConditionalActions.IsWeird(5), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(4), "Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(1), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(2), "Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(8), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(22),"Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(6), "Weird");
	}
}
