package bfFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\lsote\\eclipse-workspace\\bfFile\\in.txt";
		
		BufferedReader bf = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			bf = new BufferedReader(fr);
			
			String line = bf.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(bf != null) {
					bf.close();
				}
				
				if(fr != null) {
					fr.close();
				}	
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
