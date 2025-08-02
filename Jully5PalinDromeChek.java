package Array;

import java.util.Scanner;

public class Jully5PalinDromeChek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		System.out.println(" Enter Elrments");
		int nums[]=new int[n];
		for( int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		CheckPalinDrome(nums);
		
		

	}

	public static void CheckPalinDrome(int[] nums) {
		int len=nums.length;
	
	
		if(nums[0]==nums[len-1]) {
			System.out.println("# palindomre......");
		}else {
			System.out.println("# not palindrome .....");
		}
	
		
	}

}
