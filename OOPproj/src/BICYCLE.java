
public class BICYCLE {
	// fields or instance or non-static variables
	int gear;
	int speed;
	int cadence;
	String name;

	void changecadence(int newvalue) {
		cadence = newvalue;
	}

	void changegear(int newvalue) {
		gear = newvalue;
	}

	void changespeed(int decrement) {
		speed = speed - decrement;
	}

	void printdetails() {
		System.out.println("name:" + name + "\nspeed:" + speed + "\ngear:" + gear + "\ncadence:" + cadence + "\n");
	}
}
