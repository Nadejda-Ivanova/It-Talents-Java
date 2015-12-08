package masivi;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Deset {

	public static void main(String[] args) {
		Scanner potr = new Scanner (System.in);
		int sredna = 0;
		int sum =0;
		int difference =0;
		int element=0;
		int result = Integer.MAX_VALUE;
		int [] masiv = new int [7];
		for (int bro=0; bro<=6; bro++){
			System.out.println("Enter number:");
			masiv[bro]= potr.nextInt();
		}
		for (int br=0; br<=6; br++){
			sum = sum+masiv[br];
		}
		sredna = sum/7;
		
		for (int broqch=0; broqch<=6; broqch++){
			difference = masiv [broqch]-sredna;
			if (difference<0){
				difference= -difference;
			}
			if (difference<result){
				result=difference;
				element = masiv[broqch];
			}
		}
		System.out.println("Sredna stoinost "+sredna+",nai-blizka stoinost "+element);
		
	}
	

}
