
public class MultidimensionalArrays {

	public static void main(String[] args) {

		//matrix 1 2 3
		//       4 5 6
		
	/*	int a[][]= new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;*/
		
		int a[][] = {{7,2,3},{4,5,6},{9,10,11}};
		
		//Find the minimum number from the above multi dimensional array
		
		int temp=a[0][0];
		
		for (int i=0; i<3; i++) {
			
			for(int j=0; j<=2; j++) {
			//	System.out.print(a[i][j]);
			//	System.out.print("\t");
				if (temp>a[i][j]) {
					temp=a[i][j];
				}
					
			}
			
		}
		System.out.println("Minimum value from Matrix is: " +temp);
		
		

	}

}
