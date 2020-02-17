package practiceProblems1;

public class SwapNumbers {
	
	//2,3
	public static void swapIntegers(int number1,int number2) {
		
		if(number1 == 0 && number2 == 0 || number1 == number2) {
			throw new IllegalArgumentException(" Invalid Input!!");
		}
		System.out.println("Number1 before swaping " + number1);
		System.out.println("Number2 before swaping " + number2);
		
		number2=number1+number2; 
		number1=number2-number1;
		number2=number2-number1;
		
		System.out.println("Number1 after swaping " + number1);
		System.out.println("Number2 after swaping " + number2);
	}

}
