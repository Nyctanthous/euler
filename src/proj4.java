/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class proj4 {
	public static void main(String[] args) {
		int num0 = 100,
			num1 = num0,
			maximum = 1000,
			bestRes = -1;
		
		while(num0++ < maximum){
			num1 = num0-1;
			while(num1++ < maximum){
				int product = num0*num1;
				if(product == reverse(product) && product > bestRes){
					bestRes = product;
				}
			}
		}
		System.out.println(bestRes);
	}

	private static int reverse(int element) {
		int reverse = 0;
		while (element != 0) {
			reverse = reverse * 10 + element % 10;
			element /= 10;
		}
		return reverse;
	}
}
