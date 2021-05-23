public class Prg20
{
 public static void main(String[] args)
 {
	 int number=0 , count=0 , remainder=0;
	 System.out.print("Enter a number to check the number of digits: ");
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
	     number = number / 10;
	     count+=1;

      }

		System.out.println("The number of Digits in the Given Number " +Integer.parseInt(b) + " is " + count );

 }
}



