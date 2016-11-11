
public class TimeDriver {
	public static long convert = 555550000;

	public static void main(String[] args) {

		Time time1 = new Time();
		System.out.println("The current time is: " + time1 + " GMT (HH-MM-SS)");
		Time time2 = new Time(convert);
		System.out.println("The Millisecond time of " + convert + " is: " + time2 + " (HH-MM-SS)");
	}

}
