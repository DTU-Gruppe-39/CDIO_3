package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TekstArray {

	public static void printText (int field) throws IOException {
		String str = "";
		String file = "src/textFile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String [] titles;  
		for (int i = 0; i < field; i++) {
			String currentLine = reader.readLine();
			str = currentLine;
		}
		reader.close();
		GUI.showMessage(str);
	}
	
	
	
	
	
	
}
