package model;

public class User {
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String mobile_number;

	public User(String username, String password, String firstName, String lastName, String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = firstName;
		this.last_name = lastName;
		this.mobile_number = mobileNumber;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public String getMobileNumber() {
		return mobile_number;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobile_number = mobileNumber;
	}
	
	public String toString() {
		return username + ", " + password + ", " + first_name + ", " + last_name + ", " + mobile_number;
	}
	
}
