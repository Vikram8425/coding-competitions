package LeetCode;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String arg[]) {
		int n,count=0,temp,rev=0;
		Scanner scn=new Scanner(System.in);
		 n=scn.nextInt();
		 temp=n;
		 
		while(n!=0) {
			rev = rev * 10 + n % 10;
            n = n / 10;
		}
		System.out.println(rev);
		
		
		
	}

}
