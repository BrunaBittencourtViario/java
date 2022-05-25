package entities;

public class Account {

		private int number; //argumentos privados uso get e set. Em number só get, pq não vai mudar o número.
		private String holder;
		private double balance; //vai ter apenas get (sem set) pq só pode mudar os valores por meio de saque ou depósito.
		
		public Account(int number, String holder) { //esse construtor recebe apenas 2 argumentos (number e holder)
			super();
			this.number = number;
			this.holder = holder;
		}

		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit); //encapsulamento regra de negócio.
		}

		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}

		public void deposit (double amount) { //encapsulamento
			balance += amount;
		}
		
		public void withdraw (double amount) {
			balance -= amount + 5.0;
		}

		public String toString() {
			return "Account "
					+ number
					+ ", Holder: "
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
		}
}
