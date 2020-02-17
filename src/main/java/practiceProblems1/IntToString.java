package practiceProblems1;

public class IntToString {
	
	public static void convertToString(int number) {
		
		String s ="";
		if(number>=-100 && number<=100) {
			s=String.valueOf(number);
			System.out.println("GoodJob");
		}
		else {
			System.out.println("Wrong Answer");
		}
	}

}
