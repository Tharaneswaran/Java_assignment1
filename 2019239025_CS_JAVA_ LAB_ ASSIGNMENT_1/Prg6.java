public class Prg6
{
 public static void main(String[] args)
 {
	 int DayNo=0;
	 System.out.print("Enter the Day in number (1 to 12): ");
	 String x = System.console().readLine();

	 if (x.chars().allMatch(Character::isDigit))
	 	 {
	 	 		DayNo = Integer.parseInt(x);
	 		}
	      else
	      {
	 		 System.out.println("Invalid Input only enter a Day number: ");
	 		 return;
	 		}

	 switch(DayNo)
		 {
			 case 1:
				System.out.print("Day No: "+DayNo+ " is Sunday\n");
				break;
			 case 2:
				System.out.print("Day No: "+DayNo+ " is Monday\n");
				break;
			 case 3:
				System.out.print("Day No: "+DayNo+ " is Tuesday\n");
				break;
			 case 4:
				System.out.print("Day No: "+DayNo+ " is Wednesday\n");
				break;
			 case 5:
				System.out.print("Day No: "+DayNo+ " is Thursday\n");
				break;
			 case 6:
				System.out.print("Day No: "+DayNo+ " is Friday\n");
				break;
			 case 7:
				System.out.print("Day No: "+DayNo+ " is Saturday\n");
				break;
			 default:
				System.out.print("Error");

		 }


 }
}


