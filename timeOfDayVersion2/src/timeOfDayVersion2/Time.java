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
	/**
	 * Stel het aantal uren in
	 * @throws Het aantal uren ligt tussen 0 en 23
	 *  | 0 <= newHours && newHours <= 23 
	 *  
	 * @post Het nieuwe aantal uren klopt
	 *  | getHours() == newHours
	 *  
	 *  @post Het aantal minuten is niet veranderd
	 *  | getMinutes() == old(getMinutes())
	 */
	
	public void setHours(int newHours) {		
		int minutesNow = getMinutes();
		this.minutesSinceMidnight = newHours * 60 + minutesNow;
	}
	/**
	 * Stelt de minuten in
	 * 
	 * @throws Het aantal uren ligt tusse 0 en 59
	 *  | 0 <= newMinutes && newMinutes <= 59
	 * @post Het nieuwe aantal minuten klopt
	 * | getMinutes() == newMinutes
	 * @post Het aantal uren is niet veranderd
	 * | getHours() == old(getHours())
	 */
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
