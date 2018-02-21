public class Student {
	public int stuid;
	public String stuname;
	public String stucity;

	public Student(int stuid, String stuname, String stucity) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.stucity = stucity;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStucity() {
		return stucity;
	}

	public void setStucity(String stucity) {
		this.stucity = stucity;
	}

	public String toString() {
		return stuid + " " + stuname + " " + stucity;
	}
}