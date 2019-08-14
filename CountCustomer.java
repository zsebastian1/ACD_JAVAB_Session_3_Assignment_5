package AssignmentSession3;

public class CountCustomer {

	public static void main(String[] args) {

		Customer cust1 = new Customer(1, "Zair");
		Customer cust2 = new Customer(2, "Aditya");
		Customer cust3 = new Customer(3, "Ms. Anna");
		
		System.out.println("The name of the first customer is " + cust1.getCustName() + " and their customer number is " + cust1.getCustNo());
		System.out.println("The name of the second customer is " + cust2.getCustName() + " and their customer number is " + cust2.getCustNo());
		System.out.println("The name of the third customer is " + cust3.getCustName() + " and their customer number is " + cust3.getCustNo());

		System.out.println("The total amount of customers objects created is: " + cust1.getCustCount());

		
	}

}
