import java.util.Scanner;

public class Osem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter word");
		String start= potr.nextLine();
		boolean palindrome=true;
		for (int br=0; br<=start.length()/2; br++){
			if (start.charAt(br)!=start.charAt(start.length()-1-br)){
				palindrome =false;
				break;
			}
			
		}
		if(palindrome==true){
			System.out.println("The word you entered is a palindrome.");
		}
		else{
			System.out.println("The word you entered is not a palindrome.");
		}

	}

}
