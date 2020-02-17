package practiceProblems1;

public class ReverseNumber {
	
	public static int findReverse(int num) {
		
		int result=0;
		//153
		while(num>0) {
			
			int a=num%10;
			result=result*10+a;
			num=num/10;
		}
		
		return result;
		
	}

}
