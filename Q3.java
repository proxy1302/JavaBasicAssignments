package com.assignmentsnumber1;

public class Q3 {
// reverse number and sum of number
	public static void main(String[] args) {
	
		int num=321;
		double rev=reversnumber(num);
		System.out.println(rev);
		
		double sum=sumofnumber(num);
		System.out.println(sum);
		
		

	}
	public static double reversnumber(int num){//321
		int rev=0;
		int digit;
		
		
		digit=num%10;//321%10=1
		rev=rev*10+	digit;  // 1*10+1=11
		num=num/10;   //321/10=32
		
		digit=num%10;//32%10=2
		rev=rev*10+	digit;  // 11*10+2=112
		num=num/10;   //32/10=
		
		digit=num%10;//3
		rev=rev*10+	digit;  // 11*10+2=112
		
	
		
		return rev;
		
		
	}
	
	public static double sumofnumber(int num){
		
	int	sum=0;
	int  digit;
	digit=num%10;
	sum+=digit;
	num=num/10;
	
	
	digit=num%10;
	sum+=digit;
	num=num/10;
	
	digit=num%10;
	sum+=digit;
	num=num/10;
	
		return sum;
		
	}
}
