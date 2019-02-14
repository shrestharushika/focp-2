package com.ncu.assignment.classes;
class Date 
{
 	int month;
 	int day;
	 int year;
 	Date(int month, int day, int year) 
    {
	 this.month = month;
 	this.day = day;
 	this.year = year;
    }
 	public void setDate (int d, int m, int y) 
	 {
           this.day = d;
 	   this.month = m;
 	   this.year = y;
 	 }
 	public String displayDate () 
   {
 	return (day + "/" + month + "/" + year);
	 }
}
