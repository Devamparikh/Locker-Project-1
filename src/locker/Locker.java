package locker;

import java.util.Scanner;

public class Locker {
	
	public static void menu() {
		int fromFirstMenu=0, fromSecondMenu=0;
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("Please choose one of the following options :");
			System.out.println("1. List Current Files");
			System.out.println("2. Business Operations");
			System.out.println("3. Close Application");
			try{    
				fromFirstMenu = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(fromFirstMenu)
			{
			case 1: //List function feature to list all files in ascending order.
				BusinessOperations.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. Add a File");
					System.out.println("2. Delete a File");
					System.out.println("3. Search for a File");
					System.out.println("4. Back to main menu");
					try{    
						fromSecondMenu = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(fromSecondMenu)
					{
					case 1:
						//Creation of a file takes place
						System.out.println("Input the name of a file to be created: ");
						String fileCreate = sc.next();
						
						// Calling the function to create the file
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of a file takes place
						System.out.print("Input the name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						// Calling the function to delete the file
						BusinessOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Input the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						BusinessOperations.searchFile(fileSearch);
						break;
					case 4:
						//Back to main menu
						menu();
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("\n Opps! Invalid Input,Re-do the process\n");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\n It was nice having you here! See you again. Good bye...");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println("\n\n Opps! Invalid Input, Select within the range of 1-3\n");
				break;
			
			}
		}
	}

	public static void main(String[] args) {
//		int fromFirstMenu=0, fromSecondMenu=0;
//		Scanner sc =new Scanner(System.in);
		
		System.out.println("\t**********************\n");
		System.out.println("\t Welcome to LOCK IT! ");
		System.out.println("\t By, Locker Pvt Ltd. \n");
		System.out.println("\t**********************");
		System.out.println(" Developer\t: Devam Parikh \n ");
		Locker.menu();
		

	}

}
