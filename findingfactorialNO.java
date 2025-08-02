package Array;

import java.util.Scanner;

public class findingfactorialNO {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[2];
		System.out.println("Enter elements");
		for( int i=0;i<2;i++) {
			arr[i]=sc.nextInt();
		}
		for( int i=0;i<2;i++) {
			int result=factorial(arr[i]);
			System.out.println(result);
		}
		
		}

	public static int factorial(int num) {
		int fact=1;
		
		for( int i=num;i>0;i--) {
			fact*=i;
			
		}
		
		
		
		return fact;
		
		
	
		

		
		
		
		
		
	}

	
}
