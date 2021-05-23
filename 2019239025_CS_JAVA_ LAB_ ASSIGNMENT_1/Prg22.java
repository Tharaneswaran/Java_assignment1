public class Prg22
{
 public static void main(String[] args)
 {
	 int n=0 ,sum=0 ,i=1;
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
	  for(i=1;i<=n;i++)
	  {
		  sum+=((i*i)/i);
	  }
	  System.out.println("Sum of series is: 1^2 / 1 + 2^2 / 2 + 3^2 / 3 + .... + n^2 / n:\n Sum = "+sum);

 }
}



