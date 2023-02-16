package problem3;

public class Product {
	int productId;
	String productName;
	int quantity;
	int price;
	public Product(int productId, String productName, int quantity, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return productId + "\t\t" + productName + "\t\t" + quantity
				+ "\t\t" + price +"\n";
	}
	
	
	
}
