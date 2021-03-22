import java.util.*;
import java.io.*;

public class MyPoc
{
	
	public static void main(String args[])
	{	
		Console con=System.console();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("\t\t\t**********Dont have Account ? Just Sign Up..**********");
		System.out.println("Enter Username :");
		String uname="";
		uname=s.next();
		int pwd;
		System.out.println("Enter PassWord : ");
		pwd=s.nextInt();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t\t********** Log in Page **********");

		System.out.println("Enter Username :");
		String uname2="";
		uname2=s.next();
		char[] pwd2=con.readPassword("Enter PassWord : ");

		System.out.println("--------------------------------------------------------------------");
		System.out.println("**********Product Search Page.....**********");
		System.out.println();
		System.out.println("1>> Bike");
		System.out.println("2>> Car");
		System.out.println("3>> BiCycle");
		System.out.println("Please Select Choice Number :");	
		int ch=s.nextInt();
		switch(ch){
			case 1:
				System.out.println("Welcome To The Bike Dept....");
				System.out.println("Please Select Choice Number :");
				
				System.out.println("1] Hero Xpulse 200");
				System.out.println("2] Honda CB Hornet");
				System.out.println("3] TVS Apache RTR");
				System.out.println("4] Honda X Blade");
				System.out.println("5] Bajaj Pulsar 150");

				int ch2=s.nextInt();
				switch(ch2)
				{
					case 1:
					
					break;

					case 1:
					break;

					case 1:
					break;

					case 1:
					break;

					case 1:
					break;	
				}
				


			break;

			case 2:
				System.out.println("Welcome To The Car Dept....");
			break;

			case 3:
				System.out.println("Welcome To The BiCycle Dept....");

			break;
		}



		 
		
			

	}
}
