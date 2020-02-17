package practiceProblems1;

public class ArraySum {
	
	public static void sumArray( int num[]) {
		
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println("The sum of Array Elements is" +sum);
	}

}
