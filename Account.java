package AssignmentSession3;

public class Account {

	private int acctNo;
	private String acctName;
	private String acctBal;
	
	public Account(int acctNo, String acctName, String acctBal) {
		super();
		this.acctNo = acctNo;
		this.acctName = acctName;
		this.acctBal = acctBal;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctBal() {
		return acctBal;
	}

	public void setAcctBal(String acctBal) {
		this.acctBal = acctBal;
	}
	
	
}
