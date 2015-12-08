import java.util.Scanner;

public class Chetiri {

	public static void main(String[] args) {
		Scanner potr = new Scanner (System.in);
		System.out.println("Enter names:");
		int index=0;
		String user = potr.nextLine();
		for(int br=0; br<=user.length()-1;br++){
			if(user.charAt(br)==','){
				index = br;
				break;
			}
		}
		String edno = user.substring(0,index);
		String dve = user.substring(index,user.length());
		
		int firstSum=0;
		int secondSum=0;
		for(int br=0; br<=edno.length()-1; br++){
			firstSum = firstSum+(int)edno.charAt(br);
		}
		for(int bro=0; bro<=dve.length()-1; bro++){
			secondSum = secondSum+(int)dve.charAt(bro);
		}
		if(firstSum>secondSum){
			System.out.println(edno);
		}
		else{
			if(firstSum==secondSum){
				System.out.println("The sums of those names are equal. ");
			}
			else{
				System.out.println(dve);
			}
		}

	}

}
