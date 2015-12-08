
public class tri {

	public static void main(String[] args) {
		int[][] masiv = { 	{ 8, 12, 1, 4, 2 }, 
							{ 27, 34, 513, 65, 75 }, 
							{ 11, 17, 23, 34, 55 }, 
							{ 18, 95, 43, 94, 45 },
							{ 69, 62, 53, 44, 85 }, 
							{ 31, 62, 61, 64, 55 } };

		int suma = 0;
		int sredno = 0;
		int count = 0;
		for (int bro = 0; bro <= masiv.length - 1; bro++) {
			for (int pakBro = 0; pakBro < masiv.length - 1; pakBro++) {
				suma = suma + masiv[bro][pakBro];
				count++;
			}
		}
		sredno = suma / count;
		System.out.println("Sumata na chislata v masiva e " + suma + ".Srednoaritmetichnoto na chislata v masiva e "
				+ sredno + ".");
	}
}