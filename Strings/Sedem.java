import java.util.Scanner;

public class Sedem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter statement");
		String start= potr.nextLine();
		String [] caps = start.split(" ");
		int broiDumi = caps.length;
		int max=0;
		for(int br=0; br<=caps.length-1; br++){
			if (caps[br].length()>max){
				max = caps [br].length();
			}
		}
		System.out.println(broiDumi+" words, the longest one has "+max+" characters in it");

	}

}
