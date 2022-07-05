package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Second {
	@Test
	public void testCase() {
		System.out.println("This is test case");
	}
	@Before
	public void beforeCase() {
		System.out.println("Welcome to junit");
	}
	@After
	public void afterCase() {
		System.out.println("Thank you");
	}
	
}
