
public class Time {
	private long hour, minute, second, totalHours, totalMinutes, totalSeconds;

	public Time() {
		totalSeconds = (System.currentTimeMillis() / 1000);
		second = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		hour = (totalHours % 24);
	}

	public Time(long elapseTime) { 
		totalSeconds = elapseTime / 1000;
		second = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(long elapseTime) {
		totalSeconds = elapseTime / 1000;
		second = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

}