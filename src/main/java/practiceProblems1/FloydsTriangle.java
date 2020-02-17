package practiceProblems1;

public class FloydsTriangle {
	
	public static void printFloydsTriangle(int row) {
		
		int number=1;
		if(row <=0) {
			throw new IllegalArgumentException("Invali Input!!");
		}
		for(int counter=1;counter<=row;counter++) {
			
			for(int i=1;i<=counter;i++) {
				
				System.out.print(number+" ");
				number++;
			}
			System.out.println( );
		}
		
	}

}
