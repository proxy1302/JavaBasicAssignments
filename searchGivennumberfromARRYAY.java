package Array;

import java.util.Scanner;

public class searchGivennumberfromARRYAY {
	public static void main(String []args) {
		Scanner proxy= new Scanner(System.in);
		System.out.println(" eneter size");
		int size=proxy.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter elemnts");
		for( int i=0;i<size;i++) {
			arr[i]=proxy.nextInt();
			
		}
		System.out.println("enter target");
		int target=proxy.nextInt();
		
		searching(arr, target);
		int result=searchingbinearymethod(arr,target);
		System.out.println(result);
		
	}
//bineri  search 
	public static int searchingbinearymethod(int[] arr, int target) {
		int start=0;
		int end =arr.length;
		if(start<end) {
		 int mid=(start+end)/2;
		 for( int i=0;i<arr.length/2;i++) {
			 if(arr[mid]==target) {
				 return mid;
				 
			 }else if(start<target) {
				end=mid+1;
				 
			 }else {
				 start=mid-1;
				 
			 }
			 
			
		 } 
		 }
		return -1;
		
		
		
		
	}
//linear search
	public  static void searching(int[] arr, int target) {
		int n=arr.length;
		for( int i=0;i<n;i++) {
			if(arr[i]==target) {
				System.out.println(  "value fpund at index :"+i);
			}
		}
		
		
		
	}
	

}
