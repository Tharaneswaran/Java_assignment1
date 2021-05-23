public class Prg9
{
 public static void main(String[] args)
 {
	 char Letter;
	 System.out.print("Enter the character: ");
	 String x = System.console().readLine();
	 Letter = x.charAt(0);
	 if ((Letter >= 'a' && Letter <= 'z') || (Letter >= 'A' && Letter <= 'Z'))
	 	{
	 		System.out.println(Letter+ " Is an alphabet\n");
	 	}
	 else if (Letter >= '0'&& Letter <= '9')
	 	{
	 		System.out.println(Letter+ " Is a Digit\n");
	 	}
	 else if (Letter == ' ')
	 	{
	 		System.out.println(Letter+ " Is a Whitespace\n");
	 	}
	 else
	 	{
	 		System.out.println(Letter+ " Is Not an Alphabet or Digit or Whitespace\n ");
	 	}



 }
}


