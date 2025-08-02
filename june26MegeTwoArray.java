package Array;

public class june26MegeTwoArray {

	public void Mergetwoarrya(int[] arr, int[] brr) {
		int n=arr.length;
		int n1=brr.length;
		int m=n+n1;
		
		int merge[]= new int[m];
		for(int i=0;i<n;i++) {
			merge[i]=arr[i];
			
		}
		for(int j=0;j<n1;j++) {
			merge[n+j]=brr[j];
			
		}
		
	System.out.println("merge array");
	for( int k=0;k<m;k++) {
		System.out.println(merge[k]);
	}
		
	}

}
