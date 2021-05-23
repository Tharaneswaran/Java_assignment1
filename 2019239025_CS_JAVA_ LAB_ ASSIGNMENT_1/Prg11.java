public class Prg11
{
 public static void main(String[] args)
 {
	 int NV=0,OV=0,NVD=0,OVD=0,total=0;
	 System.out.print("Enter the Number of new videos Cassette required: ");
	 String x = System.console().readLine();
	 if (x.chars().allMatch(Character::isDigit))
	 {
	     NV = Integer.parseInt(x);
	 }
	 else
	 {
	     System.out.println("Invalid input.  Please enter a valid  number");
	     return;
	 }
	 System.out.print("Enter the Number of days new videos Cassette required: ");
	 x = System.console().readLine();
	 if (x.chars().allMatch(Character::isDigit))
	 {
	      NVD = Integer.parseInt(x);
	 }
	 else
	 {
	      System.out.println("Invalid input.  Please enter a valid  number");
	      return;
	 }

	 System.out.print("Enter the Number of old videos Cassette required: ");
	 x = System.console().readLine();
	 if (x.chars().allMatch(Character::isDigit))
	 {
	      OV = Integer.parseInt(x);
	 }
	 else
	 {
	      System.out.println("Invalid input.  Please enter a valid integer number");
	      return;
	 }
	 System.out.print("Enter the Number of days old videos Cassette required: ");
	 x = System.console().readLine();
	 if (x.chars().allMatch(Character::isDigit))
	 {
	      OVD = Integer.parseInt(x);
	 }
	 else
	 {
	      System.out.println("Invalid input.  Please enter a valid integer number");
	      return;
	 }


	 System.out.println("New video price for "+NV+" Cassette for " + NVD+ " Days is " +(NV*NVD*75));
	 System.out.println("Old video price for "+OV+" Cassette for " + OVD+ " Days is " +(OV*OVD*50));
	 total=(NV*NVD*75)+(OV*OVD*50);
	 System.out.println("Total Rental Price of the videos is : "+ total);
 }
}


