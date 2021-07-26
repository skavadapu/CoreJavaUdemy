
public class PyramidLoop {

	public static void main(String[] args) {
		System.out.println("******* PYRAMID 1 *******");
		//Print pyramid format
		//1234
		//567
		//89
		//10
		
		int temp=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(temp);
				System.out.print("\t");
				
				temp++;
			}
			System.out.println("");
		}
		
		System.out.println("******* PYRAMID 2 *******");
		//print pyramid in below format
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		int k=1;
		for (int p=1; p<=4; p++) {
			
			for (int q=1; q<=p; q++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
			
		}
		
		System.out.println("******* PYRAMID 3 *******");
				//print pyramid in below format
				//1
				//1 2
				//1 2 3
				//1 2 3 4
		
		for (int m=1; m<=4; m++) {
			for(int n=1; n<=m; n++) {
				System.out.print(n);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
