public class Prg19
{
 public static void main(String[] args)
 {
	 int number=0 , reversedInteger=0 , remainder=0;
	 System.out.print("Enter a number to check whether its Palindrome or not: ");
	 String b = System.console().readLine();
	 if(b.matches("-?\\d+(\\.\\d+)?"))
	 {
	     number = Integer.parseInt(b);
	 }
	 else
	 {
	 	 System.out.println("Invalid input.  Please enter a valid integer number");
	 	 return;
 	 }


	 while(number != 0)
	 {
		 remainder = number % 10 ;
		 reversedInteger = reversedInteger * 10 + remainder ;
	     number = number / 10;

      }
      if(reversedInteger == Integer.parseInt(b) )
      {
      	System.out.println(Integer.parseInt(b) + " Is a Palindrome Number");
	  }
	  else
	  {
		System.out.println(Integer.parseInt(b) + " Is Not a Palindrome Number");
	  }

 }
}



