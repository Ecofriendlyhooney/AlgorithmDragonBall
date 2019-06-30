package algorithm;

public class isPrime {
	public static void main(String args[]) {
		int inputValue = 37;
		for(int i=1; i<100; i++) {
			isPrime(i);
		}
		
		
	}
	private static void isPrime(int inputValue) {
		String TEXT_NOT = " : NOT ";
		String TEXT_YES = " : is prime number";
		boolean primeFlag = false;
		
		if(inputValue < 2) {
			primeFlag = false;
		} else if (inputValue == 2) {
			primeFlag = true;
		} else {
			for (int i=2; i<inputValue; i++) {
				if(inputValue%i == 0) {
					primeFlag = false;
					break;
				} else {
					primeFlag = true;
				}
			}
		}
		
		if(primeFlag) {
			System.out.println(inputValue + TEXT_YES);
		} else {
//			System.out.println(inputValue + TEXT_NOT);
		}
	}
}
