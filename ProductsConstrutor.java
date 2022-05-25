package entities;

public class ProductsConstrutor {

		public String name;
		public double price;
		public int quantity;
		
		public ProductsConstrutor (String name, double price, int quantity) { //construtor é colocado depois dos atributos e antes dos métodos. O nome é o nome da classe.
			this.name = name; //this é referência para o próprio objeto.
			this.price = price;
			this.quantity = quantity;
		}
		
		public ProductsConstrutor (String name, double price) { //Sobrecarga: oferece mais de uma operação com o mesmo nome, mas com parâmetros diferentes.
			this.name = name; //this é referência para o próprio objeto.
			this.price = price;
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
