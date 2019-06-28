package algorithm;

public class isPrime {
	public static void main (String args[]){
		methodA();
	}
	
	private static void methodA() {
		int v=10000;
		int loopN = 30;//LV01
		
		// < 2
		if(v<2) {
			System.out.println(v + " : is not Primve number");
		} else if (v==2) {
			// == 2
			System.out.println(v + " : is Prime number");
		} else if (v>2){
			   
			if(v%2==0) {
				System.out.println(v +" : is not Primve number");
			} else {
				for(int i=0; i<v; i++) {
					if(v%2==0) {
						System.out.println("not Primve number");
					} 
				}
				System.out.println(v + " : is Prime number");
			}
		}
	}
}
