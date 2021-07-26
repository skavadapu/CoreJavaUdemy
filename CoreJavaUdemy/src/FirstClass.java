
public class FirstClass {

	public static void main(String[] args) {
	
		System.out.println("I am in main");
		FirstClass FC = new FirstClass();
		FC.getData();
		
	}
	
	public void getData() {
		System.out.println("I am outside main method");
	}

}
