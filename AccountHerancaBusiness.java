package entities;

public class AccountHerancaBusiness extends AccountHeranca { //essa extensão faz desta classe ser a Herança

	private Double loanLimit;
	
	public AccountHerancaBusiness() {
	}

	public AccountHerancaBusiness(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //construtor super com os argumentos (dados)
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;	
		}
	}	
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);	
		balance -= 2.0;
		
	}
}
