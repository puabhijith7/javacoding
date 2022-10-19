import java.util.*;

public class math{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a: ");
int a=sc.nextInt();
System.out.println("Enter b: ");
int b=sc.nextInt();
System.out.println();
int c=0;
int w;
if(a<b)
{
w=a;
}
else{
w=b;
}
for(int i=1;i<=w;i++)
{
if(b%i==0 && a%i==0)
{
//System.out.print(i+" ");
c++;

}
}
System.out.print("count is : "+c);
}
}