package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {
	static final String projectpath="C:\\Users\\saiprasad mahore\\eclipse-workspace\\SaiprasadOneLockMe_JavaProject\\LockedMeFiles";
	public static void main(String[] args)
			
	{ 
		try (Scanner obj = new Scanner(System.in)) {
			int ch;
			
			displayMenu();
System.out.println("Enter your choice");
ch= Integer.parseInt(obj.nextLine());

switch(ch) 
{
			case 1 :getAllfiles();
				     break;
			case 2 :creatFile();
					 break;
			case 3 :deleteFile();
					 break;
			case 4 :searchFiles();
					 break;
			case 5 :System.exit(0);
					 break;
			default:System.out.println("Invalid Option");
			
			
}
		} catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
	
	}	
	public static void displayMenu()

	{
		System.out.println("*********************************************");
		System.out.println("\twelcomr to Company Lockers -LockedMe");
		System.out.println("Developer Name : Saiprasd A Mahore " );
		System.out.println("*********************************************");
		System.out.println("\t\t1. Display all the Files");
		System.out.println("\t\t2. add file to Existin direction");
		System.out.println("\t\t3. Delete a files");
		System.out.println("\t\t4. search a files");
		System.out.println("\t\t5. Exit");
		System.out.println("*************************************");
	}
	public static void getAllfiles()
	{
	File[] listOfFiles = new File(projectpath).listFiles();
	//if the folder is empty
	if(listOfFiles.length==0)
		System.out.println("No files exit in the directory");
	else
	{
		for(var l:listOfFiles)
		{
			System.out.println(l.getName());
		}
	}

	}
	public static void creatFile()
	{
		try
		{
			try (Scanner obj = new Scanner (System.in)) {
				String fileName;
				int linesCount;
				
				System.out.println("Enter file name:");
				fileName=obj.nextLine();
				
				System.out.println("Enter how many lines you want to add in file");
				linesCount=Integer.parseInt(obj.nextLine());
				
				
				FileWriter fw = new FileWriter(projectpath+"\\"+fileName);
				
				for(int i=1;i<=linesCount;i++);
				{
					System.out.println("Enter file content line:");
					fw.write(obj.nextLine()+"\n");
				}
				System.out.println("File Created Successfully");
				fw.close();
			}
		}
		catch (Exception ex)
		{
			System.out.println("Some error occured.");
			
		}
		
			
			
	}
	public static void deleteFile()
{
		try (Scanner obj = new Scanner(System.in)) {
			try
			{
				String fileName;
				System.out.println("Enter file name to be deleted:");
				fileName=obj.nextLine();
				
				File fl = new File(projectpath+"\\"+fileName);
				
				if(fl.exists())
				{
					fl.delete();
					System.out.println("File deleted successfully");
				}
				else
				{
					System.out.println("File do not exist");
				}
			}
			catch(Exception Ex)
			{
				System.out.println("Some error occured");
			}
		}
}
public static void searchFiles()
{
	try (Scanner obj = new Scanner(System.in)) {
		try
		{
			String fileName;		
			System.out.println("Enter file name to be searched:");
			fileName=obj.nextLine();
		
		File fl = new File(projectpath+"\\"+fileName);
		
		if(fl.exists())
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("File is not available ");
		}	
}
		catch(Exception Ex)
		{
			
		}
	}
	
	
}
}