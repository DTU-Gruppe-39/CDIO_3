package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.ListOfPlayers;
import spillogik.Spil;

public class JunitCoverageTestGame {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
				Spil.fillFields();
				ListOfPlayers list = new ListOfPlayers((Spil.getNumberofplayers() + 1));
				list.addplayer(Spil.getNumberofplayers());
				Spil.gameLogic();				
				
				boolean expected = true;
				boolean actual =((ListOfPlayers.getPlayers(1).isDead() == true || ListOfPlayers.getPlayers(2).isDead() == true || ListOfPlayers.getPlayers(3).isDead() == true || ListOfPlayers.getPlayers(4).isDead() == true) && (ListOfPlayers.getPlayers(1).isWinner() == true || ListOfPlayers.getPlayers(2).isWinner() == true || ListOfPlayers.getPlayers(3).isWinner() == true || ListOfPlayers.getPlayers(4).isWinner() == true ));
				
				assertEquals(actual,expected);
	}

}
