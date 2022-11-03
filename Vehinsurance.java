
 class Vehicle implements loan,Insurance
 {
	 public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	 public Vehicle(String vehicleNumber, String modelname, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelname = modelname;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	 private String vehicleNumber;
	 private String modelname;
	 private String vehicleType;
	 private double price;
	 
	 public double issueLoan() 
	 {
		 if (vehicleType.equals("4 wheeler"))
		 {
			 return (.8*price);
		 }
		 else if (vehicleType.equals("3 wheeler"))
		 {
			 return (.75*price);
		 }
		 else 
		 {
			 return (.5*price);
		 }
		
	 }
	 public double takeInsurance()
	 {
		 if(price<=150000)
		 {
			 return 3500;
		 }
		 else if(150000>price && price<300000)
		 {
			 return 4000;
		 }
		 else
		 {
			 return 5000;
		 }
	 }


 }
 abstract interface loan 
{
	 abstract double issueLoan(); 
}
abstract interface Insurance
{
	 abstract double takeInsurance(); 
}
  

public class Vehinsurance {

	public static void main(String[] args) {
		Vehicle v=new Vehicle("KL A 1234", "abcd", "4 wheeler", 1000);
		System.out.println("Loan amount : "+v.issueLoan());
		System.out.println("Insurance amount : "+v.takeInsurance());

	}

}
