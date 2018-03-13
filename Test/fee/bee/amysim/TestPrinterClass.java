package fee.bee.amysim;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrinterClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testPrintRecordsLogListString() throws ParseException {
		
		Set<String> expectedOutput;
		expectedOutput = new HashSet<String>();
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345"); //phone1
		record.setDuration("00:00:35");
		record.setCount(1);
		testLogList.addElement(record);
		expectedOutput.add("12345"+","+"1"+","+"00:00:35");
		PrinterClass testPrinterClass= new PrinterClass();
		assertEquals(expectedOutput,testPrinterClass.PrintRecords(testLogList,""));
		
	}

}
