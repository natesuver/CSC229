package csc229.designpatterns.decorator;


import csc229.designpatterns.decorator.store.OrderingSystem;
import csc229.designpatterns.decorator.store.beverageStore;
import csc229.designpatterns.decorator.store.coffeeShop;

public class EntryPoint {

    /**
     * @param args
     */
    public static void main(String[] args) {
       beverageStore store = new coffeeShop();
       OrderingSystem ordering = new OrderingSystem(store);
       ordering.StartOrder();
	}
}
