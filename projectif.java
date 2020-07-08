
public class projectif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;

		if (age < 15) {
			System.out.println("Cannot get driver permit");
		} else if (age >= 15 && age <= 18) {
			System.out.println("You need parent permission.");
		} else {
			System.out.println("You can get permit yourself.");
		}
	}
}
