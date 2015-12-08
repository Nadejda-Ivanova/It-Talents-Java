import java.util.Scanner;

public class ZadChetirinadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number between 10 and 200:");
		int n = potr.nextInt();
		while (n < 10 || n > 200) {
			System.out.println("The number is not between 10 and 200. Enter another number:");
			n = potr.nextInt();
		}
		for (int a = n-1; a >=0; a--) {
			if (a % 7 == 0) {
				System.out.print(a+" ");
			}
		}

	}

}
