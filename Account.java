import java.util.Scanner;



public class Account
{
    private String accountNumber;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    private String customerName;
    private double balance;



   public Account(String customerName,String accountNumber,int balance)
    {
    this.customerName=customerName;
    this.accountNumber=accountNumber;
    this.balance=balance;
    }
}
interface MaintenanceCharge
{



abstract public float calculateMaintenanceCharge (float noOfYears);





}



class CurrentAccount extends Account implements MaintenanceCharge
{



   public CurrentAccount(String customerName, String accountNumber, int balance) {
        super(customerName, accountNumber, balance);
        
        
    }
    public float calculateMaintenanceCharge(float noOfYears)
    {
        return((50*noOfYears)+50);
    }
    




}



class SavingsAccount extends Account implements MaintenanceCharge
{



   public SavingsAccount(String customerName, String accountNumber, int balance) {
        super(customerName, accountNumber, balance);
        
    }
    public float calculateMaintenanceCharge(float noOfYears)
    {
        return((100*noOfYears)+200);
    }



}
 class Main1
{
    public static void main(String[] args)
    {
        



       
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        System.out.println("Enter your choice");
        int a=sc.nextInt();
        System.out.println("Enter the Customer Name");
        String name=sc.next();
        System.out.println("Enter the Account number");
        String acname=sc.next();
        System.out.println("Enter the Balance amount");
        int b=sc.nextInt();
        System.out.println("Enter the number of years");
        int n=sc.nextInt();
        if(a==1)
        {
            SavingsAccount s=new SavingsAccount(name, acname, b);
            System.out.println(s.calculateMaintenanceCharge(n));
            
        }else
        {
            CurrentAccount c=new CurrentAccount(name, acname, b);
            System.out.println(c.calculateMaintenanceCharge(n));
        }



   }
}