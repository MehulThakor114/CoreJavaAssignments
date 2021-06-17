package day1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void mulTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+ n*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		MultiplicationTable.mulTable(num);;
   

	}

}
