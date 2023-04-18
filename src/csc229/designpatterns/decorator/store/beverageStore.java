package csc229.designpatterns.decorator.store;

import csc229.designpatterns.decorator.Beverage;

public abstract class beverageStore {
    public abstract Beverage GetBeverage(String type);
    public abstract Beverage AddCondiment(Beverage beverage, String type);
}
