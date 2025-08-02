package Array;

import java.util.Scanner;

public class ArryaIntilization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrya");
		int size=sc.nextInt();
		
// array declaration 
		int arr[]=new int[size];
		
		System.out.println(" Enter elemnts 1");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
}
// array decleration 
//		System.out.println(" enter elemnts 2");
//		int brr[]=new int[size];
//		for(int i=0;i<size;i++) {
//			brr[i]=sc.nextInt();
//			
//		}
		
	
//		june26MegeTwoArray merge=new  june26MegeTwoArray();
//		merge.Mergetwoarrya(arr,brr);
		
		
//		june26AdditonofTwoArrya addition= new june26AdditonofTwoArrya();
//	    addition.arrayAddition(arr,brr);

		
//		june24findMiddle fmid=new june24findMiddle();
//		fmid.Findmiddle(arr);
//		
		
		
		findMINandMax minmax = new findMINandMax();
		minmax.calculate(arr);
		
		
//		june26findEVENandODD evenodd=new june26findEVENandODD();
//		evenodd.evenodd(arr);
//		
		
//		june26AltetnaNo alternate= new june26AltetnaNo();
//		alternate.alternate(arr);
//		
		
//		june26PrimeNo prime= new june26PrimeNo();
//		for( int i=0;i<size;i++) {
//			if(	prime.primeno(arr[i])) {
//				System.out.println(arr[i]);
//			}
//     }
		
	}
}
