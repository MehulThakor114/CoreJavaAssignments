package day1;

import java.util.Scanner;

public class ArmstrongNumberCount {
	public static void armstrongCount(int count) {
		int i,temp,num,rem,check=0;
		for(i=0; i<=count; i++)
		{  
		   temp = i;
		   num = 0;
		   while(temp != 0)
		   {
			   while (temp!= 0) {
				      
				      temp=temp/10;
				      check++;
				    }
			   temp=i;
			if(check==1)
			{
			rem = temp%10;
			num = num + rem;
			temp = temp/10;
			}else if(check==2) {
				while(temp!=0) {
				rem = temp%10;
				num = num + rem*rem;
				temp = temp/10;}
			}else if(check==3){
				while(temp!=0) {
					rem = temp%10;
					num = num + rem*rem*rem;
					temp = temp/10;}
			}else if(check==4){
				while(temp!=0) {
					rem = temp%10;
					num = num + rem*rem*rem*rem;
					temp = temp/10;}
			}else {while(temp!=0) {
			
				rem = temp%10;
				num = num + rem*rem*rem*rem*rem;
				temp = temp/10;}
			}
				
		   }if(i==num) {
			   
			   System.out.println(i);
		   }check=0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArmstrongNumberCount.armstrongCount(num);

	}

}
