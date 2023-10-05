package phase1.project.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;
import phase1.project.exception.ProperOptionValue;

public class MainMenu {
	
	static File rootPath=new File("/home/daniellavalle1v/Desktop/Phase1_end_project/workspace/");
	File ff= new File("/home/daniellavalle1v/Desktop/Phase1_end_project/workspace/");

	public static void menuOptions() throws Exception{
		Scanner sc = new Scanner (System.in);
		String con ;
		
		do {
			System.out.println("1:Display all files in ascending order");
			System.out.println("2:Create a file");
			System.out.println("3:Delete a file");
			System.out.println("4:Exit");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:String listOfFiles[] = rootPath.list();
				Arrays.sort(listOfFiles);
				for (String name:listOfFiles) {
					System.out.println(name);
				}
				break;
				
			case 2:				
				System.out.println("Please enter the name file to be created");			
				String nameFilecreated = sc.next();
			    String newPathc = rootPath.getPath()+"/"+nameFilecreated;
				rootPath = new File(newPathc);
				if (rootPath.exists()) {
					System.out.println("File already present");
				} else {
					rootPath.createNewFile();
					System.out.println("File created"+nameFilecreated);
				}
					
				//FileOutputStream fos =new FileOutputStream(newPath);
				//fos.write('A');
				break;
			case 3:				
				System.out.println("Please enter the name file to delete");
				String nameFiledelete = sc.next();
				String newPathd = rootPath.getPath()+"/"+nameFiledelete;
				rootPath = new File(newPathd);
				if (rootPath.exists()) {
					rootPath.delete();
					System.out.println("File deleted");
				} else {
					System.out.println("File not present"+nameFiledelete);
				}
					
				//FileOutputStream fos =new FileOutputStream(newPath);
				//fos.write('A');
				break;
			case 4:System.exit(0);
		}

				
			System.out.println("do you want to continue?(y/n)");
			con = sc.next();
			try {
			if(!con.equals("n") || !con.equals("y") ) {
				throw new ProperOptionValue("Please enter n or y");
			}
			
			} catch (Exception e) {
					System.out.print(e);
				}
		}
		while (con.equalsIgnoreCase("y"));
	}
}


