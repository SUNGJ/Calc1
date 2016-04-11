package simcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
	}
	@Test
	public void testMulti() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.multi(10, 20);
		assertEquals(200, calc.getResult());
	}


}
