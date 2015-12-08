import java.util.Scanner;

public class Devet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter line:");
		String start = potr.nextLine() + "h";
		int number = 0;
		int length = 0;
		int minus = 0;
		int sum = 0;
		StringBuilder rStart = new StringBuilder(start);
		for (int br = 0; br <= rStart.length() - 1; br++) {

			if (rStart.charAt(br) >= '0' && rStart.charAt(br) <= '9') {
				number = rStart.charAt(br) - '0';
				length = br + 1;
				minus = br;

				while (rStart.charAt(length) >= '0' && rStart.charAt(length) <= '9') {
					number = number * 10 + ((rStart.charAt(length) - '0'));

					length++;

					br = length;

				}
				if (minus > 0 && rStart.charAt(minus - 1) == '-') {
					number = -number;
				}
				System.out.print(number + " ");
				sum = sum + number;

			}

		}
		System.out.println();
		System.out.println("The sum of the above is " + sum);

	}

}
