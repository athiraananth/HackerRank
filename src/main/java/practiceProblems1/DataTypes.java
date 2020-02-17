package practiceProblems1;

public class DataTypes {
	
	public static void findDataType(Integer number) {
		
		System.out.println(number);
		if(number>= -128 &&number <=127) {
		
			System.out.println("Byte ");
		}
		if(number >= -32768 && number<=32767) {
			System.out.println(" Short ");
		}
		if(number >= - Math.pow(2, 31) && number<=Math.pow(2, 31)-1) {
			System.out.println(" Int ");
		}
		if(number >= - Math.pow(2, 63) && number<=Math.pow(2, 63)-1) {
			System.out.println(" Long ");
		}
		else {
			System.out.println(number+ " can't be fitted anywhere");
		}
	}

}
