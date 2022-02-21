package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
//		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
//		
//		System.out.println(testUser.toString());
		
		String testUsername = "mike";
		String testPassword = "my_passwd";
		String testFirst_name = "Mike";
		String testLast_name = "Smith";
		String testMobileNumber = "07771234567";
		
		User testUser = new User(testUsername, testPassword, testFirst_name, testLast_name, testMobileNumber);
		
		Boolean passed = true;
		
		if (testUser.getUsername() != testUsername) {
			System.out.println("TC1 Failed: username did not match");
			passed = false;
		}
		if (testUser.getPassword() != testPassword) {
			System.out.println("TC2 Failed: password did not match");
			passed = false;
		}
		if (testUser.getFirst_name() != testFirst_name) {
			System.out.println("TC3 Failed: first name did not match");
			passed = false;
		}
		if (testUser.getLast_name() != testLast_name) {
			System.out.println("TC4 Failed: last name did not match");
			passed = false;
		}
		if (testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC1 Failed: mobile number did not match");
			passed = false;
		}
		
		if (passed) {
			//System.out.println("All TCs passed.");
		}
		
		assert testUser.getUsername() == testUsername;
		assert testUser.getPassword() == testPassword;
		assert testUser.getFirst_name() == testFirst_name;
		assert testUser.getLast_name() == testLast_name;
		assert testUser.getMobileNumber() == testMobileNumber;
		
		System.out.println("All Java assertions in the test suite passed (none failed).");
	}
}
