package junit1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseCheck {
	Check c = new Check();
	@Before
	public void beforeCase() {
		System.out.println("Before");
	}
	@Test
	public void testCase() {
		String name5 = "ASHOK";
		String length= c.toCheck("ram","raja","ashok");
		assertEquals(length,name5);
		assertNotNull(length);
		System.out.println("Equal");
	}
	@After
	public void afterCase() {
		System.out.println("End");
	}

}
