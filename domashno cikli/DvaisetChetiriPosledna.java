import java.util.Scanner;

public class DvaisetChetiriPosledna {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		
		while (user<10 || user>30000 ){
			System.out.println("The number you entered is too small or too big. Enter another number:");
			user = potr.nextInt();
		}
		int kraen = user;
		int turn = 0;
		while (user / 10 != 0) {
			turn = turn + user % 10;
			turn = turn * 10;
			user = user / 10;

		}
		turn = turn + user % 10;

		if (turn == kraen) {
			System.out.println("The number is palindrome.");
		} else {
			System.out.println("The number is not palindrome.");
		}
	}

}
