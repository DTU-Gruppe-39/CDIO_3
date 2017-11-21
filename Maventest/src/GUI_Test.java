import gui_main.GUI;

import java.awt.Color;
import gui_fields.GUI_Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Street;
public class GUI_Test {

public static void main(String[] args) {
	
	GUI_Field[] fields = new GUI_Field[10];
	
		fields[0] = new GUI_Street();
		fields[0].setBackGroundColor(Color.blue);
		fields[0].setTitle("START");
		
		fields[1] = new GUI_Street();
		fields[1].setBackGroundColor(Color.CYAN);
		fields[1].setTitle("START");
		
		fields[2] = new GUI_Street();
		fields[2].setBackGroundColor(Color.GREEN);
		fields[2].setTitle("START");
		
		fields[3] = new GUI_Street();
		fields[3].setBackGroundColor(Color.black);
		fields[3].setTitle("START");
		
		fields[4] = new GUI_Street();
		fields[4].setBackGroundColor(Color.black);
		fields[4].setTitle("START");
		
		fields[5] = new GUI_Street();
		fields[5].setBackGroundColor(Color.black);
		fields[5].setTitle("START");
		
		fields[6] = new GUI_Street();
		fields[6].setBackGroundColor(Color.black);
		fields[6].setTitle("START");
		
		fields[7] = new GUI_Street();
		fields[7].setBackGroundColor(Color.black);
		fields[7].setTitle("START");
		
		fields[8] = new GUI_Street();
		fields[8].setBackGroundColor(Color.black);
		fields[8].setTitle("START");
		
		fields[9] = new GUI_Street();
		fields[9].setBackGroundColor(Color.black);
		fields[9].setTitle("START");
		
		
	GUI gui = new GUI(fields);
	
	
	gui.addPlayer(new GUI_Player("JOHN", 1000));
	gui.addPlayer(new GUI_Player("CENA", 1000));
	}
}
