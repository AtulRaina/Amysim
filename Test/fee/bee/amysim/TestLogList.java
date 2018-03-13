package fee.bee.amysim;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogList {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testAddElement() throws ParseException {
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345");
		record.setDuration("00:00:35");
		record.setCount(1);
		testLogList.addElement(record);
		assertEquals("Element is added",1,testLogList.al.size());
	}

	@Test
	public final void testAddTime() throws ParseException {
		LogList testLogList= new LogList();
		assertEquals("Time is computed","00:01:10",testLogList.AddTime("00:00:35", "00:00:35"));
	}
 
	
	
	@Test
	public final void testAddElementSame() throws ParseException {
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345");
		record.setDuration("00:00:35");
		testLogList.addElement(record);
		testLogList.addElement(record);
		assertEquals("Element is added",1,testLogList.al.size());
		
	}
	
	
	
	@Test
	public final void testAddElementDiffrent() throws ParseException {
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345"); //phone1
		record.setDuration("00:00:35");
		testLogList.addElement(record);
		LineParse record1= new LineParse();
		record1.setPhoneNumber("32"); //phone2
		record1.setDuration("00:00:35");
		testLogList.addElement(record1);
		assertEquals("Element is added",2,testLogList.al.size());
		
	}
	
	@Test
	public final void testSearchPhoneNumber() throws ParseException {
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345"); //phone1
		record.setDuration("00:00:35");
		record.setCount(1);
		testLogList.addElement(record);
		LineParse record1= new LineParse();
		record1.setPhoneNumber("32"); //phone2
		record1.setDuration("00:00:35");
		testLogList.addElement(record1);
		LineParse result= new LineParse();
		result=testLogList.Search("12345");
		assertEquals("Search record count match",1,result.getCount());
		assertEquals("Search record duration match","00:00:35",result.getDuration());
		
	}
	
	
	
	@Test
	public final void testSearchNotFoundPhoneNumber() throws ParseException {
		LogList testLogList= new LogList();
		LineParse record= new LineParse();
		record.setPhoneNumber("12345"); //phone1
		record.setDuration("00:00:35");
		record.setCount(1);
		testLogList.addElement(record);
		LineParse record1= new LineParse();
		record1.setPhoneNumber("32"); //phone2
		record1.setDuration("00:00:35");
		testLogList.addElement(record1);
		LineParse result= new LineParse();
		result=testLogList.Search("1");
		assertEquals("Search record count match",0,result.getCount());
		assertEquals("Search record duration match",null,result.getDuration());
		
	}
	
	
}
