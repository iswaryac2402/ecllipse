public class Practice {
	public int number;
	public String name;
	public String city;

	public Practice() {
	}

	public Practice(int number, String name, String city) {
		this.number = number;
		this.name = name;
		this.city = city;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return number + " " + name + " " + city;
	}

}