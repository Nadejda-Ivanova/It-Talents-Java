import java.util.Scanner;

public class ZadPetnadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = potr.nextInt();
		int sum = 0;
		int a = 1;

		do {
			sum = sum + a;
			a++;
		} while (a <= n);

		System.out.println(sum);
	}

}
