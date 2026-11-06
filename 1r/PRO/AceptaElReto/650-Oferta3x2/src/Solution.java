//
import java.util.*;
//
public class Solution {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfBooks;
		int[] bookPrices;
		int maximumDiscount;
		//
		while (in.hasNextInt()) {
			numberOfBooks = in.nextInt();
			maximumDiscount = 0;
			bookPrices = new int[numberOfBooks];
			for (int i = 0; i < numberOfBooks; i ++) {
				//
				bookPrices[i] = in.nextInt();
				//
			}
			//
			Arrays.sort(bookPrices);
			//
			for (int i = (numberOfBooks - 3); i >= 0; i -= 3) {
				maximumDiscount += bookPrices[i];
				//
			}
			//
			System.out.println(maximumDiscount);
			//
		}
		//
		in.close();
		//
	}
	//
}
//