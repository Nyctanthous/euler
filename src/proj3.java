/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class proj3 {

	public static void main(String[] args) {
		long max_prime = 600851475143L;
		//long max_prime = 45783453463443437L;
		long currPrime = 2;
		
		while(max_prime > currPrime){
			max_prime /= (max_prime%(++currPrime) == 0)?(currPrime):(1);
		}
		System.out.println(currPrime);
	}
}