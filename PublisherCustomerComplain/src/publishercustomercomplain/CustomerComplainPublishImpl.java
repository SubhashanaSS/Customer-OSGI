package publishercustomercomplain;

import java.util.Scanner;

public class CustomerComplainPublishImpl implements CustomerComplainPublish{
	private String Name;
	private String Email;
	private String PhoneNO;
	private String Subject;
	private String Discription;
	
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void main() {
		CustomerDetails();	
	}
	
	@Override
	public void CustomerDetails() {
		
		System.out.print("Enter Customer Name : ");
		this.Name = scn.next();
		
		System.out.print("Enter Valid Email : ");
		this.Email = scn.next();
		
		System.out.print("Enter Phone Number : ");
		this.PhoneNO = scn.next();
		
		System.out.print("Enter Complain Subject : ");
		this.Subject = scn.next();
		
		System.out.print("Enter Complain Discription : ");
		this.Discription = scn.next();
	}
}
