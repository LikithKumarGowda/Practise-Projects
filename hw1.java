public class hw1 {
	static void familyMember(String firstname,String lastname) {
		if(firstname.equals("raju")&&lastname.equals("gowda")) {
			System.out.println("He belongs to the same family");
		}
	}
	static void familyMember(String firstname) {
		if(firstname.equals("ravi")) {
			System.out.println("He belongs to the different family or its his nickname");
		}
	}
	
	public static void main(String[] args) {
		familyMember("raju","gowda");
		familyMember("ravi");
		
		
	}
}
