package com.example.stock.Utilis;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public  class DateUlils {
	 public  static Integer getYear(Date d){
			 Calendar c=new GregorianCalendar();
			 c.setTime(d);
			 return c.get(Calendar.YEAR);
		 }
}
