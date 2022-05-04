package exercicioFixacaoSecao9.entities;

public class Account {
	private String number;
	private String holder;
	private double balance;
	private final static double WITHDRAW_TAX = 5;

	public String toString() {
		return "Acoount " + this.number + ", Holder: " + this.holder + ", Balance: $ " + this.balance;
	}

	public Account(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public void depositValue(double deposit) {
		this.balance += deposit;
		System.out.println("Updated account data:");
		System.out.println(this);
	}

	public void withDrawValue(double withDraw) {
		this.balance -= withDraw + WITHDRAW_TAX;
		System.out.println("Updated account data:");
		System.out.println(this);
	}

	public void initialDeposit(double deposit) {
		this.balance += deposit;
		System.out.println("\nAccount data:");
		System.out.println(this);
	}

}
