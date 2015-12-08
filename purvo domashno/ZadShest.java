import java.util.Scanner;

public class ZadShest {

	public static void main(String[] args) {
		
		Scanner potr = new Scanner(System.in);
		int a = potr.nextInt();
		int a2 = potr.nextInt();
		int a3 = potr.nextInt();
		/*int b1=a;
		int b2=a2;
		int b3=a3;
		a=b2;
		a2=b3;
		a3=b1;*/
		int b = a;
		a=a2;
		a2=a3;
		a3=b;
		System.out.println(a+" "+a2+" "+a3);
	}

}
