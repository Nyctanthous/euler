/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class proj3 {

	public static void main(String[] args) {
		long max_prime = 600851475143L;
		long currPrime = 0;
		
		while(max_prime > currPrime){
			if(max_prime%(++currPrime) == 0){
				max_prime /= currPrime;
			}
		}
		System.out.println(currPrime);
	}
}