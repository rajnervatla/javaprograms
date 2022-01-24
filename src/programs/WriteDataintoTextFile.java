package programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("C:\\Users\\rnervatl\\Desktop\\ReadfromTextFile.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Selenium Program with java");
		bw.write("Selenium Program with Python");
		bw.write("Selenium Program with C#");
		bw.write("Rajkumar Practice....");
		System.out.println("Finished....!");
		bw.close();
	}

}
