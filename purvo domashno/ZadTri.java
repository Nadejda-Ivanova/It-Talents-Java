import java.util.Scanner;

public class ZadTri {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner pak= new Scanner (System.in);
		System.out.println("Enter first number:");
		
		a= pak.nextDouble();
		System.out.println("Enter second number:");
		
		b= pak.nextDouble();
		
		while (a==b){
			System.out.println("Numbers are equal. Please enter different numbers.");
			System.out.println("Enter first number:");
			
			a= pak.nextDouble();
			System.out.println("Enter second number:");
			
			b= pak.nextDouble();
			
		}
		c=b;
		b=a;
		a=c;
		System.out.println(a+","+b);
		
		

	}

}
