public class Prg3
{
 public static void main(String[] args)
 {
	 int a= 0;
	 System.out.print("Enter an Integer number: ");
	 String b = System.console().readLine();
	 if(b.matches("-?\\d+(\\.\\d+)?"))
	 {
	     a = Integer.parseInt(b);
	 }
	 else
	 {
	 		 System.out.println("Invalid input.  Please enter a valid integer number");
	 		 return;
	 }

	 if (a%2==0)
	 {
		 System.out.println("The integer "+a+" is Even number");

	 }
	 else
	 {
		 System.out.println("The integer "+a+" is Odd number");
	 }

 }
}


