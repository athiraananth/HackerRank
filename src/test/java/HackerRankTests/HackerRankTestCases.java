package HackerRankTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiceProblems1.ArmstrongNumber;
import practiceProblems1.BinarySearchTreeNode;
import practiceProblems1.ConditionalActions;
import practiceProblems1.DataTypes;
import practiceProblems1.Display100Primes;
import practiceProblems1.IntToString;
import practiceProblems1.LowestCommonAncestor;
import practiceProblems1.Multiples;
import practiceProblems1.SwapNumbers;
import practiceProblems1.findDay;

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
	
	@Test(enabled=false)
	public static void convertStringTest() {
		IntToString.convertToString(99);
		IntToString.convertToString(100);
		IntToString.convertToString(101);
		IntToString.convertToString(50);
		IntToString.convertToString(-99);
		IntToString.convertToString(-100);
		IntToString.convertToString(-101);
	}
	
	@Test(enabled=false,groups= {"regression"})
	public static void bstLCA_Test() {
		BinarySearchTreeNode bst=new BinarySearchTreeNode(20);
		BinarySearchTreeNode left1=bst.insertLeft(10);
		bst.insertRight(30);
		BinarySearchTreeNode left2=left1.insertLeft(5);
		BinarySearchTreeNode lRight1=left1.insertRight(15);
		BinarySearchTreeNode left3=left2.insertLeft(2);
		left2.insertRight(7);
		BinarySearchTreeNode left4=lRight1.insertLeft(12);
		lRight1.insertRight(18);
		
		BinarySearchTreeNode right1=bst.insertRight(30);
		BinarySearchTreeNode rLeftt1=right1.insertLeft(25);
		BinarySearchTreeNode rLeftt2=rLeftt1.insertLeft(23);
		rLeftt1.insertRight(28);
		BinarySearchTreeNode rRight1=right1.insertRight(35);
		BinarySearchTreeNode rLeftt3=rRight1.insertLeft(32);
		BinarySearchTreeNode rright1=rRight1.insertRight(40);
		LowestCommonAncestor lc=new LowestCommonAncestor();
		System.out.println(lc.findLCA(rLeftt2, rright1, bst).getKey());
		System.out.println(lc.findLCA(rLeftt3, rright1, bst).getKey());
		
	}
	
	@Test(groups= {"swap"},enabled=false)
	public static void swap_Test1() {
		SwapNumbers sn=new SwapNumbers();
		sn.swapIntegers(5, 8);
	}
	@Test(groups= {"swap"},enabled=false,expectedExceptions= {IllegalArgumentException.class})
	public static void swap_Test2() {
		SwapNumbers sn=new SwapNumbers();
		sn.swapIntegers(0, 0);
	}
	@Test(groups= {"swap"},enabled=false,expectedExceptions= {IllegalArgumentException.class})
	public static void swap_Test3() {
		SwapNumbers sn=new SwapNumbers();
		sn.swapIntegers(2, 2);
	}
	
	@Test(enabled=false)
	public static void getDay_Test1() {
	System.out.println(findDay.getDay(1984, 10, 22));
	}
	
	@Test(enabled=false)
	public static void Prime_Test() {
		PrimeNumbers.isPrime(17);
	}
	
	@Test(enabled=false)
	public static void printPrime_Test() {
		Display100Primes.displayPrimes();
	}
	
	@Test
	public static void Armstrong_Test() {
		ArmstrongNumber.isArmstrong(153);
	}
}
