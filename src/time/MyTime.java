package time;

public class MyTime {
	String day;
	String month;
	String year;
	String time;

	public MyTime() {

		this.year = java.time.LocalDate.now().toString().substring(0, 4);
		this.month = java.time.LocalDate.now().toString().substring(5, 7);
		this.day = java.time.LocalDate.now().toString().substring(8, 10);
		this.time = java.time.LocalTime.now().toString().substring(0,8);
	}

	public void print() {
		System.out.println("Time query: " + time + ", " + day + "/" + month + "/" + year);
	}
}
