package pizzaBill;

public class mainPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizza piz1=new pizza("corn", 500);
		pizza piz2=new pizza("cheeseburst", 600);
		pizza piz3= new pizza("peperbarbeque", 500);
		bills bill1=new bills("bunny");
		bill1.takeOrder(piz1, 6);
		bill1.takeOrder(piz2, 8);
		bill1.takeOrder(piz3, 6);
		bill1.printOrder();
	}

}
