package algorithm;

import java.math.BigInteger;

public class Fibonacci_series {
	public static void main(String args[]) {
		FibonacciIntOnly();
//		FibonacciBigInteger();
	}
	
	//can handle over int range
	private static void FibonacciBigInteger() {
		BigInteger bigA = new BigInteger("1");
		BigInteger bigB = new BigInteger("1");
		BigInteger bigC = new BigInteger("1");
		
		for(int i=0; i<101; i++) {
			System.out.println(i + "th " + bigB);
			bigA = bigB;
			bigB = bigC;
			bigC = bigA.add(bigB);
		}
	}

	//cannot handle over int range
	private static void FibonacciIntOnly() {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 1;
		
		for(int i=0; i<101; i++) {
			System.out.println(i + "th " +b);
			a = b;
			b = c;
			c = a+b;
		}		
	}
}
