import java.util.Scanner;

public class Edno {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter text");
		String edno = potr.nextLine();
		System.out.println("Enter text");
		String dve = potr.nextLine();
		
		System.out.print(edno.toLowerCase()+" "+edno.toUpperCase()+" "+dve.toLowerCase()+" "+dve.toUpperCase());
		
		
		

	}

}
