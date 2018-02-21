
public class SavingsAccount {
	int accountno;
	float balance;
	String status;
	int pin;

	void withdraw(int withdrawalAmount) {
		if (status == "active") {
			if (withdrawalAmount <= balance) {
				balance = balance - withdrawalAmount;
			} else {
				System.out.println("you have insufficient funds");
			}
		} else {
			System.out.println("Account is inactive");
		}

	}

	void printdetails() {
		System.out.println("Accountno:" + accountno + "\nBalance:" + balance + "\nstatus:" + status + "\n");
	}
}
