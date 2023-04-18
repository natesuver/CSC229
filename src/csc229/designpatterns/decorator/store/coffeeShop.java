package csc229.designpatterns.decorator.store;

import csc229.designpatterns.decorator.Espresso;
import csc229.designpatterns.decorator.HouseBlend;
import csc229.designpatterns.decorator.Milk;
import csc229.designpatterns.decorator.Mocha;
import csc229.designpatterns.decorator.Soy;
import csc229.designpatterns.decorator.Whip;
import csc229.designpatterns.decorator.Beverage;
import csc229.designpatterns.decorator.DarkRoast;
import csc229.designpatterns.decorator.Decaf;

public class coffeeShop extends beverageStore {

    @Override
    public Beverage GetBeverage(String type) {
        switch (type) {
            case "dark roast":
                return new DarkRoast();
            case "espresso":
                return new Espresso();
            case "house blend":
                return new HouseBlend();
            case "decaf":
                return new Decaf();
            default:
                return null;
        }
    }

    @Override
    public Beverage AddCondiment(Beverage beverage, String type) {
        switch (type) {
            case "milk":
                return new Milk(beverage);
            case "mocha":
                return new Mocha(beverage);
            case "soy":
                return new Soy(beverage);
            case "whip":
                return new Whip(beverage);
            default:
                return null;
        }
    }
    
}
