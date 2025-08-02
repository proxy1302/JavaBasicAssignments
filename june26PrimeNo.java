package Array;

public class june26PrimeNo {

	public boolean primeno(int num) {
		boolean isprime;
		
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
				
			}
			
		}
		
		
		return isprime=true;
		
			 
			
		
		
	}
	
	
	

}
