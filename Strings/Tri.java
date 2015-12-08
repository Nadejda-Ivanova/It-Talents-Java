import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		Scanner potr = new Scanner (System.in);
		System.out.println("Enter word");
		String edno = potr.nextLine();
		System.out.println("Enter another word");
		String dve = potr.nextLine();
		boolean difference=false;
		
		if (edno.length()>dve.length()){
			System.out.println("The first string has greater length than the second.");
			System.out.println("Difference in positions:");
		}
		else{
			if(edno.length()==dve.length()){
				System.out.println("The two strings have the same length.");
				System.out.println("Difference in positions:");
			}
			else{
				System.out.println("The second string has greater length than the first.");
				System.out.println("Difference in positions:");
			}
		}
		if (dve.length()>=edno.length()){
			for(int br=0; br<=edno.length()-1;br++){
				if (edno.charAt(br)!=dve.charAt(br)){
					difference = true;
					System.out.println((br+1)+" "+edno.charAt(br)+"-"+dve.charAt(br));
				}
			}
		}
		else{
			for(int bro=0; bro<=dve.length()-1;bro++){
				if (dve.charAt(bro)!=edno.charAt(bro)){
					difference = true;
					System.out.println((bro+1)+" "+edno.charAt(bro)+"-"+dve.charAt(bro));
				}
			}
		}
		if (difference==false){
			System.out.println("There is no difference in positions.");
		}
	}

}
