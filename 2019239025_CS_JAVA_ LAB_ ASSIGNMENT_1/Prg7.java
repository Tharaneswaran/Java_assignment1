public class Prg7
{
 public static void main(String[] args)
 {
	 char Letter;
	 System.out.print("Enter the character: ");
	 String x = System.console().readLine();
	 Letter = x.charAt(0);
	 //Letter = Character.toUpperCase(Letter);

	 switch(Character.toUpperCase(Letter))
		 {
			 case ('A'):
				System.out.print( Letter+ " is a vowel\n");
				break;
			 case ('E'):
				System.out.print( Letter+ " is a vowel\n" );
				break;
			 case ('I'):
				System.out.print(Letter+ " is a vowel\n");
				break;
			 case ('O'):
				System.out.print(Letter+ " is a vowel\n");
				break;
			 case ('U'):
				System.out.print(Letter+ " is a vowel\n");
				break;

			 default:
				System.out.print(Letter+ " is a consonant\n");

		 }

 }
}


