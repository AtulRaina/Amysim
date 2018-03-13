package fee.bee.amysim;

import java.util.ArrayList;

public class ContactList {
	static ArrayList <PhoneBook> temp= new ArrayList<>();
	
	
	final public static void add(PhoneBook element)
	{
		
		temp.add(element);
	}

	final public ArrayList<PhoneBook> getTemp() {
		return temp;
	}

	final public void setTemp(ArrayList<PhoneBook> temp) {
		this.temp = temp;
	}

}
