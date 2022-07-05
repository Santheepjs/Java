package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseNumber {
	Number n = new Number();
	@Before
	public void beforeCase() {
		System.out.println("Before");
	}
	@Test
	public void findNo() {
		n.findNo(7);
	}
	@Test
	public void findPrime() {
		n.findPrime(7);
	}
	@After
	public void afterCase() {
		System.out.println("End");
	}

}
