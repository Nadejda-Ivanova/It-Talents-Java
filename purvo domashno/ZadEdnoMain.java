import java.util.Scanner;

public class ZadEdnoMain {

	public static void main(String[] args) {
		Scanner Potredno = new Scanner (System.in);
		double a = 0 ; 
		double b = 0 ;
		System.out.println("Enter the first number:");
		a = Potredno.nextDouble();
		System.out.println("Enter the second number:");
		b = Potredno.nextDouble();
		double c = 0;
		System.out.println("Enter the third number:");
		c = Potredno.nextDouble();
		
		if ( a<c && c<b ) {
			System.out.println("The number " +c +" is between "+a+" and "+b+".");
			}
		else {
			System.out.println("The number " +c +" is not between "+a+" and "+b+".");
		}
		
		Potredno.close ();
		
	}

}
