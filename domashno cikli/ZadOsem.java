import java.util.Scanner;

public class ZadOsem {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		int firstr = 0;
		int secr = 0;

		for (int bro = 1; bro <= user; bro++) {

			firstr = user - 1;
			System.out.print(firstr);

		}

		if (firstr == 0) {
			return;
		}
		for (int br = 1; br < user; br++) {

			System.out.println();

			for (int broiko = 1; broiko <= user; broiko++) {
				secr = firstr + 2;
				System.out.print(secr);

			}
			firstr = firstr + 2;
		}
	}

}
