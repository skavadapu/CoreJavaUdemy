
public class SecondClass extends FirstClass{
	
	public void getData2 () {
		System.out.println("Method in SecondClass");
	}

	public static void main(String[] args) {
		
		SecondClass sc = new SecondClass();
		sc.getData();
		sc.getData2();
		
	}

}
