package timeOfDayVersion2;

public class Time {
	
	private int minutesSinceMidnight;
	
	public int getHours() {
		return this.minutesSinceMidnight/60;
	}
	
	public int getMinutes() {
		int hoursNow = getHours();
		return this.minutesSinceMidnight - hoursNow * 60;
	}
	
	public void setHours(int newHours) {		
		int minutesNow = getMinutes();
		this.minutesSinceMidnight = newHours * 60 + minutesNow;
	}
	
	public void setMinutes(int newMinutes) {
		int hoursNow = getHours();
		int minutesNow = getMinutes();
		if (minutesNow + newMinutes > 60) {
			hoursNow = hoursNow + 1;
			minutesNow = newMinutes + minutesNow - 60;
		}
		else {
			minutesNow += newMinutes;
		}
		this.minutesSinceMidnight = hoursNow * 60 + minutesNow;
	}
}
