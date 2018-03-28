
public class Bill {
	public final int GST=12; //in %
	public String customerName;
	public Order[] pizzas;
	public float totalAmount=0;
	public float netAmount=0;
	private int totalPizza=0;
	public Bill(String customerName) {
		super();
		this.customerName = customerName;
		pizzas = new Order[10];
	}
	public void takeOrder(Pizza piz, int quantity) {
//		System.out.println(pizzas.length);
		
		pizzas[totalPizza]=new Order(piz, quantity);
		totalPizza++;
		
	}
	public void printOrder() {
		System.out.println("Name of the Customer: "+customerName);
		for(int i=0; i< totalPizza;i++) {
			
			System.out.println(pizzas[i].getName());
			totalAmount=pizzas[i].getPrice()*pizzas[i].quantity;
			System.out.print("  "+pizzas[i].getPrice());
			System.out.print("  "+pizzas[i].quantity);
		}
		netAmount=(totalAmount*(GST/100))+totalAmount;
		System.out.println("Total Amount: "+totalAmount);
		System.out.println("Net Amount with 8%: " +netAmount);
	}
}
