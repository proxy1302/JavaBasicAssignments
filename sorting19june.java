package Array;

import java.util.Scanner;

public class sorting19june {
	
	public static void main(String [] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size :");
    int size=sc.nextInt();
    
    int []arr=new int[size];
    System.out.println("Enter elemnts");
    for(int i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    	}
    
    sorting(arr);
    System.out.println(" sort arrya ");
    for( int i=0;i<size;i++) {
    System.out.println(arr[i]);
    }
    }
    public static void  sorting(int[] arr) {
		int n=arr.length;
	
		for( int i=0;i<n-1;i++) {
			
			for( int j=i;j<n-1-i;i++) {
			if(arr[j]>arr[j+1]) {
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		}
	}
