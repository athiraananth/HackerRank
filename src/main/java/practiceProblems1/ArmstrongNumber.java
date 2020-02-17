package practiceProblems1;

public class ArmstrongNumber {
	
	public static void isArmstrong(int number) {
		
		int count=0,sum=0;
		int num=number;
		while(num>0) {
			count++;
			num=num/10;
		}
		num=number;
		while(num>0) {
			
			double digit=num%10;
			sum=(int) (sum+Math.pow(digit, count));
			num=num/10;
		}
		if(sum== number) {
			System.out.println(number+" is an armstrong number");
		}
		else {
			System.out.println(number+" is not an armstrong number");
		}
	}

}
