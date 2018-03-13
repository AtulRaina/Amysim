package fee.bee.amysim;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Root {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	
		String File="C:\\Users\\atulr\\Desktop\\Biller\\TestData.csv";
		String ContactFile="c:\\users\\atulr\\desktop\\biller\\Contacts.vcf";
		LogList tLogList= new LogList();
		
		ContactParser test= new ContactParser(ContactFile);
		
		try (BufferedReader br = new BufferedReader(new FileReader(File))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	if(line.contains("Talk"))
		    	{
		       LineParse rLog= new LineParse();
		       rLog.SetParamters(line);
		       tLogList.addElement(rLog);
		    	}
		    }
		    
		    
		}
		
		// Based on the options sent by the user different numbers are displayed
		PrinterClass tPrinterClass= new PrinterClass();
		Scanner scanner = new Scanner(System.in);
 while(true)
 {
	    //  prompt for the user's name
	    System.out.print("\n-------------------------------------------------------------------------------------------------------- ");
	    System.out.print("\n Enter your choice \n 1. ALL Calls  \n 2. Search Number \n 3. Display Contact List\n 4. Display Number Calls \n1");
	    System.out.print("\n-------------------------------------------------------------------------------------------------------- ");
	    // get their input as a String
	    int selection = scanner.nextInt();
	    
	    if(selection==1)
	    {
	    	tPrinterClass.PrintRecords(tLogList);
	    	
	    }
	    if(selection==2)
	    {
	    	System.out.print("Enter your search phoneNumber ");
	    	String phonenumber=scanner.next();
	    	tPrinterClass.PrintRecords(tLogList.Search(phonenumber));
	    }
	    if(selection==3)
	    {
	    	test.PrintData();
	    }
	    if(selection==4)
	    {
	    	ComposeContactCalls temp= new ComposeContactCalls(ContactList.temp,tLogList);
	    }
	 

		
	}
	}

}
