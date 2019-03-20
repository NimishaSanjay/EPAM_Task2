package EPAM2_Task2.epam2;

import static org.junit.Assert.*;
import org.junit.Test;

public class CostEstimatorTesting {

	@Test
	public void test() {
		CostEstimator ce = new CostEstimator();
		assertEquals(4800, ce.calculate_Cost(4, "standard"), 0.0);
		assertEquals(4500, ce.calculate_Cost(3, "abovestandard"), 0.0);
		assertEquals(5400, ce.calculate_Cost(3, "highstandard"), 0.0);
	}

}