package csc229.designpatterns.decorator.store;

import csc229.designpatterns.decorator.Beverage;
import csc229.designpatterns.decorator.IBeverage;

public abstract class beverageStore implements IBeverageStore {
    @Override
    public abstract Beverage GetBeverage(String type);
    @Override
    public abstract Beverage AddCondiment(IBeverage beverage, String type);
    @Override
    public abstract String StoreName();
    @Override
    public abstract String ProductName();
    @Override
    public abstract String CompanyTagline();
    @Override
    public abstract String CondimentGenericName();
    @Override
    public abstract String DrinkCreatorName();
}
