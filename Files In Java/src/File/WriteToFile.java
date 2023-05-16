package File;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		
		
		try {
			
			FileWriter myWriter=new FileWriter("D:\\Files\\wtfile.txt");
			myWriter.write("Hello this is java class");
			myWriter.close();
			
		} catch (Exception e) {
			System.out.println("Some thing went Wrong");
			e.printStackTrace();
			
		}

	}

}
