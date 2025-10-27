package com.functions;

import java.util.Scanner;

public class Sumofprimenumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int p=sc.nextInt();
		 sumofprimenumbers(p);

	}

	public static void sumofprimenumbers( int num) {
		 int sum=0;
		
		for( int i=2;i<=num;i++) {
     boolean isprime=true; 
     
			for( int n=2;n<i;n++) {
				if(i%n==0) {
					isprime=false;
					break;
				}
				
			}
			if(isprime) {
				sum+=i;
				
			}
		
		}
		System.out.println(sum+" sumof all prime numberas ");
		
	}
}
