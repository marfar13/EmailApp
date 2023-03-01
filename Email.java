package EmailApp;

import java.util.Scanner;

public class Email {

	private String FirstName;
	private String LastName;
	private String Password;
	private String departament;
	private String AlternativeEmail;
	private int MailboxCapacity=500;
	private int FirstPasswordLength=10;
	private String email;
	private String CompanySuffix="company.com";
	int n;
	Scanner in=new Scanner(System.in);
	
	
	
	public Email(String FirstName, String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		System.out.println("New Worker: "+ this.FirstName+" "+this.LastName);
		
		//ask department-- return the department
		
		this.departament=setDepartamnet();
		System.out.println("Departamnet: "+this.departament);
		
		// random password
		
		this.Password=RandomPassword(8);	
		System.out.println("Your password is: "+ this.Password);
		
		
		
		//generate email
		
		email=FirstName.toUpperCase()+"."+LastName.toLowerCase()+"@"+departament+"."+CompanySuffix;
		System.out.println("your email is: "+email);
		
		ChangePassword(this.Password);
		
	}
	
	
	
	private String setDepartamnet()
	{
		System.out.print("Enter the departamnet\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter deparrtament code: ");
		n=in.nextInt();
		if(n==1) return "Sales";
		else if(n==2) return "Developmnet";
		else if(n==3) return "Accounting";
		else return "";
	}
	
	
	
	
	private String RandomPassword(int length)
	{
		String PasswordSet="1234567890qwertyuiopasdfghjklzxcvbnm";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int n=(int) (Math.random()*PasswordSet.length());
			password[i]=PasswordSet.charAt(n);
		}
		
		return new String (password);
		
	}
	
	public void SetMailboxCapacity(int capacity)
	{
		this.MailboxCapacity=capacity;
	}
	
	
	public void SetAlternativeEmail(String aEmail)
	{
		this.AlternativeEmail=aEmail;
	}
	
	
	public void ChangePassword(String Password)
	{
		System.out.println("Press 1, if you want to change your password: ");
		int x=in.nextInt();
		if(x==1)
		{
			System.out.println("Enter new password: ");
			Password=in.next();
			
		}
		this.Password=Password;
		System.out.println("Your password is: "+this.Password);

		
	}
	
	public String ShowInfo()
	{
		return 	"Your info:"+
				"\nNAME: "+FirstName+" "+LastName+
				"\nCompany email: "+email+
				"\nMailbox capacity: "+MailboxCapacity;
	}
	
	
	
	
}
