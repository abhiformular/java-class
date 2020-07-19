package myFirstOOP;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("learning my own data type");
		person myself = new person(); 
		myself.name = "Abhi";
		myself.age = 14;
		
		int x = myself.age - 5;
		
		person brother = new person();
		brother.name = "Vivek";
		brother.age = x;
		
		person mom = new person();
		mom.name = "Sri Pallavi";
		mom.age =  44;
		
		person dad = new person();
		dad.name = "Kishan Chand";
		dad.age =  45;
		
		System.out.println( myself.name + "'s age is " + myself.age);
		System.out.println( brother.name + "'s age is " + brother.age);
		System.out.println( mom.name + "'s age is " + mom.age);
		System.out.println( dad.name + "'s age is " + dad.age);
	}

}
