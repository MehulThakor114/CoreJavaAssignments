package day1;

import java.util.Scanner;

public class StringReverse {
	public static String reverse(String str) {
		String tag ="";
		 for(int i = str.length()-1; i>=0; i--){
		      tag = tag +str.charAt(i);
		    }
		return tag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(StringReverse.reverse(str));

	}

}
