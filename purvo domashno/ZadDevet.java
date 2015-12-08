import java.util.Scanner;

public class ZadDevet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int a = potr.nextInt();
		int b = potr.nextInt();
		int d = a*b;
		int c = (((a*b)%1000)%100)%10;
		if (c%2==0){
			System.out.println(d+", "+c+", "+"even");
	}
		else {
			System.out.println(d+", "+c+", "+"odd");
}
	}
}
