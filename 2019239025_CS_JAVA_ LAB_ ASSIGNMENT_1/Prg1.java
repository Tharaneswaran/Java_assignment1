public class Prg1
{
 public static void main(String[] args)
 {
	 int a= 0;
	 System.out.print("Enter the number: ");
	 String b = System.console().readLine();
	 if(b.matches("-?\\d+(\\.\\d+)?"))
	 {
	     a = Integer.parseInt(b);
     }
     else {
		 System.out.println("Invalid input.  Please enter a valid integer number");
		 return;
	 }
	 if (a<0)
	 {
		 System.out.println("Your Input is a negative number: "+a+"\nHence the number is decremented until 0");
		 while (a!=0)
		 {
			 a=a+1;
			 System.out.println(a);
		 }

	 }
	 else
	 {
		 System.out.println("Your Input is a positive number \n hence not decremented: "+a);
	 }

 }
}


