import java.util.Scanner;

public class ShiftListElements {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter length of an array: ");
		int length = in.nextInt();
		
		int[] array = new int[length];
		System.out.print("Enter the array: ");
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
		}

		System.out.print("How much you want to shift the array to the right? ");
		int shiftBy = in.nextInt() % length;


		int[] newArray = new int[length];
		for (int i = 0; i < length; i++) {
			int index = (i + shiftBy) % length;
			newArray[index] = array[i];
		}

		for (int element : newArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}