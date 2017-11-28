package spillogik;

import java.util.Arrays;

public class Spil {
	final static int MIN_POINTS = 0;

	static int FieldNumb = 24;
	static int 	Attribute = 5;
	static int Fields[][] = new int [FieldNumb][Attribute];  //simple array to determine what field the player is on.
	
	public static int[][] getFields() {
		return Fields;
	}

	public static void setFields(int[][] fields) {
		Fields = fields;
	}

	public static void fillFields() {
		int field[][];
		field = new int [24][5];
		for (int i = 0; i < 24; i++) {
			field[i][0] = i; 
//			for (int j = 0; j < 5; j++) {
//				Fields[i][j] = 0;
//			}
			switch (i) {
			case 0:
				break;
			case 1:
			case 2:
				field[i][1] = 1;
				field[i][2] = 1;
				break;
			case 3:
				break;
			case 4:
			case 5:
				field[i][1] = 1;
				field[i][2] = 2;
				break;
			case 6:
				break;
			case 7:
			case 8:
				field[i][1] = 2;
				field[i][2] = 3;
				break;
			case 9:
				break;
			case 10:
			case 11:
				field[i][1] = 2;
				field[i][2] = 4;
				break;
			case 12:
				break;
			case 13:
			case 14:
				field[i][1] = 3;
				field[i][2] = 5;
				break;
			case 15:
				break;
			case 16:
			case 17:
				field[i][1] = 3;
				field[i][2] = 6;
				break;
			case 18:
				break;
			case 19:
			case 20:
				field[i][1] = 4;
				field[i][2] = 7;
				break;
			case 21:
				break;
			case 22:
			case 23:
				field[i][1] = 5;
				field[i][2] = 8;
				break;
			default:
				break;
			}
		}
		setFields(field);
//		System.out.println(Arrays.deepToString(Fields));
	}

}
