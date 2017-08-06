package com.ouya.zr.demo;

public class MyDate {

	
	private Integer day;
	private Integer mouth;
	private Integer year;
	
	
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMouth() {
		return mouth;
	}
	public void setMouth(Integer mouth) {
		this.mouth = mouth;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public MyDate(Integer day, Integer mouth, Integer year) {
		super();
		this.day = day;
		this.mouth = mouth;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", mouth=" + mouth + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((mouth == null) ? 0 : mouth.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (mouth == null) {
			if (other.mouth != null)
				return false;
		} else if (!mouth.equals(other.mouth))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	
}
