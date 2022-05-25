package entities;

public class ProductsConstrutorGet_Setter {

	private String name;
	private double price;
	private int quantity;
	
		
	public ProductsConstrutorGet_Setter(String name, double price, int quantity) { // Botão direito mouse + Source + Generate Construtor using Fields
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductsConstrutorGet_Setter(String name, double price) {
		this.name = name;
		this.price = price;
	}

		
	public String getName() { //// Botão direito mouse + Source + Generate Getters and Setters
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
		this.quantity += quantity; //this auto-referência para o atributo e não para o parâmetro do método.
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
