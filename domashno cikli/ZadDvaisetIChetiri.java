import java.util.Scanner;

public class ZadDvaisetIChetiri {

	public static void main(String[] args) {

		
		int pakbroqch = 0;
		int mnojitelEdno = 1;
		int mnojitelDve = 1;

		
			while (pakbroqch <= 9) {
				while (mnojitelDve <= 9) {

					System.out.print(mnojitelEdno + "*" + mnojitelDve + ";");
					mnojitelDve++;
				}
				mnojitelEdno++;
				mnojitelDve = mnojitelEdno;
				pakbroqch++;
				System.out.println();
			}

			

		}

	}


