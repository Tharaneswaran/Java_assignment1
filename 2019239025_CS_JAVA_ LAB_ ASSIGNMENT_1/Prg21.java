public class Prg21
{
 public static void main(String[] args)
 {
	 int number=0 ,largest=0;
	 String b = "0";


	 while(!(b.equals("exit")))
	 {
		 System.out.print("Enter the list of numbers to find the largest number (once finished enter ('exit'): ");
	 	 b = System.console().readLine();

	 	 if(b.matches("-?\\d+(\\.\\d+)?"))
	 	 {
	 	 	number = Integer.parseInt(b);
		 	if(largest < number )
			{
				largest = number;
			}
	 	 }
	 	 else if(b.equals("exit"))
	 	 {
			System.out.print("\n EXITED!! \n");

			}
		 else
		 {
			System.out.print("Invalid Input Enter a valid number or To exit Type ('exit')");
		 }

      }
      System.out.print("The largest number is : "+largest+"\n");

 }
}



