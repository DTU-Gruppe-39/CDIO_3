package test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import boundary.GUI_Test;

public class Whosturn_RandomizerTest {
int whosTurn = 0;
int times;
int spiller1 = 0;
int spiller2 = 0;
int spiller3 = 0;
int spiller4 = 0;
int numberofplayers = 4;
int theory = 2500000;
int diff;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		times=10000000;
		for(int i = 0; i < times; i++) {
			whosTurn = (int) Math.ceil(Math.random() * numberofplayers);
			if (whosTurn==1) {
				spiller1++;
			}
			if (whosTurn==2) {
				spiller2++;
			}
			if (whosTurn==3) {
				spiller3++;
			}
			if (whosTurn==4) {
				spiller4++;
			}
		}
		
		for(int i = 1; i <= 4; i++) {
			if(i==1) {
				diff=spiller1-theory;
				boolean expected = true;
				boolean actual=Math.abs(diff)<25000;
				assertEquals(expected,actual);				
			}
			if(i==2) {
				diff=spiller2-theory;
				boolean expected = true;
				boolean actual=Math.abs(diff)<25000;
				assertEquals(expected,actual);				
			}
			if(i==3) {
				diff=spiller3-theory;
				boolean expected = true;
				boolean actual=Math.abs(diff)<25000;
				assertEquals(expected,actual);				
			}
			if(i==4) {
				diff=spiller4-theory;
				boolean expected = true;
				boolean actual=Math.abs(diff)<25000;
				assertEquals(expected,actual);				
			}
		}
		System.out.println(""+spiller1);
		System.out.println(""+spiller2);
		System.out.println(""+spiller3);
		System.out.println(""+spiller4);
	}

}
