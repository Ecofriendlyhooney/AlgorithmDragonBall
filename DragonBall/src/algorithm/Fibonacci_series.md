
# Fibonacci series

>//cannot handle over int range

'''

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
	
'''
