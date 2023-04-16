package csc229.designpatterns.decorator;

public class CoffeeOrderWithDecorator {
    private Beverage myDrink;

    public void OrderMyCoffee(String size, String drink) {
       
    }

    public void PrintOrder() {
        myDrink.PrintOrder();
    }

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
		beverage.PrintOrder();
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2.PrintOrder();
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3.PrintOrder();
	}
}
