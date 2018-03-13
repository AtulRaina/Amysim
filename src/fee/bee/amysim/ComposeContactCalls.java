package fee.bee.amysim;

import java.util.ArrayList;

public class ComposeContactCalls {

	// Why don't you comment the code 
	// Why don't you write what you are doing
	//  
	// This function apply rule to parse the phone numbers
	private String PhoneNumberRules(String phonenumber)
	{
		//!=null?item1.getPhoneNumber():"NULL")
		return phonenumber!=null && phonenumber.length()>6? phonenumber:"Null";
	}
	// Constructor takes paramerts to parse the phone number list
	 ComposeContactCalls(ArrayList <PhoneBook> contactList,LogList tLogList)
	{
		 boolean flag=false;
		for(LineParse item : tLogList.al)
		{
			flag=false;
		for(PhoneBook item1 : ContactList.temp)
		{
			if(item.getPhoneNumber().contains(PhoneNumberRules(item1.getPhoneNumber())))
			{
			System.out.println( item.getPhoneNumber() +","+item.getCount()+","+item.getDuration()+","+item1.ContactName);
			flag=true;
		    break;
			}
		}
		if(!flag)
		   System.out.println( item.getPhoneNumber() +","+item.getCount()+","+item.getDuration()+","+"UnKnown"); 
		}
	}
	
	
}
