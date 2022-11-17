package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	/**
	 * 
	 * @param d date
	 * @param t time
	 */
	public Appointment(Date d, Time t) {
		this.date = d;
		this.time = t;
	}
	
	public String toString() {
		return date + " " + time;
	}
	
	public static void main(String[] args) {
		Date date1 = new Date("Feb", 04, 2022);
		Date date2 = new Date("Feb", 05, 2022);
		Time time1 = new Time(10, 15);
		Time time2 = new Time(10, 20);
		
		Appointment a1 = new Appointment(date1, time1);
		Appointment a2 = new Appointment(date2, time2);
		Appointment a3 = new Appointment(date2, time2);
		System.out.println(a3.equals(a2));
		System.out.println(a1.equals(a2));
		
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		calendar.add(a3);
		calendar.add(a1);
		System.out.println(calendar);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
}
