package csc229.midterm;

public class CoffeeOrderingSystem {

	public static void main(String[] args) {
		CoffeeOrder order1 = new CoffeeOrder("small", "coffee");
		CoffeeOrder order2 = new CoffeeOrder("large", "capucino");
		order1.PrintOrder();
		order2.PrintOrder();

	}

}
