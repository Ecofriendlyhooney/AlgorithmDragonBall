package algorithm;

public class IsPrime02 {
	//15:03
	//15:33
	
	public static void main(String args[]) {
		int inputValueFrom = 1000000;
		int inputValueTo = 1000099;

		final String TEXT_YES = " : is Prime number";
		final String TEXT_NO = " : Not";
		
		for (int i=inputValueFrom; i< inputValueTo; i++) {
				if(isPrime(i)) {	
					System.out.println(i + TEXT_YES);
				} else {
//					System.out.println(i + TEXT_NO);
				}
		}
	}

	private static boolean isPrime(int i) {
		boolean primeFlag = false;
		
		if (i<2) {
			primeFlag = false;
		} else if (i==2) {
			primeFlag = true;
		} else {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
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
