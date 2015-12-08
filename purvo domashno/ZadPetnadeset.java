import java.util.Scanner;

public class ZadPetnadeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		byte hour = potr.nextByte(); 
		while(hour<0||hour>24){
			System.out.println("The number you entered is either too big or too small. Try again!");
			hour = potr.nextByte();
		}
		if (hour>18 && hour<=24 || hour>=0 && hour<=4){
			System.out.println ("Good evening.");
		}
		if (hour>4 && hour<=9){
			System.out.println("Good morning.");
		}
		if (hour>9 && hour<=18){
			System.out.println("Good day.");
		}

	}

}
