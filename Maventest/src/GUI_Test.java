import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import gui_codebehind.GUI_BoardController;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Player;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import gui_main.GUI;
public class GUI_Test {
	private static String [] titles;

	public static void main(String[] args) throws IOException {
		readText();

		GUI_Field[] fields = new GUI_Field[24];

		//	Opretter alle felterne

		fields[0] = new GUI_Start();
		fields[0].setBackGroundColor(Color.RED);
		fields[0].setForeGroundColor(Color.white);
		fields[0].setTitle("START");
		fields[0].setSubText("");

		fields[1] = new GUI_Street(titles[1], "M1" , titles[1], "M1", Color.GRAY, Color.white);

		fields[2] = new GUI_Street(titles[2], "M1", titles[2], "M1", Color.GRAY, Color.WHITE);
		
		fields[3] = new GUI_Chance(titles[3], "", titles[3], Color.white, Color.BLACK);

		fields[4] = new GUI_Street(titles[4], "M1", titles[4], "M1", Color.cyan, Color.BLACK);

		fields[5] = new GUI_Street(titles[5], "M1", titles[5], "M1", Color.cyan, Color.BLACK);

		fields[6] = new GUI_Street(titles[6], "", titles[6], "", Color.WHITE, Color.BLACK);

		fields[7] = new GUI_Street(titles[7], "M2", titles[7], "M2", Color.MAGENTA, Color.BLACK);

		fields[8] = new GUI_Street(titles[8], "M2", titles[8], "M2", Color.magenta, Color.BLACK);

		fields[9] = new GUI_Chance(titles[9], "", titles[9], Color.white, Color.BLACK);

		fields[10] = new GUI_Street(titles[10], "M2", titles[10], "M2", Color.orange, Color.BLACK);

		fields[11] = new GUI_Street(titles[11], "M2", titles[11], "M2", Color.orange, Color.BLACK);

		fields[12] = new GUI_Street(titles[12], "", titles[12], "", Color.WHITE, Color.RED);

		fields[13] = new GUI_Street(titles[13], "M3", titles[13], "M3", Color.red, Color.BLACK);

		fields[14] = new GUI_Street(titles[14], "M3", titles[14], "M3", Color.red, Color.BLACK);

		fields[15] = new GUI_Chance(titles[15], "", titles[15], Color.white, Color.BLACK);

		fields[16] = new GUI_Street(titles[16], "M3", titles[16], "M3", Color.yellow, Color.BLACK);

		fields[17] = new GUI_Street(titles[17], "M3", titles[17], "M3", Color.yellow, Color.BLACK);

		fields[18] = new GUI_Street(titles[18], "", titles[18],"", Color.white, Color.black);

		fields[19] = new GUI_Street(titles[19], "M4", titles[19], "M4", Color.GREEN, Color.BLACK);

		fields[20] = new GUI_Street(titles[20], "M4", titles[20], "M4", Color.green, Color.BLACK);

		fields[21] = new GUI_Chance(titles[21], "", titles[21], Color.white, Color.BLACK);

		fields[22] = new GUI_Street(titles[22], "M5", titles[22], "M5", Color.BLUE, Color.WHITE);

		fields[23] = new GUI_Street(titles[23], "M5", titles[23], "M5", Color.BLUE, Color.WHITE);
		GUI gui = new GUI(fields);


		gui.addPlayer(new GUI_Player("JOHN", 1000));
		gui.addPlayer(new GUI_Player("BRIAN", 1000));


		System.out.println(Arrays.toString(titles));
	}


// Læser titlerne på felterne fra titles arrayet

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