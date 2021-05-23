public class Prg16
{
 public static void main(String[] args)
 {
	 int Sum=0 , i=1;
	 for(i=1;i<=100;i++)
	 {
		if(i%2 != 0)
		{
			Sum=Sum+i;
	 		System.out.println("Sum = " + Sum + "\n");
		}


	 }
	 System.out.println("Total Sum of Odd Numbers from 1 to 100 = " + Sum + "\n");
 }
}


