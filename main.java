class customer {
 public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

 int customerid;
 String CustomerName;
 String emailid;
  
public customer(int customerid,String CustomerName,String emailid)
{
    this.customerid=customerid;
    this.CustomerName=CustomerName;
    this.emailid=emailid;
}
}
abstract class account
{
    int accountNumber;
    customer cobj;
    double balance;
    public account(int accountNumber,customer cobj,double balance)
    {
        this.accountNumber=accountNumber;
        this.cobj=cobj;
        this.balance=balance;
    }
    abstract public boolean withdraw(double amount);
    
}
 class  SavingsAccount extends account
{
   private double minimumBalance;

   public SavingsAccount(int accountNumber, customer cobj, double balance,double minimumBalance)
    {
        super(accountNumber, cobj, balance);
        this.minimumBalance=minimumBalance;
    
    }
    public double getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    public boolean withdraw(double amount)
    {
        if(balance-amount>minimumBalance)
        {
            balance-=amount;
            return true;
        }
        return false;
    }
    
}
 
    class main
    {
            public static void main(String[] args) {
            customer c=new customer(7,"abhi","abhi@com");
            SavingsAccount a=new SavingsAccount(100,c,1000,200);
            System.out.println(a.withdraw(900));
        }
     
    }

 


 