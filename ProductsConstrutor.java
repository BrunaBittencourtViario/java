package entities;

public class ProductsConstrutor {

		public String name;
		public double price;
		public int quantity;
		
		public ProductsConstrutor (String name, double price, int quantity) { //construtor � colocado depois dos atributos e antes dos m�todos. O nome � o nome da classe.
			this.name = name; //this � refer�ncia para o pr�prio objeto.
			this.price = price;
			this.quantity = quantity;
		}
		
		public ProductsConstrutor (String name, double price) { //Sobrecarga: oferece mais de uma opera��o com o mesmo nome, mas com par�metros diferentes.
			this.name = name; //this � refer�ncia para o pr�prio objeto.
			this.price = price;
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
