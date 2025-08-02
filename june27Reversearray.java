package Array;

public class june27Reversearray {

	public static void main(String[] args) {
	
		int arr[] ={1,2,3,4,5,6,7};
		
		revers(arr);
		for( int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
	
	}

	public  static void revers(int[] arr) {
	
		int start=0;
		int end=arr.length-1;
		
		while(arr[start]<arr[end]) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			end--;
			start++;
			
		}
		
	}

}
