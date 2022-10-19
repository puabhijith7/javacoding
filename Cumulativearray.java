import java.util.Scanner;

public class Cumulativearray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
                System.out.println("Enter number of elements :");
                int c=sc.nextInt();
		if(c!=0)
		{
                System.out.println("Enter the Elements :");
		for(int i=0;i<c;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.print(a[0]);
		int s=a[0];
		for(int i=1;i<c;i++)
		{
		s=s+a[i];
		System.out.print(" "+s);
		}
		}
		else
		{
		System.out.print("Invalid Range");
		}
                
		sc.close();

	}

}
