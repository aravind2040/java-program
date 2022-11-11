package aravind;

public class Primegieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=2;
        int j=2;
        int k=1;
        int n=100;
       int  count=0;
       while(k<=n) {
       	if(n%k==0) {
     	     System.out.print(k+" ");
     	  
       	}
       	
       	k++;
       }
       System.out.println();
       while(i<=n) {
    	   count=0;
    	 j=1;
    	   while(j<=i) {
    		   if(i%j==0) {
    			   count++;
    			
    		   }
    		   j++;
    	   }
    	   
    		   if(count==2) {
    			   if(n%i==0) {
    			   System.out.println("prime number of divisor 100:  "+i);
    			   }
    		   }
    		   i++;
    	   }
    	   
	}

}
