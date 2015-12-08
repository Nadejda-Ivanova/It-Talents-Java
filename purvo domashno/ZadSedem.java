import java.util.Scanner;

public class ZadSedem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		byte chas = potr.nextByte ();
		int pari = potr.nextInt();
		boolean zdrav = potr.nextBoolean();
		if (zdrav==false){
			if (pari!=0){
				System.out.println("I'll buy myself some drugs and I'll stay home.");
			}
			else{
				System.out.println("I'll stay home and I'll drink some tea.");
			}
		}
		if (zdrav==true){
			if (pari>10){
				System.out.println("I'll go with my friends to see a movie.");
			}
			else{
				System.out.println("I'll go out to drink some coffee.");
			}
			}
		}
		
		
	}


