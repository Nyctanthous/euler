
public class proj2 {
	public static void main(String[] args) {
		int fib=0,
		    tot=1,
		    sum = 0;
		while(fib<4000000){
			tot=fib+(fib=tot);
			if(fib%2==0)sum+=fib;
		}
		System.out.println(sum);
	}
}
