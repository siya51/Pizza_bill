package pizzaBill;

public class orders {
	public pizza pizzza;
	public int quantity;
	
	
	
	public orders(pizza pizzza, int quantity) {
		super();
		this.pizzza = pizzza;
		this.quantity = quantity;
	}

	public float getPrice() {
		return pizzza.getPrice();
	}
	public String getName() {
		return pizzza.getName();
	}

}
