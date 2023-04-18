package csc229.designpatterns.decorator.store;

import csc229.designpatterns.decorator.Beverage;
import csc229.designpatterns.decorator.IBeverage;

public interface IBeverageStore {

    Beverage GetBeverage(String type);

    Beverage AddCondiment(IBeverage beverage, String type);

    String StoreName();

    String ProductName();

    String CompanyTagline();

    String CondimentGenericName();

    String DrinkCreatorName();

}