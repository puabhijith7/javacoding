import java.util.*;

public class fact{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int b=1;
System.out.println("Enter Number : ");
int a=sc.nextInt();
for(int i=2;i<=a;i++)
{
b=b*i;
}
System.out.println("Factorial is :"+b);
}
}
