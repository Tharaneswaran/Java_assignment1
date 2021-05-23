public class Prg2
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

	 if (a%11==0)
	 {
		 System.out.println("The Given integer is divisble by 11");

	 }
	 else
	 {
		 System.out.println("The number is not divisble by 11");
	 }

 }
}


