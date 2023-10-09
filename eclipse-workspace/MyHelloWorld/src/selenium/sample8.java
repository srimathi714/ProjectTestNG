package selenium;

public class sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 11;
		String country = "indian";
		
		if(age<18)
		{
			System.out.println("cannot vote");
		}
		else if(country.equals("indian"))
		{
		System.out.println(" can vote");	
		}
		else
		{
			System.out.println("no match found");
		}

	}

}
