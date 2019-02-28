class FindPrimes
{
   public static void main (String[] args)
   {		
       int Sander =0;
       int num =0;
       String  primeNumbers = "";

       for (Sander = 1; Sander <= Integer.parseInt(args[0]) ; Sander++)         
       { 		  	  
          int prime=0; 	  
          for(num =Sander; num>=1; num--)
	  {
             if(Sander%num==0)
	     {
 		prime = prime + 1;
	     }
	  }
	  if (prime ==2)
	  {
	     primeNumbers = primeNumbers + Sander + " ";
	  }	
       }	
       System.out.println(primeNumbers);
   }
}
