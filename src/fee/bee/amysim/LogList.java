package fee.bee.amysim;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

public class LogList {
	
	public ArrayList<LineParse> al=new ArrayList<LineParse>();
	public ArrayList<LineParse> getAl() {
		return al;
	}

	public void setAl(ArrayList<LineParse> al) {
		this.al = al;
	}

	public void addElement(LineParse record) throws ParseException
	{
		Set<LineParse> set = new HashSet<LineParse>(this.al);
		if(this.al.size()!=0)// array should not be empty
		{
			for (LineParse item : set) {
			   if(item.getPhoneNumber().equals(record.getPhoneNumber()))
			   {
				  item.setCount(item.getCount()+1);
				  item.setDuration(AddTime(item.getDuration(),record.getDuration()));
				  this.al=  new ArrayList<LineParse>(set);
				  break;
			   }
			   else
			   {
				   this.al.add(record);  
			   }
			}
			
		}
		else
		{
			this.al.add(record);
		}
		}
		
		
	
	
	public String AddTime(String oldTime, String newTime) throws ParseException
	{
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date1;
		date1 = timeFormat.parse(oldTime);
	    Date date2 = timeFormat.parse(newTime);
           long sum = date1.getTime() + date2.getTime();
			return timeFormat.format(new Date(sum)).toString();
		
	}

     public LineParse Search(String phonenumber)
     {
    	 
    	 Set<LineParse> set = new HashSet<LineParse>(this.al);
 		if(this.al.size()!=0)// array should not be empty
 		{
 			for (LineParse item : set) {
 			   if(item.getPhoneNumber().equals(phonenumber))
 			   {
 				return item;
 			   }
 			   else
 			   {   
 			   }
 			}
 		}
 		return new LineParse(); //empty
     }


}
