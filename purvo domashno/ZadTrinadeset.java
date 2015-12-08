import java.util.Scanner;

public class ZadTrinadeset {

	public static void main(String[] args) {
		
		Scanner potr = new Scanner(System.in);
		System.out.println("Please enter temperature between -100C and 100C.");
		byte temp = potr.nextByte();
		while (temp<-100||temp>100){
			System.out.println("The temperature you entered is not between -100C and 100C. Please enter different temperature.");
			temp = potr.nextByte();
		}
		if (temp<= -20){
			System.out.println("freezing");
		}
		if(temp>-20 && temp<=0){
			System.out.println("cold");
		}
		if(temp>0 && temp<=15){
			System.out.println("cool");
		}
		if (temp>15 && temp<=25){
			System.out.println("warm");
		}
		if (temp>25){
			System.out.println("hot");
		}
	}

}
