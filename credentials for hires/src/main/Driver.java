package main;

import java.util.Scanner;

import model.Employee;
import service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employeeobj = new Employee("rohit", "vashistha");
		System.out.println("Please enter the department form the following :- ");
		System.out.println("1.Technical" + '\n' + "2.Admin" + '\n' + "3.Human Resource" + '\n' + "4.Legal");
		Scanner sc = new Scanner(System.in);
		int userinput = sc.nextInt();
		CredentialService credentialService = new CredentialService();

		char[] GeneratePassword = credentialService.generatePassword();

		switch (userinput) {
		case 1:
			credentialService.showCredentials(employeeobj.getFirstName());
			credentialService.generateEmailAddress(employeeobj.getFirstName(), employeeobj.getLastName(), "technical");
			System.out.println("Password  ----------->>>>" + GeneratePassword);

			break;

		case 2:
			credentialService.showCredentials(employeeobj.getFirstName());
			credentialService.generateEmailAddress(employeeobj.getFirstName(), employeeobj.getLastName(), "admin");
			System.out.println("Password  ----------->>>>" + GeneratePassword);
			break;

		case 3:
			credentialService.showCredentials(employeeobj.getFirstName());
			credentialService.generateEmailAddress(employeeobj.getFirstName(), employeeobj.getLastName(),
					"huamnresource");
			System.out.println("Password  ----------->>>>" + credentialService.generatePassword());
			break;

		case 4:
			credentialService.showCredentials(employeeobj.getFirstName());
			credentialService.generateEmailAddress(employeeobj.getFirstName(), employeeobj.getLastName(), "legal");
			System.out.println("Password  ----------->>>>" + credentialService.generatePassword());
			break;

		default:
			System.out.println("Please select from the above options!!");

		}

	}

}
