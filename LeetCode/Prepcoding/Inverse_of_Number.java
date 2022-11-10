package LeetCode;

import java.util.Scanner;

public class Inverse_of_Number {
	public static void main(String arg[]){
		
		Scanner scn=new Scanner(System.in);
		
		int n,inv,op;
		
		n=scn.nextInt();
		inv=0;
		op=1;
		
		while(n!=0){
			
			int od=n%10;
			int ip=od;
			int id=op;
			inv=(int)(inv+id*Math.pow(10,ip-1));
			n=n/10;
			op++;
		}
		System.out.println(inv);
		
	}

}
