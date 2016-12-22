/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class proj5 {
	public static void main(String[] args) {
		int smallestNum = 2520, //This step size will fail as soon as we encounter the next prime, 23
			currDivisor;

		long start = System.nanoTime();
		outer: for (int currNum = smallestNum;; currNum += smallestNum) {
			currDivisor = 2;
			while (currNum % currDivisor == 0) {
				if (currDivisor == 20) {
					smallestNum = currNum;
					break outer;
				}
				currDivisor++;
			}
		}
		System.out.println("Time to complete: " + (System.nanoTime() - start) + " ns");
		System.out.println("The number is " + smallestNum);
	}
}
