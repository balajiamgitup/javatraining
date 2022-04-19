package training.exceptions;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Account ac = new Account();
		CustomExceptionDemo cd = new CustomExceptionDemo();

		try {
			cd.withdraw(ac, 100);
			cd.withdraw(ac, 200);
			cd.withdraw(ac, 300);
			cd.withdraw(ac, 500);
			cd.withdraw(ac, 300);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}

	}

	private void withdraw(Account ac, double amount) throws InsufficientFundException {
		if (isBalanaceAvailable(ac, amount)) {
			ac.setAmount(ac.getAmount() - amount);
			System.out.println("Amount withdrawn, Availabale Balance: " + ac.getAmount());
		} else
			throw new InsufficientFundException("there is less amount in your account");
	}

	private static boolean isBalanaceAvailable(Account ac, double amount) {
		if (ac.getAmount() >= amount) {
			return true;
		}
		return false;
	}
}
