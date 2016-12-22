/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class proj4 {
	public static void main(String[] args) {
		int num0 = 100, num1 = num0, maximum = 1000, bestRes = -1;

		long start = System.nanoTime();
		while (num0++ < maximum) {
			num1 = num0 - 1;
			while (num1++ < maximum) {
				int product = num0 * num1;
				if(product == reverse(product) && product > bestRes){
					bestRes = product;
				}
			}
		}
		System.out.println("Time to complete: " + (System.nanoTime() - start)+" ns");
		System.out.println(bestRes);
	}

	private static boolean palindrome(int element) {
		int max = (int) Math.log10(element);

		for (int i = max; i > 0; i >>= 1) {
			int res0 = (int) (element / Math.pow(10, i))%10, 
				res1 = (int) (element / Math.pow(10, max - i))%10;
		
			if (res0 != res1) {
				return false;
			}
		}
		return true;
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
