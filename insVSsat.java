package Variables;


public class insVSsat {
	
	public static void main(String[] args) {
		
		int num[]= {9,8,7,6,5,12,24,1};
		
		
		int n=num.length;
		
		for( int na:num) {
			System.out.print(n +" ");
		}
		
		quicksort(num,0,n-1);
		
		for( int na:num) {
			System.out.print(n +" ");
		}
		
		
		
	}
	

	   public static void quicksort(int[] num, int low, int high) {
		
		if(low<high) {
			
			int pi= partion(num,low,high);
			
			quicksort(num,low,pi-1);
			quicksort(num,pi+1,high);
			
			
		}
	}


	public static int partion(int[] num, int low, int high) {

int pviot= num[high];
int i=low-1;

for( int j=low;j<high;j++) {
	
	if(num[j]<=pviot) {
		i++;
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
		
		
	}
}

int temp= num[i+1];
num[i+1]=num[high];
num[high]=temp;


return i+1;
	}
}
