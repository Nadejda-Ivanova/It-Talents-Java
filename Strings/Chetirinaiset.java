import java.util.Scanner;

public class Chetirinaiset {
	static int Factorial(int n){
		if(n==1){
			return 1;
		}
		return n*Factorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner potr = new Scanner (System.in);
		System.out.println("Enter number:");
		int num=potr.nextInt();
		int fact=Factorial(num);
		System.out.println(fact);
	}

}
