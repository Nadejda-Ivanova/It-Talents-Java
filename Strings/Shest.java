import java.util.Scanner;

public class Shest {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter statement");
		
		char change = ' ';
		String start= potr.nextLine();
		String [] caps = start.split(" ");
		StringBuilder [] result = new StringBuilder [caps.length];
		for(int bro=0; bro<=caps.length-1; bro++){
			
			change = (char)(caps[bro].charAt(0) - 'a'+'A');
			String changer = Character.toString(change);
			result[bro]=new StringBuilder (caps[bro]);
			result[bro]= result[bro].replace(0, 1, changer);
			}
		String finalRes = String.join(" ",result);
		System.out.println(finalRes);
	}

}
