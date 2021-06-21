package day1;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String s) {
		String reverse ="";
		boolean b=false;
		 for(int i =s.length()-1;i>=0;i--){
		      reverse = reverse +s.charAt(i);
		    }
		if(s.equals(reverse))
			b=true;
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		boolean b = checkPalindrome(str);
		if(b==true)
			System.out.println("palindrome");
		else 
			System.out.println("not palindrome");

	}

}
