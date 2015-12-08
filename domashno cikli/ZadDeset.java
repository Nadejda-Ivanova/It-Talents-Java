import java.util.Scanner;

public class ZadDeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int user = potr.nextInt();
		boolean isPrime=true;
		
		
		for (int a=2; a<=user/2; a++){
			if (user%a==0){
				isPrime=false;
				break;
			}
			
		}
		if (isPrime==true){
			System.out.println("The number is prime.");
		}
		if (isPrime==false){
			System.out.println("The number is not prime.");
		}

	}

}
