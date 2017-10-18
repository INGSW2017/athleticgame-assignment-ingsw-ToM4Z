package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	private static AthleticGame athleticgame;

	@BeforeClass
	public static void beforeAll() {
		athleticgame = new AthleticGame("Test");
	}

	@After
	public void afterEachTest() {
		athleticgame.reset();
	}
	
	@Before
	public void beforeEachTest() {
		athleticgame.start();
	}
	
	@Test
	public void WinnerTest() {
		athleticgame.addArrival("Ciccio", Instant.now());
		
		athleticgame.addArrival("Salvatore", Instant.now().plusMillis(100));
		
		athleticgame.addArrival("Marco", Instant.now().plusMillis(100));
		
		Assert.assertEquals("Ciccio", athleticgame.getWinner());
	}
	
	@Test
	public void WinnerNullTest() {
		Assert.assertEquals(null, athleticgame.getWinner());
	}
}
