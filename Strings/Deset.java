import java.util.Scanner;

public class Deset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter word:");
		String edno = potr.nextLine();
		char change = ' ';
		int doer = 5;
		int num = 0;
		char fin = ' ';
		StringBuilder result = new StringBuilder(edno);
		for (int br = 0; br <= result.length() - 1; br++) {

			change = result.charAt(br);
			num = doer + (int) change;
			fin = (char) num;
			String tr = Character.toString(fin);
			result.replace(br, br + 1, tr);

		}
		System.out.println(result);

	}

}
