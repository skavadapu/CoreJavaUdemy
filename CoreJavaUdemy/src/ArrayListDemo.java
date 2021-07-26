import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Benz");
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("Ford");
		
		System.out.println(cars);
		
		//cars.set(0, "Rover"); //amending the existing name
		
	/*	System.out.println(cars);
		cars.remove(0);  // remove the item
		System.out.println(cars);
		
		for (int i=0; i<cars.size(); i++) {  //displaying items using for loop
			System.out.println(cars.get(i));
		}
		//retrieving using for...each loop
		for (String k: cars) {
			System.out.println(k);
		}
		*/
		//sorting
		Collections.sort(cars);
		System.out.println(cars);
		
		
		//Iterator object used for looping through the collections i.e Arrowlist and HashSet
		Iterator<String> it = cars.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		
	}

}
