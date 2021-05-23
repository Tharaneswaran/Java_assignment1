public class Prg12
{
 public static void main(String[] args)
 {
	 int number=0 ;
	 String output = "The Prime Factors of the Given Number is ";
	 System.out.print("Enter the number: ");
	 String b = System.console().readLine();
	 if (b.chars().allMatch(Character::isDigit))
	 {
	 		number = Integer.parseInt(b);
		}
     else {
		 System.out.println("Invalid Input only enter a number: ");
		 return;
	 }
	 for(int i = 2; i<= number; i++)
	 {
	          while(number%i == 0)
	          {
				 output += i+ " x ";
	             number = number/i;
	          }
	       }
	       if(number >= 1)
	       {
			   output += number;

      }
      System.out.println(output+"\n");

 }
}



