public class Prg10
{
 public static void main(String[] args)
 {
	 char Letter;
	 System.out.print("Enter the Grade (O,A,B,C,F): ");
	 String x = System.console().readLine();
	 Letter = x.charAt(0);
	 if (Letter == 'o' || Letter == 'O')
	 	{
	 		System.out.println(Letter+ " = Outstanding\n");
	 	}
	 else if (Letter == 'a' || Letter == 'A')
	 	{
	 		System.out.println(Letter+ " = Very Good\n");
	 	}
	 else if (Letter == 'b' || Letter == 'B')
	 	{
	 		System.out.println(Letter+ " = Good\n");
	 	}
	 else if (Letter == 'c' || Letter == 'C')
	 	{
	 		System.out.println(Letter+ " = Average\n ");
	 	}
	 else if (Letter == 'f' || Letter == 'F')
	 	{
	 		System.out.println(Letter+ " = Fail\n ");
	 	}
	 else
	 	{
	 		System.out.println(Letter+ " = Its not a valid Grade ");
	 	}

 }
}


