package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	
	public static void main(String[] args) throws IOException {
		
		
		//Approach1: Using FileReader and  BufferedReader classes 
		
		FileReader fr=new FileReader("C:\\Users\\rnervatl\\Desktop\\ReadfromTextFile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		
		
		//Approach2 Using scanners and files
		File file=new File("C:\\Users\\rnervatl\\Desktop\\ReadfromTextFile.txt");
		Scanner sc=new Scanner(file);
		//loop statement
		while(sc.hasNext())
		{
			System.out.println("Scanner MEthod"+sc.nextLine());
		}
		
		
		/*
		 * //Approach3 sc.useDelimiter("\\z"); System.out.println();
		 */
	}

}
