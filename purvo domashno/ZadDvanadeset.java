import java.util.Scanner;

public class ZadDvanadeset {

	public static void main(String[] args) {
		
		Scanner potr = new Scanner(System.in);
		int day = potr.nextInt();
		int month = potr.nextInt();
		int year = potr.nextInt();
		int count = 31;
		
		day++;
		
		switch(month){
		
		
		case 2: count = 28;
		case 4: count = 30;
		case 6: count = 30;
		case 9: count = 30;
		case 11: count = 30;
		}
		
		
		if(year%4==0 && year%100!=0|| year%400==0){
			count=29;
			
		}
		
		if(day>count){
			day=1;
			month++;
		}
		if (month>12){
			month=1;
			year++;
		}
		System.out.println("Next day is "+day+","+month+","+year+".");
		
	}
	}



