public class Prg5
{
 public static void main(String[] args)
 {
	 float a=0,b=0,c=0;
	 System.out.print("Enter the First number: ");
	 String x = System.console().readLine();
	 if(x.matches("-?\\d+(\\.\\d+)?"))
	 {
	      a = Float.parseFloat(x);
	 }
	 else
	 {
	 		 System.out.println("Invalid input.  Please enter a valid integer number");
	 		 return;
	 	 }

	 System.out.print("Enter the Second number: ");
	 x = System.console().readLine();
	 if(x.matches("-?\\d+(\\.\\d+)?"))
	 {
	      b = Float.parseFloat(x);
	 }
	 else
	 {
	 	 		 System.out.println("Invalid input.  Please enter a valid integer number");
	 	 		 return;
	 	 }

	 System.out.print("Enter the Third number: ");
	 x = System.console().readLine();
	 if(x.matches("-?\\d+(\\.\\d+)?"))
	 {
	        c = Float.parseFloat(x);
	 }
	 else
	 {
	  	 		 System.out.println("Invalid input.  Please enter a valid integer number");
	 	 	 		 return;
	 	 }

	 System.out.println("The Given Numbers are \na = "+a+" \nb = "+b+"\nc = "+c );
	 if (a>b)
	 {
		 if(a>c)
		 {
			 System.out.println("The Greatest Number is a = "+a);
		 }
		 else
		 {
			 System.out.println("The Greatest Number is c = "+c);
		 }

	 }
	 else
	 {
		 if(b>c)
		 {
			 System.out.println("The Greatest Number is b = "+b);
		 }
		 else
		 {
			 System.out.println("The Greatest Number is c = "+c);
		 }
	 }

 }
}


