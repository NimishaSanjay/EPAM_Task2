package EPAM2_Task2.epam2;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTesting {

	@Test
	public void simpleInterestTest() {
		SimpleInterest si=new SimpleInterest();
		assertEquals(6, si.simpleInterest(100, 2, 3), 0.0);
		assertEquals(3, si.simpleInterest(100, 3, 1), 0.0);
		assertEquals(1, si.simpleInterest(100 , 1 ,1), 0.0);
	}

}
