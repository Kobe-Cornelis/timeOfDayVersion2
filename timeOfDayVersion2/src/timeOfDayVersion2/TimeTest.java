package timeOfDayVersion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time();
		time.setHours(5);
		time.setMinutes(48);
		int hours = time.getHours();
		int minutes = time.getMinutes();
		assertEquals(5, hours);
		assertEquals(48, minutes);
	}

}
