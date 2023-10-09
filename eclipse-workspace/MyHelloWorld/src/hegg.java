
public class hegg {
	
	
	public static String uppercaseForMe(String input) {
		return input.toUpperCase();
	}
	
	public static void main(String args[]) {
		//declaration
		int key = 4;
		
		Integer key1 = 5;
		System.out.println(key1.compareTo(8));
		
		String town = "vadapalani";
		double salary = 100.50;
		
		//Invocation
//		System.out.println("amman kovil theru");
		String output = uppercaseForMe(town);
		
		//print output
		System.out.println(output);
	}
}
