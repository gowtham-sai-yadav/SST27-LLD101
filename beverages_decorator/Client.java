package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage cappuccino = new Cappuccino();
		System.out.println("Cappuccino base cost: " + cappuccino.cost());
		
		Beverage chocoCappuccino = new Chocolate(cappuccino);
		System.out.println("Cappuccino + Chocolate cost: " + chocoCappuccino.cost());
		
		Beverage latte = new Latte();
		System.out.println("Latte base cost: " + latte.cost());
		
		Beverage doubleChocoLatte = new Chocolate(new Chocolate(latte));
		System.out.println("Latte + Double Chocolate cost: " + doubleChocoLatte.cost());
		
	}

}