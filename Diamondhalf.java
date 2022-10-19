import java.util.Scanner;

public class Diamondhalf {
	
	public static void main(String[] args) {
		System.out.println("enter n\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}