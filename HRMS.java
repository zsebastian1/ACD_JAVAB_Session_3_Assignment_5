package AssignmentSession3;

public class HRMS {
	// Human Resources Management System

	String employees;
	String admin;
	String userName;
	String password;
}

class Personnel extends HRMS {
	
	String name;
	String position;
	
}

class Payroll extends HRMS {
	double amountGiven;
	double amountReceived;
	double wages;
	double salaries;
}
class Attendance extends HRMS {
	String timeClockedIn;
	String timeClockedOut;
	int numberOfTimesLate;
	int numberOfTimesEarly;
	
}
class Security extends HRMS {
	String antiVirusSoftware;
	String wifiSecurity;
	String routerUsed;
	
}

class Recruitment extends HRMS {
	String employeesToContact;
	String futureEmployees;
	String candidatesToContact;
	String candidatesDeferred;
	String candidatesToHire;
	
}
