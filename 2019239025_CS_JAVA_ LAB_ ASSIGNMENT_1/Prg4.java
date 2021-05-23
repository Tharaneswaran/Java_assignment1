public class Prg4
{
 public static void main(String[] args)
 {
	 int a= 0;
	 System.out.print("Enter the year to check whether its a leap year or not: ");
	 String b = System.console().readLine();

	 if (b.chars().allMatch(Character::isDigit))
	 	 {
	 	 		 a = Integer.parseInt(b);
	 		}
	 else
	 {
	 		 System.out.println("Invalid Input only enter a Valid year: ");
	 		 return;
	 }
	 if (a%4==0)
	 {
		 System.out.println("The year "+a+" is a leap year");

	 }
	 else
	 {
		 System.out.println("The year "+a+" is not a leap year");
	 }

 }
}


