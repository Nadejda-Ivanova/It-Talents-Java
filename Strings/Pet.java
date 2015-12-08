import java.util.Scanner;
public class Pet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter word");
		String edno = potr.nextLine();
		System.out.println("Enter another word");
		String dve = potr.nextLine();
		int index =0;
		boolean uvedomi=true;
		if(edno.length()>dve.length()){
			for (int br=0; br <= edno.length()-1; br++){
				if (edno.charAt(br)==dve.charAt(0)){
					index = br;
					uvedomi=false;
					break;
				}
			}
		}
		else{
			for(int bro=0; bro<= dve.length()-1; bro++){
				if(dve.charAt(bro)==edno.charAt(0)){
					index=bro;
					uvedomi=false;
					break;
				}
			}
		}
		if(uvedomi==true){
			System.out.println("The words you entered do not have char in common.");
			return;
			
		}
		if(edno.length()>dve.length()){
			for (int broiko=0; broiko<=edno.length()-1; broiko++){
				if (broiko==index){
					System.out.println(dve);
					continue;
				}
				System.out.println(edno.charAt(broiko));
				
			}
		}
		else{
			for(int broqch=0; broqch<=dve.length()-1; broqch++){
				if (broqch==index){
					System.out.println(edno);
					continue;
				}
				System.out.println(dve.charAt(broqch));
			}
		}
	}

}
