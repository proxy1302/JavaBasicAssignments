package Array;

public class june26AmstrongNOArray {

	public static void main(String[] args) {
		int[] arr= {123,234,456,759,153};
	
	for( int i=0;i<arr.length;i++) {
		if(amstrong(arr[i])) {
			System.out.println("Amstrong number :"+arr[i]);
			}
	   }
  }

	public  static boolean amstrong(int arr) {
		int org=arr;
		int sum=0;
		while(arr>0){
int result=1;
			int digit=arr%10;
			result=(digit*digit*digit);
			sum=sum+result;
			arr=arr/10;
			
		}
		return org==sum;
	}

}
