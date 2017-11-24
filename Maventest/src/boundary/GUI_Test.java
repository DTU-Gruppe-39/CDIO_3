package boundary;
import gui_main.GUI;

import java.awt.Color;

import javax.swing.border.Border;

import gui_fields.GUI_Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Street;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Start;
public class GUI_Test {

public static void main(String[] args) {
	
	GUI_Field[] fields = new GUI_Field[25];
	
		fields[0] = new GUI_Start();
		fields[0].setBackGroundColor(Color.RED);
		fields[0].setForeGroundColor(Color.white);
		fields[0].setTitle("START");
		fields[0].setDescription("LÆS FRA ARRAY");
	
		fields[1] = new GUI_Shipping();

		
		fields[2] = new GUI_Shipping();
		fields[2].setBackGroundColor(Color.white);
		fields[2].setTitle("LÆS FRA ARRAY");
		fields[2].setDescription("LÆS FRA ARRAY");
		
		fields[3] = new GUI_Street();
		fields[3].setBackGroundColor(Color.white);
		fields[3].setTitle("START");
		
		fields[4] = new GUI_Street();
		fields[4].setBackGroundColor(Color.white);
		fields[4].setTitle("START");
		
		fields[5] = new GUI_Street();
		fields[5].setBackGroundColor(Color.white);
		fields[5].setTitle("START");
		
		fields[6] = new GUI_Street();
		fields[6].setBackGroundColor(Color.white);
		fields[6].setTitle("START");
		
		fields[7] = new GUI_Street();
		fields[7].setBackGroundColor(Color.white);
		fields[7].setTitle("START");
		
		fields[8] = new GUI_Street();
		fields[8].setBackGroundColor(Color.white);
		fields[8].setTitle("START");
		
		fields[9] = new GUI_Street();
		fields[9].setBackGroundColor(Color.white);
		fields[9].setTitle("START");
		
		fields[10] = new GUI_Street();
		fields[10].setBackGroundColor(Color.white);
		fields[10].setTitle("START");
		
		fields[11] = new GUI_Street();
		fields[11].setBackGroundColor(Color.white);
		fields[11].setTitle("START");
		
		fields[12] = new GUI_Street();
		fields[12].setBackGroundColor(Color.white);
		fields[12].setTitle("START");
		
		fields[13] = new GUI_Street();
		fields[13].setBackGroundColor(Color.white);
		fields[13].setTitle("START");
		
		fields[14] = new GUI_Street();
		fields[14].setBackGroundColor(Color.white);
		fields[14].setTitle("START");
		
		fields[15] = new GUI_Street();
		fields[15].setBackGroundColor(Color.white);
		fields[15].setTitle("START");
		
		fields[16] = new GUI_Street();
		fields[16].setBackGroundColor(Color.white);
		fields[16].setTitle("START");
		
		fields[17] = new GUI_Street();
		fields[17].setBackGroundColor(Color.white);
		fields[17].setTitle("START");
		
		fields[18] = new GUI_Street();
		fields[18].setBackGroundColor(Color.white);
		fields[18].setTitle("START");
		
		fields[19] = new GUI_Street();
		fields[19].setBackGroundColor(Color.white);
		fields[19].setTitle("START");
		
		fields[20] = new GUI_Street();
		fields[20].setBackGroundColor(Color.white);
		fields[20].setTitle("START");
		
		fields[21] = new GUI_Street();
		fields[21].setBackGroundColor(Color.white);
		fields[21].setTitle("START");
		
		fields[22] = new GUI_Street();
		fields[22].setBackGroundColor(Color.white);
		fields[22].setTitle("START");
		
		fields[23] = new GUI_Street();
		fields[23].setBackGroundColor(Color.white);
		fields[23].setTitle("START");
		
		fields[24] = new GUI_Street();
		fields[24].setBackGroundColor(Color.white);
		fields[24].setTitle("START");
		
	
		
		
	GUI gui = new GUI(fields);
	
	
	gui.addPlayer(new GUI_Player("JOHN", 1000));
	gui.addPlayer(new GUI_Player("CENA", 1000));
	}
}
