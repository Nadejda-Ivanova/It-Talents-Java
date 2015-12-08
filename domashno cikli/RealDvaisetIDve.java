import java.util.Scanner;

public class RealDvaisetIDve {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		int broqch = user;

		while (broqch <= 10) {
			if (user % 2 == 0 || user % 3 == 0 || user % 5 == 0) {

				System.out.print(broqch + ":" + user + ",");
				broqch++;
			}

			user++;
		}
	}

}
