
import java.util.Scanner;

class Associate
{
	
	public Associate(int associateid, String associateName) {
		super();
		this.associateid = associateid;
		this.associateName = associateName;
		
	}
	
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	private int associateid;
	private String associateName;
	private String workStatus;
	
	public void trackAssociateStatus(int n)
	{
		if (n<=20)
		{
			this.setWorkStatus("The Asscociate "+this.getAssociateName() +" work status : Core Skills");
		}
		else if (n<=40)
		{
			this.setWorkStatus("The Asscociate "+this.getAssociateName() +" work status : Advanced modules");
		}
		else if (n<=60)
		{
			this.setWorkStatus("The Asscociate "+this.getAssociateName() +" work status : Project Phase");
		}
		else
		{
			this.setWorkStatus("The Asscociate "+this.getAssociateName() +" work status : Deployed in project");
		}
	}
}


public class Dreamtek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Associate id : ");
		int q=sc.nextInt();
		System.out.println("Enter Associate name : ");
		String b=sc.next();
		System.out.println("Enter the number of days : ");
		int p=sc.nextInt();		
		Associate a=new Associate(q,b);
		a.trackAssociateStatus(p);
		System.out.println(a.getWorkStatus());
                sc.close();
	}

}
