package algorithms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.print("Please enter the word : ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		if (isPalindrome(word)) {
			System.out.println(word + " is a plaindrome");
		} else {
			System.out.println(word + " is not a plaindrome");
		}
	}

	#Method1
	public boolean isPalindrome(String s){
		String reverse = "";
		for(int i =s.length()-1;i>=0;i--){
			reverse += s.charAt(i);
		}
		if(s.equals(reverse)){
			return true;
		}
		return false;
	}
	
	#Method2
	static boolean isPalindrome(String word) {
	
		int count = word.length() - 1;

		for (int i = 0; i <=count; i++) {
			if (word.charAt(i) == word.charAt(count)) {
				count--;
				continue;
			} else {
				return false;
			}
		}
		return true;

	}
	
	

}
