package Q2;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter student's grade:");
		
		
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if (grade <6){
			System.out.println("You are in elementary school");
		}
		if (grade >5 && grade<9){
			System.out.println("You are in middle school");
		}
		if (grade >8){
			System.out.println("You are in high school");
		}

	}

}
