package org.emp;

public class Employee {
    private void empId() {
	  System.out.println("Employee ID : 123");
}
    private void empName() {
		System.out.println("Employee Name : Karthika.S");
}
    private void empDob() {
		System.out.println("Employee DOB : xx/yy/zz");
}
    private void empPhone() {
		System.out.println("Employee Phone no : 12345697890");
	}
    private void empEmail() {
		System.out.println("Employee Email : dasling@gmail.com");
	}
    private void empAddress() {
	    System.out.println("Employee address : Chennai");
	}
    public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
