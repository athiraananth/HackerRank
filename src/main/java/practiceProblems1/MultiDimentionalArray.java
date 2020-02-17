package practiceProblems1;

public class MultiDimentionalArray {
	
	public static void generateMultiArray() {
		//int[][] num= {{2,4,5},{1,7,9},{10,3,6}};
		int[][] num= {{22,14,35},{11,17,19},{20,34,66}};
		System.out.println("Minimum is " +findMinimum(num));
		System.out.println("Maximum is " +findMaximum(num));
		//System.out.println(num.length);	
	}
	
	public static int findMinimum(int[][] num) {
		int min=num[0][0];
		//System.out.println(num.length);	
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(min>num[i][j]) {
					min=num[i][j];
				}
			}
		}
		
		return min;
	}
	
	public static int findMaximum(int[][] num) {
		int max=num[0][0];
		//System.out.println(num.length);	
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(max<num[i][j]) {
					max=num[i][j];
				}
			}
		}
		return max;
	}

}
