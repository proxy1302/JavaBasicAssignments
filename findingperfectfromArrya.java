package Array;

import java.util.Scanner;

public class findingperfectfromArrya {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter arrya");
for( int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++) {
	if(perfectnumber(arr[i])) {
		System.out.println(arr[i]);
	}
                
}
	}

	public static boolean perfectnumber(int num) {
		
		int sum=0;
		for( int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
					}
		}
		if(sum==num) {
			return true;
				}
	return false;
		}

}
