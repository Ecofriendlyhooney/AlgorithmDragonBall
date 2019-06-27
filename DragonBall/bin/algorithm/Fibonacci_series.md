
# Fibonacci series

> this function annot handle over int range


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
	
### from 45th value went wrong as value over int range
 [ 0th : 1 ] 
 [ 1th : 1 ] 
 [ 2th : 2 ] 
 [ 3th : 3 ] 
 [ 4th : 5 ] 
 [ 5th : 8 ] 
 [ 6th : 13 ] 
 [ 7th : 21 ] 
 [ 8th : 34 ] 
 [ 9th : 55 ] 
 [ 10th : 89 ] 
 [ 11th : 144 ] 
 [ 12th : 233 ] 
 [ 13th : 377 ] 
 [ 14th : 610 ] 
 [ 15th : 987 ] 
 [ 16th : 1597 ] 
 [ 17th : 2584 ] 
 [ 18th : 4181 ] 
 [ 19th : 6765 ] 
 [ 20th : 10946 ] 
 [ 21th : 17711 ] 
 [ 22th : 28657 ] 
 [ 23th : 46368 ] 
 [ 24th : 75025 ] 
 [ 25th : 121393 ] 
 [ 26th : 196418 ] 
 [ 27th : 317811 ] 
 [ 28th : 514229 ] 
 [ 29th : 832040 ] 
 [ 30th : 1346269 ] 
 [ 31th : 2178309 ] 
 [ 32th : 3524578 ] 
 [ 33th : 5702887 ] 
 [ 34th : 9227465 ] 
 [ 35th : 14930352 ] 
 [ 36th : 24157817 ] 
 [ 37th : 39088169 ] 
 [ 38th : 63245986 ] 
 [ 39th : 102334155 ] 
 [ 40th : 165580141 ] 
 [ 41th : 267914296 ] 
 [ 42th : 433494437 ] 
 [ 43th : 701408733 ] 
 [ 44th : 1134903170 ] 
 [ 45th : 1836311903 ] 
 [ 46th : -1323752223 ] 
 [ 47th : 512559680 ] 
 [ 48th : -811192543 ] 
 [ 49th : -298632863 ] 
 [ 50th : -1109825406 ] 
 [ 51th : -1408458269 ] 
 [ 52th : 1776683621 ] 
 [ 53th : 368225352 ] 
 [ 54th : 2144908973 ] 
 [ 55th : -1781832971 ] 
 [ 56th : 363076002 ] 
 [ 57th : -1418756969 ] 
 [ 58th : -1055680967 ] 
 [ 59th : 1820529360 ] 
 [ 60th : 764848393 ] 
 [ 61th : -1709589543 ] 
 [ 62th : -944741150 ] 
 [ 63th : 1640636603 ] 
 [ 64th : 695895453 ] 
 [ 65th : -1958435240 ] 
 [ 66th : -1262539787 ] 
 [ 67th : 1073992269 ] 
 [ 68th : -188547518 ] 
 [ 69th : 885444751 ] 
 [ 70th : 696897233 ] 
 [ 71th : 1582341984 ] 
 [ 72th : -2015728079 ] 
 [ 73th : -433386095 ] 
 [ 74th : 1845853122 ] 
 [ 75th : 1412467027 ] 
 [ 76th : -1036647147 ] 
 [ 77th : 375819880 ] 
 [ 78th : -660827267 ] 
 [ 79th : -285007387 ] 
 [ 80th : -945834654 ] 
 [ 81th : -1230842041 ] 
 [ 82th : 2118290601 ] 
 [ 83th : 887448560 ] 
 [ 84th : -1289228135 ] 
 [ 85th : -401779575 ] 
 [ 86th : -1691007710 ] 
 [ 87th : -2092787285 ] 
 [ 88th : 511172301 ] 
 [ 89th : -1581614984 ] 
 [ 90th : -1070442683 ] 
 [ 91th : 1642909629 ] 
 [ 92th : 572466946 ] 
 [ 93th : -2079590721 ] 
 [ 94th : -1507123775 ] 
 [ 95th : 708252800 ] 
 [ 96th : -798870975 ] 
 [ 97th : -90618175 ] 
 [ 98th : -889489150 ] 
 [ 99th : -980107325 ] 
 [ 100th : -1869596475 ] 

--- 

> BigInteger can handle bigger value
'''
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
'''