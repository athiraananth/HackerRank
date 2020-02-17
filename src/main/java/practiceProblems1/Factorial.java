package practiceProblems1;

public class Factorial {
	
	public static int findFactorial(int n) {
		
		if(n<1) {
			throw new IllegalArgumentException(" Invalid Input");
		}
		if(n == 1  ) {
			return 1;
		}
		else {
			return n*findFactorial(n-1);
		}
	}

}
