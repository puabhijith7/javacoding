import java.util.*;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
                System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
                System.out.println("Enter choice : ");
                int c=sc.nextInt();
                float f,q;
                System.out.println("Enter Input ");
                float n1=sc.nextFloat();
		switch(c)
		{
		case 1: f=(n1*9/5)+32;
                        System.out.println(" Input in Fahrenheit: "+f);
		        break;
		case 2: q=(n1-32)*5/9;
                        System.out.println(" Input in Celsius: "+q);
		        break;	        
                default: System.out.println("Invalid Input!!!");  
		}
		sc.close();
	}

}
