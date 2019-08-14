package AssignmentSession3;

public class Customer {

	private int custNo;
	private String custName;
	private static int custCount;


public Customer() {
	
	custCount++;
}

public Customer(int custNo, String custName) {
	this();
	this.custNo = custNo;
	this.custName = custName;
}

public int getCustNo() {
	return custNo;
}

public void setCustNo(int custNo) {
	this.custNo = custNo;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public static int getCustCount() {
	return custCount++;
}
}