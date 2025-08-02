package Array;

import java.util.Scanner;

public class june26PRimeFrom1toN {

	public static void main(String[] args) {
 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number upto n");
		int size=sc.nextInt();
		
		   for( int i=2;i<size;i++) {
			 boolean isprime=true;
			 
			 for( int j=2;j<Math.sqrt(i);j++) {
				 if(i%j==0) {
					 isprime=false;
					break;
				 }
			 }
			 if(isprime) {
				 System.out.println(i);
			 }
		}
	
 }

}
