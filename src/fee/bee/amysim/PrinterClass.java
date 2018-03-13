package fee.bee.amysim;

import java.util.HashSet;

public class PrinterClass {
	HashSet<String> hashset;
	//Class takes a list of the object and prints
	public void PrintRecords(LogList el)
	{
	
		for(LineParse item : el.al)
		{
		System.out.println( item.getPhoneNumber() +","+item.getCount()+","+item.getDuration());
		}
	}
	
	public HashSet<String> PrintRecords(LogList el,String temp)
	{
		hashset= new HashSet<String>();
		for(LineParse item : el.al)
		{
		hashset.add( item.getPhoneNumber() +","+item.getCount()+","+item.getDuration());
		}
		return hashset;
	}

	
	public void PrintRecords(LineParse item)
	{
		System.out.println( item.getPhoneNumber() +","+item.getCount()+","+item.getDuration());	
	}
}
	