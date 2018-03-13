package fee.bee.amysim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContactParser {
	PhoneBook test= new PhoneBook();
	public void PrintData()
	{
		for(PhoneBook item : ContactList.temp)
			{
			System.out.println( item.ContactName +":"+item.PhoneNumber);
			}
	}
	ContactParser(String File) throws FileNotFoundException, IOException
	{
	
		try (BufferedReader br = new BufferedReader(new FileReader(File))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    
		    	test.ParseLine(line);
		      	
	 }
		    
		    
		}
	}
}
