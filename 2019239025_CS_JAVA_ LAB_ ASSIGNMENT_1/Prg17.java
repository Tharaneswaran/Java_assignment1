public class Prg17
{
 public static void main(String[] args)
 {
	 int n=0 , x=0;
	 System.out.print("Enter the range to find the square and cube of the numbers : ");
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
	         System.out.println(i+" "+(i*i)+" "+(i*i*i));

      	}


 }
}



