import java.util.Scanner;

public class ZadChetirinadeset {

	public static void main(String[] args) {
			
		Scanner potr = new Scanner (System.in);
		
		int firstrow = potr.nextInt();
		int firstpole = potr.nextInt();
		int secondrow = potr.nextInt();
		int secondpole = potr.nextInt();
		boolean firstcolorwhite = true;
		boolean secondcolorwhite = true;
		
		if (firstrow%2==0){
			if (firstpole%2==0){
				firstcolorwhite=false;
			}
		}
		else{
			if (firstpole%2!=0){
				firstcolorwhite=false;
			}
		}
		if (secondrow%2==0){
			if (secondpole%2==0){
				secondcolorwhite=false;
			}
		}
		else {
			if (secondpole%2!=0){
				secondcolorwhite=false;
			}
		}
		if(firstcolorwhite==secondcolorwhite){
			System.out.println("The positions have the same color.");
		}
		else {
			System.out.println("The positions have different color.");
		}
			
		
		
		

	}

}
