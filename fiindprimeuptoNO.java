package Array;

import java.util.Scanner;

public class fiindprimeuptoNO {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
//		System.out.println("Size of arrya");
//int size=sc.nextInt();
//
//int []arrya= new int[size];
//
//
//for( int i=2;i<size;i++) {
//	arrya[i]=i;
//	
//	if(primenumber(arrya[i])) {
//		System.out.println(i+"index : value"+arrya[i]);
//	}
//		}
//	}
//
//	public static boolean primenumber(int num) {
//		boolean isprime;
//		
//		 
//		for( int i=2;i<Math.sqrt(num);i++) {
//			if(num%i==0 ) {
//				return false;
//				
//			}
//
//		}
//		return true;
//	
		
		System.out.println(" Enter number");
		int number=sc.nextInt();
		for( int i=2;i<=number;i++) {
		boolean	isprime=true;
		
		for( int j=2;j<Math.sqrt(i);j++) {
			if(i%j==0) {
				isprime=false;
				
			}
			
		}
		
		if(isprime && i!=4) {
			System.out.println(i);
		}
		
		}
		
	}
}
		
		




