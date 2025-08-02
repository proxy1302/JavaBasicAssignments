package Array;

import java.util.Scanner;

public class jully6NUmberOperations {

	public static void main(String[] args) {
     
		Scanner sc= new Scanner(System.in);
				
//goal to perform all number and array operations 
  System.out.println("enter number for check");
  int NUM =sc.nextInt();

     // array
  System.out.println(" enter array size");
  int n=sc.nextInt();
  
 System.out.println(" enter array elemnts");
 int arr[]=new int[n];
 for( int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
	  
 }
 //prime
 System.out.println(" ______________ ______________");
 System.out.println(" prime.......");
  printprime(NUM);
  System.out.println(" ______________ ");
  chekprime(arr);
  
//Armstrong (153 1 cube+5 cube+3 cube=153)
  System.out.println(" ______________ ______________");
  System.out.println(" Armstrong......");
printArmstrong(NUM);
System.out.println(" ______________ ");
chekAremstrong(arr);
		
 //strong( 145  1!+4!+5!=145
System.out.println(" ______________ ______________");
System.out.println(" strong.......");

  printStrong(NUM);
  System.out.println(" ______________ ");
  chekStrong(arr);

  System.out.println(" ______________ ______________");
//perfect( 6  1+2+3=6 are 3 divisor of 6)
  System.out.println(" perfect.......");
  printerfect(NUM);
  System.out.println(" ______________ ");
  chekperfect(arr);
//factorial
  
  
//fabonacci( 0 0+1  1+1 2+2 4+3 7+4 12+5 17+6)
		
  
//array palindrome ( 1,2,3,4,1   ==  last index and first index same)
  
 }
	private static void chekperfect(int[] arr) {
		 
		for( int i=0;i<arr.length;i++) {
			int n=arr[i];
			int sum=0;
			int temp=n;
			
			for( int j=1;j<=temp/2;j++) {
				if(temp%j==0) {
					
					
					sum=sum+j;
				}
			}
			if(sum==n) {
				System.out.println(n +"perfect");
			}
			
		}
		
		
	}
	private static void printerfect(int num) {
		int org=num;
		int sum=0;
		 
		for ( int i=1;i<=num/2;i++){
			
			if(num%i==0) {
			sum=sum+i;
			}
		}if(sum==org) {
			System.out.println(org+ "perfect no");
		}else {
			System.out.println(" not perfect");
		}
	
		
	}
	private static void chekStrong(int[] arr) {
		
		for( int i=0;i<arr.length;i++) {
			 int n=arr[i];
			 int sum=0;
			 int temp=n;
			 while(temp>0) {
				 
				  int digit= temp%10;
				  int fact=1;
		for( int j=digit;j>0;j--) {
		fact=fact*j;
		}
		sum=sum+fact;
		temp=temp/10;
		
				 
			 }
			 if(sum==n) {
				 System.out.println(n+"storng");
			 }else {
				 System.out.println(" not strong");
			 }
		}
	}
	private static void printStrong(int num) {
		int org=num;
		int sum=0;
		while(num>0) {
		 
			int digit=num%10;
			int fact=1;
			   for( int i=digit;i>0;i--) {
				  fact=fact*i;
				  
			   }
			   sum=sum+fact;
			   num=num/10;
			}
		if(sum==org) {
			System.out.println(org+"strong");
			
		}
		
	}
	
	
	private static void chekAremstrong(int[] arr) {
		
	 
	  for( int i=0;i<arr.length;i++) {
		  int N= arr[i];
		  int sum=0;
		  int temp=N;
		  
		
		  while(temp>0) {
			  int digit =temp%10;
			  sum=sum+(digit*digit*digit);
		
			  temp=temp/10;
			  
		  }
		  if(sum==N) {
			  System.out.println(N+" Armstrong");
		  }else {
			  System.out.println(" not Armstrong");
		  }
		  
		  
	  }
		
	}
	private static void printArmstrong(int num) {
		int orgN=num;
		int sum=0;
	
		
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
		
			num=num/10;
			
		}
		if(sum==orgN) {
			System.out.println(orgN+ "is Armstroong");
		}else {
			System.out.println(" not Armstrong");
		}
		
		
	}
	//
	////
	//////
	
	public  static void chekprime(int[] arr) {
		
		for( int i=0;i<arr.length;i++) {
			boolean isprime=true;
			
			for( int j=2;j<Math.sqrt(arr[i]);j++) {
				if(arr[i]%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println(arr[i]);
			}else {
				System.out.println(" prime NO not found ");
			}
		}
		
	}

	public  static void printprime(int num) {
		
		for( int i=2;i<num;i++) {
			
			boolean isprime=true;
		
		for( int j=2;j<Math.sqrt(i);j++) {
			if(i%j==0) {
				isprime=false;
				break;
				
			}
		}
		if(isprime) {
			System.out.println(i +" prime");
		}
		}
		
		
		
	}

}
