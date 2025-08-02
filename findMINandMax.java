package Array;

public class findMINandMax {

	public void calculate(int[] arr) {
		
		int min=arr[0];
		int max=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
	
		
			for( int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max=arr[j];
					
				}
			}
			
			System.out.println(min);
			System.out.println(max);
			
		
			
		
		
		
		
		
	}

}


