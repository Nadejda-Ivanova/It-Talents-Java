import java.util.Scanner;

public class ZadPet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int a = potr.nextInt();
		int b = potr.nextInt();
		int c = potr.nextInt();

		if (a > b && a > c) {
			
			if (b > c) {
				System.out.println(a+" "+b + " " + c);
			} else {
				System.out.println(a+" "+c + " " + b);
			}
		}

			if (b > a && b > c) {

				

				if (a > c) {
					System.out.println(b+" "+a + " " + c);
				} else {
					System.out.println(b+" "+c + " " + a);
				}
			}
			
				if (c > a && c > b) {
				

					if (b > a) {
						System.out.println(c+" "+b + " " + a);
					} else {
						System.out.println(c+" "+a + " " + b);

					}
				}

				}
			


		

}
