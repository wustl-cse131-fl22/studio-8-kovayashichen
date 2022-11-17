package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private String month = "";
	private int day = 0;
	private int year = 0;

	/**
	 * 
	 * @param m month
	 * @param d day
	 * @param y year
	 */
	public Date(String m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}
	

	public String toString() {
		return month + " " +  day + " " + year;
	}

	public static void main(String[] args) {
		Date date1 = new Date("Feb", 04, 2022);
		System.out.println(date1);
		
		Date date2 = new Date("Feb", 05, 2022);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date1);
		System.out.println(list);
		System.out.println(list.hashCode());
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date1);
		System.out.println(set);
		System.out.println(set.hashCode());
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}
	
	

}

