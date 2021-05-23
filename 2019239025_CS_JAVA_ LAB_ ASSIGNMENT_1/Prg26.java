public class Prg26
{
 public static void main(String[] args)
 {
	 int i=0;
	 double radian;
	 for (i = 0;i<=360;i=i+15)
	  {
		 radian= i* (3.142/180.0);
		 System.out.println("\nsin("+i+")\t "+Math.sin(radian)+"\ncos("+i+")\t"+Math.cos(radian)+"\ntan("+i+")\t"+Math.tan(radian));
      }

 }
}



