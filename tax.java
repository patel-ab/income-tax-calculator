//Program to Calculate Income Tax
import java.util.*;

import sector.*;



public class tax
{
		public static void main(String args[])
		{
			
			System.out.println("Lets Calculate Income tax......\n");
		//income_tax i1=new income_tax();
		private_Sector i2 = new private_Sector();
		gov_Sector i3=new gov_Sector();
		agriculture_Sector i4=new agriculture_Sector();
		buisness_Sector i5=new buisness_Sector();
		//i1.get();
		String a = new String();
		int i;
		
		String c = new String("e");
		for(i=0;a.compareTo(c)!=0 ;i++)
		{
		
	
		System.out.println("........Enter the detail........");
		System.out.println("Enter the feild:\n'p':private job \t 'g':gov job \t 'a':agriculture sector \t 'b':buisness \t 'e':exit");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		try
		{
		switch(a)
		{
			case "p":
				System.out.println("You have entered for private job");
				i2.get();
				i2.private_job();
				i2.display();
				break;
			case "g":
				System.out.println("You have entered for government job");
				i3.get();
				i3.gov_job();
				i3.display();
				break;
			case "a":
				System.out.println("You have entered for agriculture sector");
				i4.get();
				i4.agr_sec();
				i4.display();
				break;
			case "b":
				System.out.println("You have entered for buisness sector");
				i5.get();
				i5.buisness();
				i5.display();	
				break;
			case "e":
				System.out.println("Exit the menu");
				break;
			default:
				 throw new Exception("You very Well Know how to read, Please read the instructions Carefully and Enter the details....");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
		}
	}
}