package vikas.RatanRaman;

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
	

	
}
