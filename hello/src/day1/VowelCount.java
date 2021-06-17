package day1;

import java.util.Scanner;

public class VowelCount {
	public static int countVowels(String str) {
		int count=0;
		str = str.toLowerCase(); 
		for(int i=0; i<str.length();i++){
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		         count++;
			}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int a = countVowels(str);
		System.out.println("Vowels in given string is "+a);

	}

}
