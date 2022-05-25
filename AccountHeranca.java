package entities;

public class AccountHeranca {
	
	private Integer number;
	private String holder;
	protected Double balance; // n�o ser� p�blico o atributo (pq qualquer um pode mexer no saldo da conta,
							  // mas ser� liberado o acesso na classe AccountHerancaBusiness
	
	public AccountHeranca() {
		
	}
	
	public AccountHeranca(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}
