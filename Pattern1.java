import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n : ");
                int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}