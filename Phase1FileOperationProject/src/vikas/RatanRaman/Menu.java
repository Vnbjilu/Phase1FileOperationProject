package vikas.RatanRaman;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public void details(String appName,String devName)
	{
		System.out.println("\n\n\t======================App Details and Developer Name=========================");
		System.out.println("\n\t\t AppName       : "+appName);
		System.out.println("\n\t\t DeveloperName : "+devName);
	}
	public void mainMenu()
	{
		System.out.print("\n\n\n\t======================= Welcome to Main Menu=====================================");
		System.out.print("\n\n\t 1-> for Display All the Files ");
		System.out.print("\n\n\t 2->for File Operation ");
		System.out.print("\n\n\t 3-> for Exit the program ");
		
	}
	public void fileMenu()
	{
		
		System.out.print("\n\n\t======================== Welcome to File Operation Menu==============================");
		System.out.print("\n\n\t 1-> for Add File with Content ");
		System.out.print("\n\n\t 2-> For Delete the File ");
		System.out.print("\n\n\t 3-> For Search the File");
		System.out.print("\n\n\t 4-> for Go Back to Main Menu ");
	}
	

	//Function with Main Menu
	public void mainTask()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\n\tEnter the choice");
		try
		{
			int ch=1;
			while(ch!=3)
			{
				mainMenu();
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						//fileDisplayInAscendingOrder();
						break;
					case 2:
						fileTask();
					break;
					case 3:
						displayMessage();
					break;
				
					default:
						System.out.print("\n\n\t Sorry !! You have Selected Wrong  Choice ");
						System.out.print("\n\n Type Ok and Press Enter key to continue........");
						String s=sc.next();
				}
			}
			
		}catch(InputMismatchException e)
		{
			System.out.print("\n\n\t Sorry Only Integer Numbers are Allowed");
			System.out.print("\n\n\tType Ok and press Enter key to Continue...........");
			String s=sc.next();
		}
		catch(Exception e)
		{
			System.out.print("Error Created ="+e.toString());
		
		}
		
	}
	public  void fileTask() 
	{
		
		int ch=1;
		Scanner sc=new Scanner(System.in);
		try
		{
			while(ch!=4)
			{
				fileMenu();
				System.out.print("\n\n\t Enter the choice");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					fileCreation();
					break;
				case 2:
					fileDeletion();
					break;
				case 3:
					fileSearching();
					break;
				case 4:
				break;
				default:
					System.out.print("\n\n\t Sorry !! You have Selected Wrong  Choice ");
					System.out.print("\n\n Type Ok and Press Enter key to continue........");
					String s=sc.next();
				}
			}
		
			
		}catch(InputMismatchException e)
		{
			System.out.print("\n\n\t Sorry Only Integer Numbers are Allowed");
			System.out.print("\n\n\tType Ok and press Enter key to Continue...........");
			String s=sc.next();
		}
		catch(Exception e)
		{
			System.out.print("Error Created ="+e.toString());
		
		}
		
	}
	public void fileCreation()
	{
		System.out.print("Welcome to File Creation ");
	}
	public void fileDeletion()
	{
		System.out.print("Welcome to File Searching and deletion ");
		
	}
	public void fileSearching()
	{
		System.out.print("Welcome to File Searching");
	}
	public void displayMessage()
	{
		System.out.println("\n\n\t Thanks for Using This Software ");
		System.out.println("\n I am hearty Thanks to Simplilearn to make me able to complete this task");
		System.out.println("\nAt Last Thanks to Everyone ");
	}
}
