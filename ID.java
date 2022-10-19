import java.util.*;

public class ID
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your ID");
String c=sc.nextLine();
if(c.charAt(0)=='G' &&c.charAt(1)=='B'&&c.charAt(2)=='L' &&c.charAt(3)=='/'&&c.charAt(7)=='/')
{
 System.out.println("Login success");
}
else
{
 System.out.println("Incorrect ID");
}
}
}