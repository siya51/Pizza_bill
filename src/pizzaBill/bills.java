package pizzaBill;

public class bills {
	public final int GST=12; 
	public String customerName;
	public orders[] pizzas;
	public float totalAmount=0;
	public float netAmount=0;
	private int totalPizza=0;
	public bills(String customerName) {
		super();
		this.customerName = customerName;
		pizzas = new orders[10];
	}
	public void takeOrder(pizza p, int quantity) {

		
		pizzas[totalPizza]=new orders(p, quantity);
		totalPizza++;
		
	}
	public void printOrder() {
		System.out.println("Name of the Customer: "+customerName+"\n");
		System.out.println("==============================");
		for(int i=0; i< totalPizza;i++) {
			
			System.out.println(pizzas[i].getName());
			System.out.println("\n =====");
			totalAmount=pizzas[i].getPrice()*pizzas[i].quantity;
			System.out.print("  "+pizzas[i].getPrice());2
			System.out.print("  "+pizzas[i].quantity);
		}
		System.out.println("\n ==============================");
		netAmount=(totalAmount*(GST/100))+totalAmount;
		System.out.println("\n"+" Total_Amount: "+totalAmount);
		System.out.println("Net Amount with 8%: " +netAmount);
		System.out.println("==============================");
	}
}
