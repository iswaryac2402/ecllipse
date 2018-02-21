
public class Address {
	public int aptno;
	public String street;
	public long zipcode;

	public Address(int aptno, String street, long zipcode) {
		this.aptno = aptno;
		this.street = street;
		this.zipcode = zipcode;
	}

	public int getAptno() {
		return aptno;
	}

	public void setAptno(int aptno) {
		this.aptno = aptno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
		return aptno + " " + street + " " + zipcode;
	}
}