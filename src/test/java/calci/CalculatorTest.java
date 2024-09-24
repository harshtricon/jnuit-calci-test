package calci;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {


	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(4, calculator.sum(2, 2));
		Assert.assertEquals(0, calculator.sum(0, 0));
		Assert.assertEquals(-2, calculator.sum(-1, -1));
		Assert.assertEquals(100000000, calculator.sum(50000000, 50000000));
	}


	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.minus(2, 2));
		Assert.assertEquals(2, calculator.minus(2, 0));
		Assert.assertEquals(-2, calculator.minus(0, 2));
		Assert.assertEquals(1, calculator.minus(-1, -2));
	}


	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.divide(6, 3));
		Assert.assertEquals(1, calculator.divide(3, 3));
		Assert.assertEquals(0, calculator.divide(0, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.divide(6, 0);
	}


	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(6, calculator.multiply(2, 3));
		Assert.assertEquals(0, calculator.multiply(0, 100));
		Assert.assertEquals(-10, calculator.multiply(2, -5));
		Assert.assertEquals(100000000, calculator.multiply(10000, 10000));
	}
}
