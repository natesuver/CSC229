package csc229.designpatterns;

import csc229.designpatterns.beverages.HouseBlend;
import csc229.designpatterns.beverages.Espresso;
import csc229.designpatterns.beverages.Beverage;
import csc229.designpatterns.beverages.Decaf;

public class CoffeeOrder {
    private Beverage myDrink;

    public void OrderMyCoffee(String size, String drink) {
        if (drink.equals("coffee")) {
            myDrink = new HouseBlend();
            myDrink.setMilk(true);
        } else if (drink.equals("decaf")) {
            myDrink = new Decaf();
            myDrink.setMilk(true);
        }  else if (drink.equals("espresso"))  {
            myDrink = new Espresso();
            myDrink.setMilk(true);
            myDrink.setWhip(true);
        }
        myDrink.setSize(size);
    }

    public void PrintOrder() {
        myDrink.PrintOrder();
    }

    public static void main(String[] args) {
        CoffeeOrder coffee = new CoffeeOrder();
		coffee.OrderMyCoffee("large","coffee");
        coffee.PrintOrder();
	}
}