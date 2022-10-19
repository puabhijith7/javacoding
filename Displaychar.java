import java.util.Scanner;

public class Displaychar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
                System.out.println("Enter the Digits :");
		for(int i=0;i<4;i++)
		{
		a[i]=sc.nextInt();
		}
		
		for(int i=0;i<4;i++)
		{
		char c=(char)a[i];
		System.out.println(a[i]+"-"+c);
		}
                
		sc.close();

	}

}
