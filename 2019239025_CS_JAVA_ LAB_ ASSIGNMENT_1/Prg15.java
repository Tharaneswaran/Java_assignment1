public class Prg15
{
 public static void main(String[] args)
 {
	 int n=0 , x=0;
	 System.out.print("Enter the total numbers to find an average: ");
	 String b = System.console().readLine();

	 if (b.chars().allMatch(Character::isDigit))
	 {
	 	n = Integer.parseInt(b);
	 }
     else
	 {
	  	System.out.println("Invalid input.  Please enter a valid integer number");
		return;
	 }
	 for(int i = 1; i<=n; i++)
	 {
	     System.out.print("\nEnter the " +i+ " : ");
		 b = System.console().readLine();
		 if(b.matches("-?\\d+(\\.\\d+)?"))
		 	 {
		 	     x += Integer.parseInt(b);
		 	 }
		 	 else
		 	 {
		 	 		 System.out.println("Invalid input.  Please enter a valid integer number");
		 	 		 return;
	 			}


      }
      	System.out.println("\nAverage of the Given numbers is : "+(x/n));

 }
}



