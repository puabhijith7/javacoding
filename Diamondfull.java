

import java.util.Scanner;

public class Diamondfull {   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int a=sc.nextInt();
		a=a+1;
		for (int i=0;i<a;i++)
		{
			int c=i;
			while(c!=(a-1))
			{
				System.out.print(" ");
				c++;
			}			
			for (int j=0;j<i;j++)
			{				
				System.out.print("* ");
			}		
			System.out.println();
		}
		for (int i=(a-1);i>0;i--)
		{
			int c=i;
			while(c!=a)
			{
				System.out.print(" ");
				c++;
			}				
			for (int j=i;j>1;j--)
			{				
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
}

