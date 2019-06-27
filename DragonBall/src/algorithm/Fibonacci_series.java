package algorithm;

public class Fibonacci_series {
	public static void main(String args[]) {
		int a = 1;
		int b = 1;
		int c = 1;
		
		for(int i=0; i<101; i++) {
			System.out.println(i + "th n is :" +b);
			a = b;
			b = c;
			c = a+b;
		}
	}
	
}
