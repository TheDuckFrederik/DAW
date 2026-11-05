//
import java.util.*;
//
public class Solution {
	public static int testCase(int numberOfBooks, int[] bookPrices) {
		int maxDiscount = 0;
		int[] current3BookPrices = new int[3];
		int numberOfDiscountedBatches = numberOfBooks / 3;
		//
		for (int i = 0; i < numberOfDiscountedBatches; ++ i) {
			current3BookPrices[0] = bookPrices[i * 3];
			current3BookPrices[1] = bookPrices[(i * 3) + 1];
			current3BookPrices[2] = bookPrices[(i * 3) + 2];
			//
			Arrays.sort(current3BookPrices);
			//
			maxDiscount += current3BookPrices[0];
		}
		//
		return maxDiscount;
	}
	//
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfBooks = in.nextInt();
		//
		while (numberOfBooks > 1 && numberOfBooks < 1001) {
			int[] bookPrices = new int[numberOfBooks];
			//
			if (numberOfBooks > 2) {
				for (int i = 0; i < numberOfBooks; ++ i) {
					bookPrices[i] = in.nextInt();
				}
				//
				System.out.println(testCase(numberOfBooks, bookPrices));
				//
			} else if (numberOfBooks > 0 && numberOfBooks < 3) {
				for (int i = 0; i < numberOfBooks; ++ i) {
					bookPrices[i] = in.nextInt();
				}
				//
				System.out.println(0);
				//
			}
			//
			numberOfBooks = in.nextInt();
			//
		}
		//
	}
	//
}
//
