
public class proj6 {
	public static void main(String args[]){
		//Summation of the first N squares:
		int n = 100,
		    sumOfSquares = (n*(n+1)*(2*n+1)/6),
		    sum = ((n*(n+1))/2);
		System.out.print((sum*sum) - sumOfSquares);
	}
}
