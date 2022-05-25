package entities;

public class ProductsConstrutorGet_Setter {

	private String name;
	private double price;
	private int quantity;
	
		
	public ProductsConstrutorGet_Setter(String name, double price, int quantity) { // Bot�o direito mouse + Source + Generate Construtor using Fields
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductsConstrutorGet_Setter(String name, double price) {
		this.name = name;
		this.price = price;
	}

		
	public String getName() { //// Bot�o direito mouse + Source + Generate Getters and Setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //this auto-refer�ncia para o atributo e n�o para o par�metro do m�todo.
	}
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());


	}

}
