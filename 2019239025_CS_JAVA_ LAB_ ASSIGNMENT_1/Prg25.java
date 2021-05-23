public class Prg25
{
 public static void main(String[] args)
 {
	 int n=0 ,a=0, i = 0,j=0;
	 double sum=1;
	 double fact=1;
	 String x ;


	 System.out.print("Enter no of series 'n' : ");
	 x = System.console().readLine();
	 if (x.chars().allMatch(Character::isDigit))
	  {
	 	  n = Integer.parseInt(x);
	  }
	 else
	  {
	 	  System.out.println("Invalid Input only enter a Valid number: ");
	      return;
	  }
	 if (n>0)
		{

	  		System.out.println("Enter the value of x");
	  		x = System.console().readLine();
	  		if(x.matches("-?\\d+(\\.\\d+)?"))
				{
		     		a = Integer.parseInt(x);
				}
	  		else
	    		{
	 		 		System.out.println("Invalid input.  Please enter a valid integer number");
	 		 		return;
	 	 		}
	  	 for( i=2 ; i <= n ;i++)
	  	 {
		   for(j=i-1; j>0; j--)
		   {
			 fact = fact*j;
		    }

			if(i%2==0)
			{
				sum = sum - Math.pow(a,i-1)/fact;

		    }
		   else
		   {
			 sum = sum + Math.pow(a,i-1)/fact;

		   }
           fact=1;
		 }
		}
	else
		{
				 sum =0;
		}
		System.out.println("The sum of the series-> 1 - X + X^2 / 2! - X^3 / 3! +.....n is :" + sum);


 }
}



