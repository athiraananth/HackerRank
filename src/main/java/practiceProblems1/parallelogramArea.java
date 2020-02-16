package practice.Problems1;

import java.util.Scanner;

public class parallelogramArea {
	
		
		static Scanner scan=new Scanner(System.in);
		static boolean flag=true;
		static int b=scan.nextInt();
		static int h=scan.nextInt();
		
		static {
			try {
				if(b<=0 || h<=0) {
					throw new Exception(" Breadth & Height should be Positive");
				}
				else {
					System.out.println("Area : "+ b*h);
				}
			}
			catch(Exception e) {
				System.out.println(e);
				//e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			
		}
		
	

}
