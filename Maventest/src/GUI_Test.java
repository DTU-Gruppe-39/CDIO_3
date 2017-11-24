import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import boundary.GUI_Test;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;
public class GUI_Test {

	public static void main(String[] args) throws IOException {

		GUI_Field[] fields = new GUI_Field[24];

		//	Opretter alle felterne

		fields[0] = new GUI_Start();
		fields[0].setBackGroundColor(Color.RED);
		fields[0].setForeGroundColor(Color.white);
		fields[0].setTitle("START");
		fields[0].setSubText("");

		fields[1] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[2] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[3] = new GUI_Street("", "", "lul", "50M", Color.WHITE, Color.BLACK);

		fields[4] = new GUI_Street("lul", "", "lul", "50M", Color.cyan, Color.BLACK);

		fields[5] = new GUI_Street("lul", "", "lul", "50M", Color.cyan, Color.BLACK);

		fields[6] = new GUI_Street("lul", "", "lul", "50M", Color.WHITE, Color.BLACK);

		fields[7] = new GUI_Street("lul", "", "lul", "50M", Color.MAGENTA, Color.BLACK);

		fields[8] = new GUI_Street("lul", "", "lul", "50M", Color.magenta, Color.BLACK);

		fields[9] = new GUI_Street("lul", "", "lul", "50M", Color.white, Color.BLACK);

		fields[10] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[11] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[12] = new GUI_Street("lul", "", "lul", "50M", Color.WHITE, Color.BLACK);

		fields[13] = new GUI_Street("lul", "", "lul", "50M", Color.red, Color.BLACK);

		fields[14] = new GUI_Street("lul", "", "lul", "50M", Color.red, Color.BLACK);

		fields[15] = new GUI_Street("lul", "", "lul", "50M", Color.WHITE, Color.BLACK);

		fields[16] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[17] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);

		fields[18] = new GUI_Street("lul", "", "lul", "50M", Color.white, Color.BLACK);

		fields[19] = new GUI_Street("lul", "", "lul", "50M", Color.GREEN, Color.BLACK);

		fields[20] = new GUI_Street("lul", "", "lul", "50M", Color.green, Color.BLACK);

		fields[21] = new GUI_Street("lul", "", "lul", "50M", Color.WHITE, Color.BLACK);

		fields[22] = new GUI_Street("lul", "", "lul", "50M", Color.BLUE, Color.BLACK);

		fields[23] = new GUI_Street("lul", "", "lul", "50M", Color.BLUE, Color.BLACK);
		GUI gui = new GUI(fields);


		gui.addPlayer(new GUI_Player("JOHN", 1000));
		gui.addPlayer(new GUI_Player("BRIAN", 1000));


		readText();
		System.out.println(Arrays.toString(titles));
	}



	private static String [] titles;

	public static String [] getTitles() {
		return titles;
	}

	public static void setTitles(String [] titles) {
		GUI_Test.titles = titles;
	}

	public static void readText() throws IOException {
		String file = "../textFile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String [] title;
		title = new String[24];

		for (int i = 0; i < 24; i++) {
			String currentLine = reader.readLine();
			title[i] = currentLine;
		}
		reader.close();
		setTitles(title);
	}
}
