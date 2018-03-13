package fee.bee.amysim;
import java.awt.List;


public class LineParse {
	
	private String PhoneNumber;
	private int count=0;
	private String duration;

	LineParse()
	{
		count=0;
		PhoneNumber=duration=null;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void SetParamters(String Line)
	{
		if(Line.contains(","))
		{
		String[] arry = Line.split(",");
		PhoneNumber=arry[2];
	    duration=arry[3];
	    this.count=1;
		}
		else
		{
		}
		
	}
	
	
	}


