package studio8;


public class Time {
	private int hour = 0;
	private int minute = 0;

	/**
	 * 
	 * @param h hour
	 * @param m minute
	 */
	public Time(int h, int m) {
		this.hour=h;
		this.minute=m;
	}

	public String toString() {
		return hour + ":" + minute;
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(10, 15);
		System.out.println(time1);
		
	}


}