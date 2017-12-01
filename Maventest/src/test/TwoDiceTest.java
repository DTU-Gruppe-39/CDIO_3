package Test;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.TwoDice;

public class TwoDiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] c= {0,0,0,0,0,0};
		int numbrolls= 60000000;
		TwoDice dice = new TwoDice();

		for(int i=0; i <= numbrolls; i++) {
			TwoDice.roll();
			int værdi =dice.getdie1();
			switch(værdi) {
			case 1: c[0]++;
			break;
			case 2: c[1]++;
			break;
			case 3: c[2]++;
			break;
			case 4: c[3]++;
			break;
			case 5: c[4]++;
			break;
			case 6: c[5]++;
			}
		}

		int[] d= {0,0,0,0,0,0};
		d[0] = numbrolls*1/6;
		d[1] = numbrolls*1/6;
		d[2] = numbrolls*1/6;
		d[3] = numbrolls*1/6;
		d[4] = numbrolls*1/6;
		d[5] = numbrolls*1/6;

		for(int i= 0; i < d.length;i++) {
			int diff = c[i] - d[i];
			boolean expected = true;
			boolean actual = (Math.abs(diff) < 100000);
			assertEquals(expected, actual);
			System.out.println(c[i]);
		}
	}

}
