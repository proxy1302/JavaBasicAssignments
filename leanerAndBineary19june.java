package Array;

import java.util.Scanner;

public class leanerAndBineary19june {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Arrya size");
		int size=sc.nextInt();
		System.out.println("enter target");
		int target=sc.nextInt();
		int arr[]=new int[size];	
		System.out.println("enter elemnts");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		
	int result =BinearySearch(arr,target);
	System.out.println(result);
		
	}

	public  static int BinearySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		//0 < l-1=(10-10)=9   0<9 condition false when  right goes to less than 0
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				return mid;
				
			}else if(arr[mid]<target) {
				left=mid+1;
				
			}else {
				right=mid-1;
			}
			
	
		
			
		}

		
		return -1;
	}
	

	
		

		
	}
			

