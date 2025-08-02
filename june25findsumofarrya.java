package Array;

import java.util.ArrayList;

public class june25findsumofarrya {

	public static void main(String[] args) {
		
		int []arr= {12,13,14,15,16};
		
		sumof(arr);
		
		
	}

	public static void sumof(int[] arr) {
		int n=arr.length;
		int sum=0;
		for( int i=0;i<n;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of arrya :"+sum);
		
		
	}

}
