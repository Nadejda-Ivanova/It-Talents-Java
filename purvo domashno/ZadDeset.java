import java.util.Scanner;

public class ZadDeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int obemcisterna= potr.nextInt();
		int a = obemcisterna/5;
		int b = a; 
		int c = obemcisterna-((obemcisterna/5)*5);
		if (c==4){
			System.out.println(a+" two litter buckets. "+b+" three litter buckets. Add two additional two litter buckets.");
		}
		if (c==3){
			System.out.println(a+" two litter buckets. "+b+" three litter buckets. Add one additional three litter bucket.");

	}
		if (c==2){
			System.out.println(a+" two litter buckets. "+b+" three litter buckets. Add one additional two litter bucket.");

}
		if (c==1){
			b=b-1;
			System.out.println(a+" two litter buckets. "+b+" three litter buckets. Add four additional two litter buckets." );
		}
		if (c==0){
			System.out.println(a+" two litter buckets. "+b+" three litter buckets.");
		}
	}
}
			