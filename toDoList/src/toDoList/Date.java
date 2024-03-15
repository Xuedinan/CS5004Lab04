package toDoList;

public class Date {
	
	protected int day;
	protected int month;
	protected int year;
	
	public Date(int day, int month, int year) {
		if(day > 31 || month > 12 || day < 0 || month < 0 || year < 0) {
			throw new IllegalArgumentException("Invalid day or month input");
		}
		else {
		this.day = day;
		this.month = month;
		this.year = year;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day > 31 || day < 0) {
			throw new IllegalArgumentException("Invalid day input");
		}
		else {
		this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 12 || month < 0) {
			throw new IllegalArgumentException("Invalid month input");
		}
		else {
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return day + "/" + month + "/" + year; 
	}

}
