import java.util.Scanner;

class Division
{
 public String divideTwoNumbers(int n1,int n2)
 {
	 try
		{
			int d=(n1/n2);
			System.out.print("The answer is "+d);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Divide by zero is not possible");
		}
	 finally
	 {
		 System.out.print(". Thanks for using the application.");
	 }
   return null;
}
}
public class arithexcep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Division p=new Division();
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		p.divideTwoNumbers(a, b);

	}


}
