package masivi;

import java.util.Scanner;

public class DevetDve {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		int [] masiv = new int [dulj];
		
		for (int bro=0; bro<=dulj-1; bro++){
			System.out.println("Enter number:");
			masiv [bro] = potr.nextInt();
		}
		for (int br=0; br<(dulj-1)/2; br++){
			masiv [br]= masiv[br]+ masiv [dulj-1-br];
			masiv [dulj-1-br]=masiv[br]-masiv [dulj-1-br];
			masiv [br]= masiv[br]-masiv [dulj-1-br];
		}
		for (int broqch=0; broqch<=dulj-1; broqch++){
			System.out.print(masiv[broqch]+" ");
		}

		
		

	}

}
