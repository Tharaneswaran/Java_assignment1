public class Prg18
{
 public static void main(String[] args)
 {
	 int number=0 , sum=0 , remainder=0;
	 System.out.print("Enter a number to check whether its Armstrong or not: ");
	 String b = System.console().readLine();
	 if (b.chars().allMatch(Character::isDigit))
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
		 sum += remainder*remainder*remainder ;
	         number = number / 10;

      }
      if(Integer.parseInt(b) == sum)
      {
      	System.out.println(Integer.parseInt(b) + " Is an Armstrong Number");
	  }
	  else
	  {
		System.out.println(Integer.parseInt(b) + " Is Not an Armstrong Number");
	  }

 }
}



