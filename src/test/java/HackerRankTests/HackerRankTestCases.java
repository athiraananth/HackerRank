package HackerRankTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.Problems1.ConditionalActions;
import practice.Problems1.DataTypes;
import practice.Problems1.IntToString;
import practice.Problems1.Multiples;

public class HackerRankTestCases {

	
	@Test(enabled=false)
	public static void conditionalActions_Test() {
		Assert.assertEquals(ConditionalActions.IsWeird(5), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(4), "Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(1), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(2), "Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(8), "Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(22),"Not Weird");
		Assert.assertEquals(ConditionalActions.IsWeird(6), "Weird");
	}
	
	@Test(enabled=false)
	public static void mulitples_Test() {
		Multiples.generateMultiples(2);
		Multiples.generateMultiples(3);
		Multiples.generateMultiples(10);
		Multiples.generateMultiples(19);
		Multiples.generateMultiples(20);
		
	}
	@Test(expectedExceptions= {IllegalArgumentException.class},enabled=false)
	public static void mulitples_Test2() {
		//Negative tests
		Multiples.generateMultiples(1);
		Multiples.generateMultiples(21);
		
	}
	
	@Test(enabled=false)
	public static void dataTypes_Test() {
		DataTypes.findDataType(-150);
		DataTypes.findDataType(150000);
		DataTypes.findDataType(5);
		DataTypes.findDataType(1500000000);
		//DataTypes.findDataType(2133333333333333);
	}
	
	@Test
	public static void convertStringTest() {
		IntToString.convertToString(99);
		IntToString.convertToString(100);
		IntToString.convertToString(101);
		IntToString.convertToString(50);
		IntToString.convertToString(-99);
		IntToString.convertToString(-100);
		IntToString.convertToString(-101);
	}
}
