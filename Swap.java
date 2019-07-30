package algorithms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		System.out.print("Please enter the first number : ");
		Scanner sc = new Scanner(System.in);
		Integer num1 = sc.nextInt();

		System.out.print("Please enter the second number : ");
		Scanner sc1 = new Scanner(System.in);
		Integer num2 = sc1.nextInt();

		System.out.println();
		System.out.println("Before Swap --> ");
		System.out.println("Frist Number : " + num1 + ", Second Number : " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println();
		System.out.println("After Swap --> ");
		System.out.println("Frist Number : " + num1 + ", Second Number : " + num2);
	}

}
