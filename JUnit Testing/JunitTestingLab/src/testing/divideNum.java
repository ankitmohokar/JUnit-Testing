package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideNum {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(20,4);
		assertEquals(5.00, output, 0.0);
	}

}
