import java.util.Scanner;

class Student1
{
    protected int studentid;
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDepartmentid() {
        return departmentid;
    }
    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    protected String name;
    protected int departmentid;
    protected String gender;
    protected String phone;
    
}
class Hosteller extends Student1
{
    private String hostelName;
    public String getHostelName() {
        return hostelName;
    }
    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    private int roomNumber;
}



public class hostel {
    public static void main(String[] args) {
        Hosteller b=getHostellerDetails();
        Scanner s=new Scanner(System.in);
        
        System.out.println("Modify room number y/n");
        char m=s.next().charAt(0);
        if(m=='y')
        {
            System.out.println("new room no");
            int nr=s.nextInt();
            b.setRoomNumber(nr);
        }
        
        
        System.out.println("Modify phone no y/n");
        char mp=s.next().charAt(0);
        
        if(mp=='y')
        {
            System.out.println("New phone no");
            String np=s.next();
            b.setPhone(np);
        }
        System.out.println("the student details");
        System.out.print(" "+b.getStudentid());
        System.out.print(" "+b.getName());
        System.out.print(" "+b.getRoomNumber());
        System.out.print(" "+b.getGender());
        System.out.print(" "+b.getPhone());
        System.out.print(" "+b.getHostelName());
        




    }
    public static Hosteller getHostellerDetails()
    {
        Hosteller h=new Hosteller();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the details:");
        System.out.println("Student id");
        int id=sc.nextInt();
        h.setStudentid(id);
        System.out.println("student name");
        String name=sc.next();
        h.setName(name);
        System.out.println("department id");
        int did=sc.nextInt();
        h.setDepartmentid(did);
        System.out.println("Gender");
        String g=sc.next();
        h.setGender(g);
        System.out.println("Phone no");
        String p=sc.next();
        h.setPhone(p);
        System.out.println("Hostel name");
        String hn=sc.next();
        h.setHostelName(hn);
        System.out.println("Room number");
        int r=sc.nextInt();
        h.setRoomNumber(r);
        
        return h;
        
    }



}