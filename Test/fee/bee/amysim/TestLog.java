package fee.bee.amysim;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestLog {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testSetParamtersDuration() {
		LineParse testLog= new LineParse();
		String inputFromFile="Talk,23:21,0011919654910491,00:17:37,N/A,$0.00";
		testLog.SetParamters(inputFromFile);
		assertEquals("00:17:37", testLog.getDuration());
		
	}
	@Test
	public final void testSetParamtersPhoneNumber() {
		LineParse testLog= new LineParse();
		String inputFromFile="Talk,23:21,0011919654910491,00:17:37,N/A,$0.00";
		testLog.SetParamters(inputFromFile);
		assertEquals("0011919654910491", testLog.getPhoneNumber());
		
	}
	
	@Test
	public final void testSetParamtersCount() {
		LineParse testLog= new LineParse();
		String inputFromFile="Talk,23:21,0011919654910491,00:17:37,N/A,$0.00";
		testLog.SetParamters(inputFromFile);
		assertEquals(1, testLog.getCount());
		
	}
	@Test
	public final void testSetParamtersNoExpectedCount() {
		LineParse testLog= new LineParse();
		String inputFromFile="Talk23:21001191965491049100:17:37N/A$0.00";
		testLog.SetParamters(inputFromFile);
		assertEquals(0, testLog.getCount());
		
	}
	
	@Test
	public final void testSetParamtersNoExpectedPhoneNumber() {
		LineParse testLog= new LineParse();
		String inputFromFile="Talk23:2100118888491049100:17:37N/A$0.00";
		testLog.SetParamters(inputFromFile);
		assertEquals(null, testLog.getPhoneNumber());
		
	}
}
