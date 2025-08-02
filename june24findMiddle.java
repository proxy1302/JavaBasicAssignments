package Array;

public class june24findMiddle {
	
	public void Findmiddle(int[] arr) {
int n=arr.length;
int mid=n/2;
 for( int i=0;i<n;i++) {
	 if(arr[i]==arr[mid]) {
		 System.out.println(arr[i]);
	 }
 }
	}

}
