package com.functions;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" enter numbers");
 int num=sc.nextInt();
 sumofnumbers(num);


		

	}
	
	public static void sumofnumbers( int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		
		}
		System.out.println(" sum of numbers "+ sum);
		
	}

}
