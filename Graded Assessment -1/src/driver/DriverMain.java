package driver;

import model.AdminDepartment;
import model.HrDepartment;
import model.TechDepartment;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment objad = new AdminDepartment();
		HrDepartment objhr = new HrDepartment();
		TechDepartment objtech = new TechDepartment();

		// Printing information of admin department
		System.out.println("Welcome to " + objad.departmentName() + '\n' + objad.getTodaysWork() + '\n'
				+ objad.getWorkDeadline() + '\n' + objad.isTodayAHoliday());

		System.out.println();

		// Printing information of hr department
		System.out.println("Welcome to " + objhr.departmentName() + '\n' + objhr.doActivity() + '\n'
				+ objhr.getTodaysWork() + '\n' + objhr.getWorkDeadline() + '\n' + objhr.isTodayAHoliday());

		System.out.println();

		// Printing information of tech department

		System.out.println("Welcome to " + objtech.departmentName() + '\n' + objtech.getTodaysWork() + '\n'
				+ objtech.getWorkDeadline() + '\n' + objtech.getTechStackInformation() + '\n'
				+ objtech.isTodayAHoliday());

	}

}
