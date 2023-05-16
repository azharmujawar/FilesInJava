package File;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {

	public static void main(String[] args) {
	
		try {

			File myobj = new File("D:\\Files\\Azar.txt");
			 if(myobj.createNewFile()) {
			System.out.println("File created: "+myobj.getName());
			System.out.println("Absolut path : "+myobj.getAbsolutePath());

			}else {
			System.out.println("File alraedy exists.");

			 }
			} catch (Exception e) {
			{
			System.out.println("An error occured.");
			e.printStackTrace();
			 }

			}
				
		
	}
}