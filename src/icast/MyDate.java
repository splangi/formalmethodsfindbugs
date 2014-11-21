package icast;

import java.util.Date;

public class MyDate {
	
	public static Date getDateFrom1970(int seconds){
		return new java.util.Date(seconds*1000);
	}

}
