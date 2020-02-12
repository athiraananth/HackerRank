package practice.Problems1;

/*Task : Given an integer, n , perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Input Format : A single line containing a positive integer, .
Constraints : 1<= n <=100
Output Format : Print Weird if the number is weird; otherwise, print Not Weird.
 */
public class ConditionalActions {

	public static String IsWeird( int n) {
		
		String output="";
		if(n<1 || n>100) {
			throw new IllegalArgumentException(" Invalid Input!");
		}
		else {

			if(n%2==0) {
				if(n>=2 && n<=5) {
					output="Not Weird";
					System.out.println("Not Weird");
				}
				else if(n>=6 && n<=20) {
					output="Weird";
					System.out.println("Weird");
				}
				else if(n>20) {
					output="Not Weird";
					System.out.println("Not Weird");
				}
			}
			else {
				output="Weird";
				System.out.println("Weird");
			}
		}
		return output;
	}

}
