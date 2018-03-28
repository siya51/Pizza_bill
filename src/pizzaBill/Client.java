
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza piz1=new Pizza("PeperRoni", 500);
		Pizza piz2=new Pizza("Shawarna", 600);
		Pizza piz3= new Pizza("Chicken", 500);
		Bill bill1=new Bill("Anonymous");
		bill1.takeOrder(piz1, 6);
		bill1.takeOrder(piz2, 8);
		bill1.takeOrder(piz3, 6);
		bill1.printOrder();
	}	

}
