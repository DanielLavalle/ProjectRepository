package phase1.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SubMenu {
		
	public static void submenuOptions (String[] args) throws Exception{
		File ff= new File("/home/daniellavalle1v/Desktop/Phase1_end_project/workspace/");
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the file name you want to create");
		String filename = sc.next() ;
		
		String newPath = ff.getPath()+"\\"+filename;
		ff = new File(newPath);
		ff.createNewFile();
		if(ff.exists()) {
			System.out.println("File already exists");
		} else {
			ff.createNewFile();
			System.out.println("new file created with name as"+filename);
		}
		if(ff.exists()) {
			ff.delete();
			System.out.println(filename+"deleted successfully");
		} else {
			System.out.println("file not present with name as"+filename);
		}
		

	}
	}
