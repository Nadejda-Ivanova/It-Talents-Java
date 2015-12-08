import java.util.Scanner;

public class ZadOsem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int nch= potr.nextInt();
		int a,b,c,d,e,f=0;
		a=nch/1000;
		b=(nch%1000)/100;
		c=((nch%1000)%100)/10;
		d=((nch%1000)%100)%10;
		e= 10*a+d;
		f=10*b+c;
		if (e>f){
			System.out.println("Number "+e+" is bigger than number "+f);
		}
		if(e==f){
			System.out.println("Number "+e+" is equal to number "+f);
		}
		if(e<f){
			System.out.println("Number "+f+" is bigger than number "+e);
		}
		

	}

}
