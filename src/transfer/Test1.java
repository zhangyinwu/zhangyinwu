package transfer;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.INTF_REPOS;

/**
 * 
 */

/**
 * @author John
 *
 */
public class Test1 {

	/**
	 * @throws java.lang.Exception
	 */
	@Before

	@Test
	public void test() {
		IntToHex ith = new IntToHex();
		assertEquals("0", ith.int2Hex(0));
		assertEquals("9", ith.int2Hex(9));
		assertEquals("-9", ith.int2Hex(-9));
		assertEquals("F", ith.int2Hex(15));
		assertEquals("-F", ith.int2Hex(-15));
		assertEquals("10", ith.int2Hex(16));
		assertEquals("-10", ith.int2Hex(-16));
		assertEquals("CD", ith.int2Hex(205));
		assertEquals("-CD", ith.int2Hex(-205));
		assertEquals("7FFFFFFF", ith.int2Hex(Integer.MAX_VALUE));
		assertEquals("-80000000", ith.int2Hex(Integer.MIN_VALUE));
	}

}
