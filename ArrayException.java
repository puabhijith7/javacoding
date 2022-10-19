import java.util.*;

public class ArrayException {
public String getPriceDetails()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=sc.nextInt();  
    int a[]=new int[n];
    System.out.println("enter the price details");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("enter index of array");
    try {
    int b=sc.nextInt();
    return("the array element is "+a[b]);
    }
       catch (ArrayIndexOutOfBoundsException e) {
        return("Array index is out of range");
     } catch (InputMismatchException e) {
        return("Input was not in the correct format");
     }    
}
public static void main(String [] args)
{
    ArrayException obj=new ArrayException();
    System.out.println( obj.getPriceDetails());
}
}