package Array;

import java.util.Scanner;

public class june26StrogNofromArray {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println(" Enter elemnts");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for( int i=0;i<n;i++) {
			if(strong(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}

	public  static boolean strong(int arr) {

		int sum=0;
		
	
		int org=arr;
		
	    while(arr>0) {
		int digit=arr%10;
		int result=1;
		
			 for( int i=digit;i>0;i--) {
				result=result*i;
				 }
			 sum=sum+result;
			 arr=arr/10;
	 }
		
		
         return org==sum;
	}

}
