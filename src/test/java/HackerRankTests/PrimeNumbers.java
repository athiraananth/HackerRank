package HackerRankTests;

public class PrimeNumbers {

	public static void isPrime(int number) {

		boolean flag=true;
		if(number ==0 || number==1) {
			flag=false;
		}
		else {
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {

					flag=false;
					break;
				}

			}
		}

		if(flag) {
			System.out.println(number +" is Prime");}
		else {
			System.out.println(number+"is not Prime");
		}
	}

}
