
public class Trinaiset {
	static int[] CombineArray(int[] masiv, int[] pakM) {
		int[] newM = new int[masiv.length + pakM.length];
		int count = masiv.length;
		int broiko = 0;
		for (int br = 0; br <= newM.length - 1; br++) {
			if (br <= masiv.length - 1) {
				newM[br] = masiv[br];
			} else {
				newM[count] = pakM[broiko];
				count++;
				broiko++;
			}
		}
		return newM;
	}

	static void PrintOut(int[] masiv) {
		for (int br = 0; br <= masiv.length - 1; br++) {
			System.out.print(masiv[br] + " ");
		}
	}

	public static void main(String[] args) {
		int []arr = {44,5,6,234,5,6,7,1};
		int []pakArr = {-11,34,23,5,6,7,132};
		int []lastArr=CombineArray(arr,pakArr);
		PrintOut(lastArr);
	}

}
