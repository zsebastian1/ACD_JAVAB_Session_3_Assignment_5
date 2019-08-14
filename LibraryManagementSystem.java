package AssignmentSession3;

public class LibraryManagementSystem {

	String[] employees;
	String[] customers;
	String databaseSystem[];
}

class Employees extends LibraryManagementSystem {
	String name;
	int employeeID;
	String address;
	
}

class LibraryDatabaseSystem extends LibraryManagementSystem {
	String tables;
	String queries;
	String data;
	String code;
}

class Customers {
	String name;
	String address;
	int customerID;
}

class UniversitySubscriber extends Customers {
	String name;
	String address;
	String specialDeal;
}

class PaidSubscriber extends Customers {
	String name;
	String address;
	String specialDeal;
}

class Content {
	String typeOfContent;
	int amountOfPages;
	int ageOfContent;
}

class Journals extends Content {
	String typeOfJournals;
	int amountOfPages;
	int ageOfJournal;
	String authorOfJournals;
}

class Magazines extends Content {
	String typeOfMagazine;
	int amountOfPages;
	int ageOfMagazine;
	String authorOfMagazine;
}

class Books extends Content {
	String typeOfBook;
	int amountOfPages;
	int ageOfBook;
	String authorOfBook;
}