
public class PersonalStudent {
	public String name, email, address;
	public int phonenumber;

	PersonalStudent() {
	}

	PersonalStudent(String name, String email, String add, int pno) {
		this.name = name;
		this.email = email;
		this.address = add;
		this.phonenumber = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
}
