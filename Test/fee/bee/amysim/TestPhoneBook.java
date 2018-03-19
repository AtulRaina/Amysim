package fee.bee.amysim;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPhoneBook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test // add comments
	public final void testPhoneBook() {
		fail("Not yet implemented");
	}
	@Test
	public final void testContactName()
	{
		PhoneBook test= new PhoneBook();
	   assertEquals("Kewal Chacha",test.getContactName("FN:Kewal Chacha"));
	}
	
	@Test
	public final void testContactNameNoMatch()
	{
		PhoneBook test= new PhoneBook();
	   assertEquals(null,test.getContactName("END:VCARD"));
	}
	
	
	@Test
	public final void testGetContactNumber()
	{
		PhoneBook test= new PhoneBook();
		assertEquals("919419119524",test.getContactNumber("TEL;CELL:+919419119524"));
	}
    
	@Test
	public final void testGetContactNumber2()
	{
		PhoneBook test= new PhoneBook();
		assertEquals("919625659406",test.getContactNumber("TEL;CELL;PREF:+919625659406"));
	}
	
	@Test
	public final void testStartFlag()
	{
		PhoneBook test= new PhoneBook();
		test.ParseLine("BEGIN:VCARD");
		assertEquals(true,test.startFlag);
	}
	@Test
	public final void testEndFlag()
	{
		PhoneBook test= new PhoneBook();
		test.ParseLine("END:VCARD");
		assertEquals(true,test.endFlag);
		assertEquals(false,test.startFlag);
	}
	
	
	@Test
	public final void testFlagDefaultStartValues()
	{
		PhoneBook test= new PhoneBook();
		assertEquals(false,test.endFlag);
		assertEquals(false,test.startFlag);
	}
}
