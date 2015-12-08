import java.util.Scanner;

public class ZadPet {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		System.out.println("Enter another number:");
		int pakUser = potr.nextInt();

		if (pakUser > user) {
			for (int broqch = user; broqch <= pakUser; broqch++) {
				System.out.print(broqch + " ");
			}
		} else {
			for (int bro = pakUser; bro <= user; bro++) {
				System.out.print(bro + " ");
			}
		}
	}

}
