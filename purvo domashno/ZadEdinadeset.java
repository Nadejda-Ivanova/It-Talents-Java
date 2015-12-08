import java.util.Scanner;

public class ZadEdinadeset {

	public static void main(String[] args) {
		Scanner potr= new Scanner(System.in);
		System.out.println("Please enter a three digit number that has no zero in it.");
		int a = potr.nextInt();
		int b = a/100;
		int c = (a%100)/10;
		int d = (a%100)%10;
		
		while (a==0 || b==0 || c==0 || d==0){
			System.out.println("The number has zero in it. Please enter different three digit number.");
			a = potr.nextInt();
			b = a/100;
			c = (a%100)/10;
			d = (a%100)%10;
			
		}
		if (a%b==0 && a%c==0 && a%d==0){
			System.out.println("The number can be divided by all its digits.");
		}
		else{
			System.out.println("The number cannot be divided by one or more of its digits.");
		}

	}

}
