package practiceProblems1;

public class Display100Primes {
	
	public static void displayPrimes() {
		
		for(int i=1;i<=100;i++) {
			int counter=0;
			for(int num=i;num>=1;num--) {
				if(i%num ==0) {
					counter=counter+1;
				}
			}
			if(counter == 2) {
				System.out.print(i+" ");
			}
		}
	}

}
