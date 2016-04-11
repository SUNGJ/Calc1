package simcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testadd() {
		Simplecalculator calc = new Simplecalculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}

}
