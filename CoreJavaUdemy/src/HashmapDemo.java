import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		//Stores key, value pairs
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	
		capitalCities.put("England", "UK");
		capitalCities.put("New Delhi", "India");
		capitalCities.put("Washington", "USA");
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.containsKey("Chester")); //Removes whole pair
		
		capitalCities.remove("England");
		System.out.println(capitalCities);
		
		
	}

}
