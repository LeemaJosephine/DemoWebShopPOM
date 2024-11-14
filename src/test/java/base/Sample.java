package base;

public class Sample {

	
	    public static void main(String[] args) {
	    	
	    	int n=5;
	        int m=n;// copy of n should be needed to decrement
	        for (int i=1;i<=n;i++)
	        {
	        	for (int j=n;j>=1;j--)
	        	{
	        		if (j==i||j==m) 
	        			System.out.print("*");
	        			else
	        		System.out.print(" ");	
	        		
	        	}
	        	m=m-1;
	        	System.out.println();
	        }
	        
	     

	    }
	}


