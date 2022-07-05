package junit1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Assert1 {
		String name1 = "abc";
		String name2 = "abc";
		String name3 = null;
		String name4 = "Sandy";
		String name5 = "Sandy";
		int no1 = 2;
		int no2 = 2;
		int no3 = 4;
		String[] expected = {"One","Two","Three"};
		String[] output = {"One","Two","Three"};
		@Before
		public void beforeCase() {
			System.out.println("Before");
		}
		@Test
		public void isEqual() {
			assertEquals(name1, name2);
			System.out.println("It is equal");
		}
		@Test 
		public void isNotEquals() {
			assertNotEquals(name1,name4);
			System.out.println("Not equal");
	}
		@Test
		public void isNull() {
			assertNull(name3);
			System.out.println("It is null");
		}
		@Test
		public void isNotNull() {
			assertNotNull(name4);
			System.out.println("Not null");
		}
		@Test
		public void areSame() {
			assertSame(name4,name5);
			System.out.println("Same");
		}
		@Test
		public void findNotSame() {
			assertNotSame(name4,name2);
			System.out.println("Not same");
		}
		@Test
		public void asTrue() {
			assertTrue(no1==no2);
				System.out.println("It is true");
			
		}
		@Test
		public void asFalse() {
			assertFalse(no2>no1);
				System.out.println("False");
		}
		@Test
		public void isArrayEquals() {
			assertArrayEquals(expected,output);
			System.out.println("Array is equal");
		}
		@After
		public void afterCase() {
			System.out.println("Finished");
		}

}
