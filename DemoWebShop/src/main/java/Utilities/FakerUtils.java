package Utilities;

import com.github.javafaker.Faker;

public class FakerUtils {

	private static Faker faker = new Faker();

	// First Name
	public static String getFirstName() {
		return faker.name().firstName();
	}

	// Last Name
	public static String getLastName() {
		return faker.name().lastName();
	}

	// Email (unique)
	public static String getEmail() {
		return faker.internet().emailAddress();
	}

	// Password (8–12 chars, with special chars)
	public static String getPassword() {
		return faker.internet().password(8, 12, true, true);
	}

	// Confirm Password (same as password)
	public static String getConfirmPassword(String password) {
		return password;
	}

	// City
	public static String getCity() {
		return faker.address().city();
	}

	// Full Address
	public static String getFullAddress() {
		return faker.address().fullAddress();
	}

	// Zipcode
	public static String getZipCode() {
		return faker.address().zipCode();
	}

	// Phone Number
	public static String getPhoneNumber() {
		return faker.phoneNumber().cellPhone();
	}
}
