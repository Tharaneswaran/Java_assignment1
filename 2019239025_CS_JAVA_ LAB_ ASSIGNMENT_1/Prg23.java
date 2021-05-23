public class Prg23
{
 public static void main(String[] args)
 {
	 int n=0 ,a=0, i = 0,j=0;
	 double sum=0;
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
	 	 sum = -1*a;
	  	 for( i=2 ; i <= n ;i++)
	  	 {

		  if(i%2==0)
			{
			 sum = sum + Math.pow(a,i);

		    }
		   else
		   {
			 sum = sum - Math.pow(a,i);

		   }

		 }
		}
	else
		{
				 sum =0;
		}
		System.out.println("The sum of the series-> - X + X^2 - X^3 +.....n is :" + sum);


 }
}



