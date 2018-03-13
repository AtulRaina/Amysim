package fee.bee.amysim;

// class should only do one thing





public class PhoneBook {

	public Boolean startFlag=false;
	public Boolean endFlag=false;
    public  String ContactName;
    public String PhoneNumber;
  
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}
	// Bad Code
	public PhoneBook(String contactName, String phoneNumber)
	{
		this.ContactName=contactName;
		this.PhoneNumber=phoneNumber;
	}
      public void ParseLine(String line)
      {
    	  if(line.contains("BEGIN:VCARD"))
    	  {   endFlag=false;
    		  startFlag=true;
    	  }
    	  if(endFlag==false && startFlag==true)
    	  {
    		  if(this.getContactName(line)!=null)
    		  ContactName=getContactName(line);
    		  if(this.getContactNumber(line)!=null)
    			  PhoneNumber=getContactNumber(line);
    	  }
    	  if(line.contains("END:VCARD"))
    	  {
    		  endFlag=true;
    		  startFlag=false;
    		  ContactList.add(new PhoneBook(this.ContactName,this.PhoneNumber));
    	  }
      }
	public String getContactName(String string) {
		return string.contains("FN:")?  string.split(":")[1]: null;

	}

	public String getContactNumber(String string) {

		return string.contains("TEL;CELL:")?string.split(":")[1].substring(1):(string.contains("TEL;CELL;PREF:")?string.split(":")[1].substring(1):null);

	}

}
