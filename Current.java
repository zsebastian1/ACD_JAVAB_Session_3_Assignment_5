package AssignmentSession3;

import AssignmentSession4.Account;

public class Current extends Account {

		private double rateOfInterest;

		public Current(int acctNum, String acctName, String acctBalance, double rateOfInterest) {
			super(acctNum, acctName, acctBalance);
			this.rateOfInterest = rateOfInterest;
		}

		public double getRateOfInterest() {
			return rateOfInterest;
		}

		public void setRateOfInterest(double rateOfInterest) {
			this.rateOfInterest = rateOfInterest;
		}
		
		
	}

