package csc229.designpatterns.decorator.store;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import csc229.designpatterns.decorator.Beverage;

public class OrderingSystem {
    private beverageStore store;

    public OrderingSystem(beverageStore store) {
        this.store = store;
    }

    private static double ComputeOrderTotal(List<Beverage> order) {
        double totalCost = 0;
        for (Beverage b : order) {
            totalCost += b.cost();
        }
        return totalCost;
    }

    public void StartOrder() {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Welcome to " + this.store.StoreName() + "!  Can I take your order?");
            input = sc.nextLine();
            if (input.equals("no")) {
                System.out.println("Thank you!  " + this.store.CompanyTagline() + "  Next Customer?");
            } else {
                List<Beverage> customerOrder = new ArrayList<Beverage>();
                while (true) {
                    System.out.println("What " + this.store.ProductName() + " would you like?");
                    input = sc.nextLine();
                    boolean beverageFound = true;
                    Beverage myItem = this.store.GetBeverage(input);
                    if (myItem == null) {
                        System.out.println("We do not have " + input + ".  Pick something else");
                        beverageFound = false;
                    } else {
                        System.out.println(String.format("You picked %s!", myItem.getDescription()));
                    }

                    while (true && beverageFound) {
                        System.out.println("What " + this.store.CondimentGenericName() + " you do want?");
                        input = sc.nextLine();
                        if (input.contains("no")) {
                            System.out.println(this.store.ProductName() + " Added to order!");
                            System.out.println(String.format("Sending %s to %s", myItem.GetOrder(), this.store.DrinkCreatorName()));
                            customerOrder.add(myItem);
                            break;
                        }
                        myItem = this.store.AddCondiment(myItem, input);
                        if (myItem == null) {
                            System.out.println("We do not have " + input + ".  Pick something else");
                        } else {
                            System.out.println(String.format("You picked %s!", myItem.getDescription()));
                        }
                    }
                    System.out.println("Would you like another " + this.store.ProductName() + "?");
                    input = sc.nextLine();
                    if (input.equals("no")) {

                        Locale locale = new Locale("en", "US");
                        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                        double totalCost = ComputeOrderTotal(customerOrder);
                        System.out.println("Your grand total is " + currencyFormatter.format(totalCost)
                                + ".  Pickup your order at the counter.  Thank you and come again!  Next Customer?");
                        break;
                    }
                }
            }
        }
    }
}
