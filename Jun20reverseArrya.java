package Array;

public class Jun20reverseArrya {
	
	public void RevArrya(int [] num) {
		int start=0;
		int end=num.length-1;
			while(start<end) {
			
			int temp=num[start];
			num[start]=num[end];
			num[end]=temp;
	
			start++;
			end--;
			
		}
		
		
		
		
	}
	

}

