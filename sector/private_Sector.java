

package sector;

import java.util.*;	


public class private_Sector implements income_tax
{		
	Scanner sc=new Scanner(System.in);
			String name;
			String feild;
			float income,in_tax,tax;
			public void get()
			{
				System.out.println("Enter your name...");
				name=sc.nextLine();
			   	System.out.println("Enter your income....");
				income=sc.nextFloat();
			}
			public void display()
			{
				System.out.println("..............................................................\n\n");
				System.out.println("Name        ="+name);
				System.out.println("Income      ="+income);
				System.out.println("Tax rate is ="+tax);
				System.out.println("Tax Amount  ="+in_tax);
				System.out.println("..............................................................\n\n\n");
				
			}
		public void private_job()
			{
			try
				{
				if(income<150000)
				{
					tax=(float)0.05;
					in_tax=income*tax;
				
				}
				else if(income>=150000 && income<=500000)
				{
					tax=(float)0.15;
					in_tax=income*tax;
				}
				else if(income>=500000 && income<=3000000)
				{
					tax=(float)0.25;
					in_tax=income*tax;
				}
				else if(income>=3000000)
				{
					tax=(float)0.35;
					in_tax=income*tax;
				}
				else
				{
					throw new Exception("Invalid Input");
				}
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e);
				}
			}
}