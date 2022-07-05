package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class First {
	@Before
	public void beforeCase() {
		System.out.println("Welcome to junit");
	}
	@Test
	public void testCase() {
		System.out.println("This is test case");
	}
	@After
	public void afterCase() {
		System.out.println("Thank you");
	}
}
