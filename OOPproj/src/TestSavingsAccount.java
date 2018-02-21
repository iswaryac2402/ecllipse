
public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount account = new SavingsAccount();
		account.accountno = 101;
		account.balance = 5000;
		account.status = "active";
		account.pin = 1234;
		account.printdetails();
		System.out.println();
		SavingsAccount account2 = new SavingsAccount();
		account2.accountno = 102;
		account2.balance = 10000;
		account2.status = "active";
		account2.pin = 2345;
		account2.printdetails();

	}

}
