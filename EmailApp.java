package EmailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=in.next();
		System.out.print("Enter your surname: ");
		String surname=in.next();
		Email e1=new Email(name,surname);

		
		System.out.println(e1.ShowInfo());
		
		
		
	}
	

}
