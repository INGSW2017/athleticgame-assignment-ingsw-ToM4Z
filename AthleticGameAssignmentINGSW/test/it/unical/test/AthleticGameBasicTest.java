package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	@Test
	public void addArrivalTest() {
		AthleticGame athleticgame = new AthleticGame("Test");
		athleticgame.addArrival("Ciccio", Instant.now());
		Assert.assertEquals(1, athleticgame.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getPartecipantTimeTest() {
		AthleticGame athleticgame = new AthleticGame("Test");
		athleticgame.addArrival("Ciccio", Instant.now());
		athleticgame.getParecipiantTime("francesco");		
	}
}
