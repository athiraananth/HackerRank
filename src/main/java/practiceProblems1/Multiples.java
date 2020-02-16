package practice.Problems1;

public class Multiples {
	
	public static void generateMultiples(int number) {
		if(number>=2 &&number<=20) {
			for(int i=1;i<=10;i++) {
				System.out.println(number+" X "+i+" = "+ number*i);
			}
		}
		else {
			throw new IllegalArgumentException(" Invalid Number !!");
		}
		
	}

}
