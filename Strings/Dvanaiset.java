import java.util.Scanner;

public class Dvanaiset {
	static int[] UserArray(int n){
		int []array = new int [n];
		int count =1;
		for(int br=0; br<=array.length-1; br++){
			array[br]=count;
			count++;
		}
		return array;
	}
	static void PrintOut(int []masiv){
		for(int br=0; br<=masiv.length-1; br++){
			System.out.print(masiv[br]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner potr= new Scanner(System.in);
		System.out.println("Enter number:");
		
		int num = potr.nextInt();
		
		int []arr = UserArray(num);
		PrintOut(arr);
	}

}
