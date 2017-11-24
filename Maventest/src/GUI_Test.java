import java.awt.Color;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;
public class GUI_Test {

public static void main(String[] args) {
	
	GUI_Field[] fields = new GUI_Field[25];
	
//	Opretter alle felterne
	
		fields[0] = new GUI_Start();
		fields[0].setBackGroundColor(Color.RED);
		fields[0].setForeGroundColor(Color.white);
		fields[0].setTitle("START");
		
		fields[1] = new GUI_Street("lul", "", "lul", "50M", Color.yellow, Color.BLACK);


				
		fields[2] = new GUI_Street();
		fields[2].setBackGroundColor(Color.white);
		fields[2].setForeGroundColor(Color.black);
		fields[2].setTitle("LÆS FRA ARRAY");
		
		fields[3] = new GUI_Street();
		fields[3].setBackGroundColor(Color.CYAN);
		fields[3].setForeGroundColor(Color.YELLOW);		
		fields[3].setTitle("LÆS FRA ARRAY");
				
		fields[4] = new GUI_Street();
		fields[4].setBackGroundColor(Color.white);
		fields[4].setForeGroundColor(Color.black);
		fields[4].setTitle("LÆS FRA ARRAY");
		
		fields[5] = new GUI_Street();
		fields[5].setBackGroundColor(Color.CYAN);
		fields[5].setForeGroundColor(Color.YELLOW);		
		fields[5].setTitle("LÆS FRA ARRAY");
				
		fields[6] = new GUI_Street();
		fields[6].setBackGroundColor(Color.white);
		fields[6].setForeGroundColor(Color.black);
		fields[6].setTitle("LÆS FRA ARRAY");
		
		fields[7] = new GUI_Street();
		fields[7].setBackGroundColor(Color.CYAN);
		fields[7].setForeGroundColor(Color.YELLOW);		
		fields[7].setTitle("LÆS FRA ARRAY");
				
		fields[8] = new GUI_Street();
		fields[8].setBackGroundColor(Color.white);
		fields[8].setForeGroundColor(Color.black);
		fields[8].setTitle("LÆS FRA ARRAY");
		
		fields[9] = new GUI_Street();
		fields[9].setBackGroundColor(Color.CYAN);
		fields[9].setForeGroundColor(Color.YELLOW);		
		fields[9].setTitle("LÆS FRA ARRAY");	
				
		fields[10] = new GUI_Street();
		fields[10].setBackGroundColor(Color.white);
		fields[10].setForeGroundColor(Color.black);
		fields[10].setTitle("LÆS FRA ARRAY");
	
		fields[11] = new GUI_Street();
		fields[11].setBackGroundColor(Color.CYAN);
		fields[11].setForeGroundColor(Color.YELLOW);		
		fields[11].setTitle("LÆS FRA ARRAY");
				
		fields[12] = new GUI_Street();
		fields[12].setBackGroundColor(Color.white);
		fields[12].setForeGroundColor(Color.black);
		fields[12].setTitle("LÆS FRA ARRAY");
		
		fields[13] = new GUI_Street();
		fields[13].setBackGroundColor(Color.CYAN);
		fields[13].setForeGroundColor(Color.YELLOW);		
		fields[13].setTitle("LÆS FRA ARRAY");
				
		fields[14] = new GUI_Street();
		fields[14].setBackGroundColor(Color.white);
		fields[14].setForeGroundColor(Color.black);
		fields[14].setTitle("LÆS FRA ARRAY");
		
		fields[15] = new GUI_Street();
		fields[15].setBackGroundColor(Color.CYAN);
		fields[15].setForeGroundColor(Color.YELLOW);		
		fields[15].setTitle("LÆS FRA ARRAY");
				
		fields[16] = new GUI_Street();
		fields[16].setBackGroundColor(Color.white);
		fields[16].setForeGroundColor(Color.black);
		fields[16].setTitle("LÆS FRA ARRAY");
		
		fields[17] = new GUI_Street();
		fields[17].setBackGroundColor(Color.CYAN);
		fields[17].setForeGroundColor(Color.YELLOW);		
		fields[17].setTitle("LÆS FRA ARRAY");
			
		fields[18] = new GUI_Street();
		fields[18].setBackGroundColor(Color.CYAN);
		fields[18].setForeGroundColor(Color.YELLOW);		
		fields[18].setTitle("LÆS FRA ARRAY");
	
		fields[19] = new GUI_Street();
		fields[19].setBackGroundColor(Color.CYAN);
		fields[19].setForeGroundColor(Color.YELLOW);		
		fields[19].setTitle("LÆS FRA ARRAY");
		
		fields[20] = new GUI_Street();
		fields[20].setBackGroundColor(Color.white);
		fields[20].setForeGroundColor(Color.black);
		fields[20].setTitle("LÆS FRA ARRAY");	
		
		fields[21] = new GUI_Street();
		fields[21].setBackGroundColor(Color.white);
		fields[21].setForeGroundColor(Color.black);
		fields[21].setTitle("LÆS FRA ARRAY");	
		
		fields[22] = new GUI_Street();
		fields[22].setBackGroundColor(Color.white);
		fields[22].setForeGroundColor(Color.black);
		fields[22].setTitle("LÆS FRA ARRAY");
		
		fields[23] = new GUI_Street();
		fields[23].setBackGroundColor(Color.white);
		fields[23].setForeGroundColor(Color.black);
		fields[23].setTitle("LÆS FRA ARRAY");	
		
		fields[24] = new GUI_Street();
		fields[24].setBackGroundColor(Color.white);
		fields[24].setForeGroundColor(Color.black);
		fields[24].setTitle("LÆS FRA ARRAY");
		


	GUI gui = new GUI(fields);
	
	
	gui.addPlayer(new GUI_Player("JOHN", 1000));
	gui.addPlayer(new GUI_Player("BRIAN", 1000));
	}
}
