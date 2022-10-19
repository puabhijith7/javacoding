import java.util.*;

public class swap{
public  static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 1: ");
int a=sc.nextInt();
System.out.println("Enter Number 2: ");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("Number1 after Swapping: "+a);
System.out.println("Number2 after Swapping: "+b);
}
}