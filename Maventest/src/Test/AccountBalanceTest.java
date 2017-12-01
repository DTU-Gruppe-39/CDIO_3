package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import entity.AccountBalance;

public class AccountBalanceTest {
	AccountBalance ac;
	@Before
	public void setUp() throws Exception {
		ac=new AccountBalance(20);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		ac.newBalance(-30);
		int Expected = 0;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}

	@Test
	public void test2() {
		ac.newBalance(-2);
		int Expected = 18;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test4() {
		ac.newBalance(5);
		int Expected = 25;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test5() {
		ac.newBalance(-0);
		int Expected = 20;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test6() {
		ac.newBalance(Integer.MIN_VALUE);
		int Expected = 0;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test7() {
		ac.setBalance(0);
		ac.newBalance(Integer.MAX_VALUE);
		int Expected = Integer.MAX_VALUE;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}	
}
