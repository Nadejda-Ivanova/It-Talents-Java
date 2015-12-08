import java.util.Scanner;

public class Dve {

	public static void main(String[] args) {
		
		Scanner potr = new Scanner (System.in);
		System.out.println("Enter word between 10 and 20 characters:");
		String edno = potr.nextLine();
		System.out.println("Enter another word between 10 and 20 characters:");
		String dve = potr.nextLine();
		
			String sub = edno.substring(0,5);
			String subDve=dve.substring(0,5);
			String ednoEnd = edno.substring(5,edno.length());
			String dveEnd = dve.substring(4,dve.length());
			String ednoRes = subDve+ednoEnd;
			String dveRes= sub+dveEnd;
			if (ednoRes.length()>dveRes.length()){
				System.out.println(ednoRes.length()+" "+ednoRes);
			}
			else {
				System.out.println(dveRes.length()+" "+dveRes);
			}
			
		

	

}
}
