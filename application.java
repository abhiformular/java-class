package schoolSystem;

import schoolSystem.student;
import schoolSystem.teacher;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" School System Project");
		student FirstStudent = new student();
		FirstStudent.age = 14;
		FirstStudent.name = "Abhi";

		teacher grade9Teacher = new teacher();
		grade9Teacher.name = "Mr. Quinn";

		System.out.println(FirstStudent.name + " is " + FirstStudent.age + " years old");
		System.out.println("His homeroom teacher is " + grade9Teacher.name);
		System.out.print("He likes to");
		grade9Teacher.teach();
		grade9Teacher.teachASubject("Physics");
	
		System.out.print(FirstStudent.name + " likes to ");
		FirstStudent.readbook();
		FirstStudent.readABook("Harry Potter");
	}

}
