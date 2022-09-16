package com.test;

public class PrimeNumberChallenge {

	public static void main(String[] args) {
	
	    int i,n=4,count=0;
	    if(n!=1) {
		
		for(i=1;i<=n;i++)      
		{
			if(n%i==0)         
			{
			 count=count+1;      
		    }
		}
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("composite number");
			
		}
	
	     {
	    	System.out.println("Neither prime nor composite");
	    }
}
	}}
