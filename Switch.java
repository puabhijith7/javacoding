import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter choice : ");
                int c=sc.nextInt();
                System.out.println("Enter Number 1 : ");
                int n1=sc.nextInt();
                System.out.println("Enter Number 2 : ");
                int n2=sc.nextInt();
		switch(c)
		{
		case 1: System.out.println("Result : "+(n1+n2));
		break;
	        case 2: System.out.println("Result : "+(n1-n2));
		break;
                case 3: System.out.println("Result : "+(n1*n2));
		break;
                case 4: System.out.println("Result : "+(n1/n2));
		break;
                default: System.out.println("Invalid Input for Choice!!!");  
		}
		sc.close();

	}

}
