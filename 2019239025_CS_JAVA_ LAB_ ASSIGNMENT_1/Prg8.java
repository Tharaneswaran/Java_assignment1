public class Prg8
{

  public static void main(String[] args) {

    double a=0,b=0,c=0;
    double root1, root2;


    System.out.print("Enter the Coefficient of x^2: ");
    String x = System.console().readLine();
    if (x.chars().allMatch(Character::isDigit))
    	 {
    	     a = Double.parseDouble(x);
    	 }
    else
    	 {
    	 	 System.out.println("Invalid input.  Please enter a valid integer number");
    	 	 return;
 	 }
    System.out.print("Enter the coefficient of x: ");
        x = System.console().readLine();
        if (x.chars().allMatch(Character::isDigit))
        	 {
        	     b = Double.parseDouble(x);
        	 }
        else
        	 {
        	 	 System.out.println("Invalid input.  Please enter a valid integer number");
        	 	 return;
 	 }
    System.out.print("Enter the constant: ");
    x = System.console().readLine();
    if (x.chars().allMatch(Character::isDigit))
    	 {
    	     c = Double.parseDouble(x);
    	 }
    else
    	 {
    	 	 System.out.println("Invalid input.  Please enter a valid integer number");
    	 	 return;
 	 }
 	double determinant = (b * b) - (4*a*c);

    if (determinant > 0)
    {

	  System.out.println("\nThe roots are distinct\n");
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f\n", root1, root2);
    }


    else if (determinant == 0)
    {

      root1 = root2 = -b / (2 * a);
      System.out.println("\nThe roots are same\n");
      System.out.format("root1 = root2 = %.2f;\n", root1);
    }

    else
    {

      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.println("\nThe roots are not real\n");
      System.out.format("root1 = %.2f+%.2fi\n", real, imaginary);
      System.out.format("root2 = %.2f-%.2fi\n", real, imaginary);
    }
  }
}