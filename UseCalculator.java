package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseCalculator {
	
	Calculator c = new Calculator();
	@Before
	public void beforeCase() {
		c.beforeCase();
	}
	@Test
	public void add() {
		c.add();
	}
	@Test
	public void sub() {
		c.sub();
	}
	@Test
	public void mul() {
		c.mul();
	}
	@Test
	public void div() {
		c.div();
	}
	@After
	 public void afterCase() {
		c.afterCase();
	}
	

}
