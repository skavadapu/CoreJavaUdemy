
public class MultiplicationTable {

	public static void main(String[] args) {
		//Print multiplication table for 5
		
		for (int i=1; i<5; i++) {
			
			for (int j=1; j<=10; j++) {
				System.out.println(i + "*" + j + "="+i*j);
			}
			System.out.println("- - - - - ");
		}
	}

}
