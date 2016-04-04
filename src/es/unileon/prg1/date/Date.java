/*Path*/
package es.unileon.prg1.date;

public class Date{
	private int day;
	private int month;
	private int year;

	void setYear(year){
		this.year = year; 
 	}

	int getYear(){
		return this.year;
	}

	boolean isSameYear(Date.other){
		if(this.year == other.getYear()){
			return true;
		}	
		else{
			return false;
		}

}
