package service;

import java.util.Random;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/,?<>)";

		String value = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {

			password[i] = value.charAt(random.nextInt(value.length()));

		}
		return password;

	}

	public void generateEmailAddress(String firstName, String lastName, String department) {
		System.out.println("Email  ----------->>>> " + firstName + lastName + "@" + department + ".abc.com");

	}

	public void showCredentials(String firstName) {
		System.out.println("Dear " + firstName + " your generated credentials are as follows :-  ");

	}

}
