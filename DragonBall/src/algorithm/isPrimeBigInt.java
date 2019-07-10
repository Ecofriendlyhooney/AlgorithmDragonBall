package algorithm;

import java.math.BigInteger;

public class isPrimeBigInt {

	public static void main(String args[]) {
		BigInteger BigValueFrom = new BigInteger("1");
		BigInteger BigValueTo = new BigInteger("10");
		final String TEXT_YES = " : is Prime number";
		final String TEXT_NO = " : Not";
		for (BigInteger i = new BigInteger("1"); (i.compareTo(BigValueTo))==1; i.add(BigValueFrom)) {
			
//				if(isPrime(i)) {	
//					System.out.println(i + TEXT_YES);
//				} else {
//					System.out.println(i + TEXT_NO);
//				}
			System.out.print(BigValueFrom);
		}
	}

	private static boolean isPrime(BigInteger i) {
		boolean primeFlag = false;
		BigInteger j = new BigInteger("2");
		if ((i.compareTo(BigInteger.ONE))==1) {
			primeFlag = false;
		} else if ((i.compareTo(BigInteger.ONE))==1) {
			primeFlag = true;
		} else {
				for(j=BigInteger.ONE.add(BigInteger.ONE); (j.compareTo(i))==-1; i.add(BigInteger.ONE)) {
					if(i.divide(j)==BigInteger.ZERO) {
						primeFlag = false;
						break;
					} else {
						primeFlag = true;
					}
				}
		}
		return primeFlag;
	}
}
