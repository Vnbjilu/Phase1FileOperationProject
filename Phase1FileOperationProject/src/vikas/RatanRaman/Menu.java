package vikas.RatanRaman;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public void details(String appName,String devName)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\t======================App Details and Developer Name=========================");
		System.out.println("\n\t\t AppName       : "+appName);
		System.out.println("\n\t\t DeveloperName : "+devName);
		System.out.println("====================================================================================");
		System.out.print(" Type Ok and Press Enter key to continue...........");
		String s=sc.next();
	}
	public void mainMenu()
	{
		System.out.print("\n\n\n\t======================= Welcome to Main Menu=====================================");
		System.out.print("\n\n\t 1-> for Display All From Main Directory ");
		System.out.print("\n\n\t 2-> for Display All the Files from Other Directory ");
		System.out.print("\n\n\t 3->for File Operation ");
		System.out.print("\n\n\t 4-> for Exit the program ");
		
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
		int ch=1;
		while(ch!=4)
		{
			try
			{
				
					mainMenu();
					System.out.print("\n\n\tEnter the choice");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
							fileDisplayInAscendingOrder(true);
							break;
						case 2:
							fileDisplayInAscendingOrder(false);
						case 3:
							fileTask();
						break;
						case 4:
							displayMessage();
						break;
					
						default:
							System.out.print("\n\n\t Sorry !! You have Selected Wrong  Choice ");
							System.out.print("\n\n Type Ok and Press Enter key to continue........");
							String s=sc.next();
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
	}
	
	public  void fileDisplayInAscendingOrder(boolean f) {
		
		Scanner sc=new Scanner(System.in);
		String path="__main__";
		CreateDirectoryIfNotExist();
		if(!f)
		{
		
		System.out.print("Enter the Path that List you have to See  ");
		path=sc.nextLine();
		}
		
		List<String> filesName=new ArrayList<>();
		System.out.print("\n\n\t ================ File/Folder Structure Given Below================================\n\n\n");
		List<String> totalFileName=displayAllFiles(path,3,filesName);
		System.out.print("\n\n\t==============================End of Location=======================================");
		System.out.println("\n\n\t\t************ Files in Give Location *************");
		Collections.sort(totalFileName);
		int i=0;
		totalFileName.forEach(n->{
			System.out.println("\t\t ->"+n);
		
		});
		System.out.println("\n\n\t=================================End of File Names=============");
		
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
	public void CreateDirectoryIfNotExist()
	{
		File f=new File("__main__");
		if(!f.exists())
			f.mkdir();
	}
	public void fileCreation()
	{
		CreateDirectoryIfNotExist();
		
		Scanner sc=new Scanner(System.in);
		try
		{
			
			String file="";
			System.out.print("Enter the file name");
			file=sc.nextLine();
			String path="__main__//"+file;
			File f=new File(path);
			if(!f.exists())
				f.createNewFile();
			int i=0;
			System.out.print("enter the number of lines you want to add ");
			i=sc.nextInt();
			String line="";
			System.out.print("Enter your text ");
			while(i>0)
			{
				line+=sc.nextLine()+"\n";
				i--;
			}
			FileOutputStream fout=new FileOutputStream(f,true);
			byte[] c=line.getBytes();
			fout.write(c);
			
			
			
		
		} catch (IOException e) {
				// TODO Auto-generated catch block
			System.out.println("hello i am ");
				e.printStackTrace();
		}
			
			
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
		System.out.print("====================================== Thanks===============================");
		System.out.println("\n\n\t Thanks for Using This Software ");
		System.out.println("\n\n\t Special Thanks to My Trainer Mr. Mritunjay ");
		System.out.println("\n\tI am hearty Thanks to Simplilearn to make me able to complete this task");
		System.out.println("\n\tAt Last Thanks to Everyone ");
		System.out.println("=============================================================================");
	}
	public  List<String>  displayAllFiles(String path,int indentationCount,List<String> listFileNames)
	{

		try
		{
		File file=new File(path);
		File files[]=file.listFiles();
		List<File> filenames=Arrays.asList(files);
		Collections.sort(filenames);
		if(files!=null && files.length>0)
		{
			for(File f:filenames)
			{
				
				System.out.print(" ".repeat(indentationCount * 2));
				if(f.isDirectory())
				{
					System.out.println("-->[Dir] "+f.getName());
					listFileNames.add(f.getName());
					displayAllFiles(f.getAbsolutePath(), indentationCount+1, listFileNames);
				}
				else
				{
					System.out.println("|-->[Files] "+f.getName());
					listFileNames.add(f.getName());
				}
				
				
			}
		}
		else
		{
			System.out.println(" ".repeat(indentationCount*2));
			System.out.println("--> Empty Directoryies ");
		}
		
		}catch(Exception e) {}
		return listFileNames;
	}
	
}
