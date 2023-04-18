package csc229.designpatterns.decorator;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CoffeeOrderWithDecorator {
    private Beverage myDrink;

    public void OrderMyCoffee(String size, String drink) {
       
    }

    public void PrintOrder() {
        myDrink.PrintOrder();
    }

    private static double ComputeOrderTotal(List<Beverage> order) {
        double totalCost = 0;
        for (Beverage b: order) {
            totalCost+=b.cost();
        }
        return totalCost;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Welcome to CoffeeBux!  Can I take your order?");
            input = sc.nextLine();
            if (input.equals("no")) {
                System.out.println("Thank you!  Have a CoffeeTastic day!  Next Customer?");
            }
            else {
                List<Beverage> customerOrder = new ArrayList<Beverage>();
                while (true) {
                    System.out.println("What would you like?");
                    input = sc.nextLine();
                    Beverage myItem=null;
                    boolean beverageFound = true;
                    switch (input) {
                        case "dark roast":
                            myItem = new DarkRoast();
                            System.out.println(String.format("You picked %s!", myItem.getDescription()));
                            break;
                        case "espresso":
                            myItem = new Espresso();
                            System.out.println(String.format("You picked %s!", myItem.getDescription()));
                            break;
                        case "house blend":
                            myItem = new HouseBlend();
                            System.out.println(String.format("You picked %s!", myItem.getDescription()));
                            break;
                        case "decaf":
                            myItem = new Decaf();
                            System.out.println(String.format("You picked %s!", myItem.getDescription()));
                            break;
                        default:
                            System.out.println("We do not have " + input + ".  Pick something else");
                            beverageFound = false;
                            break;
                    }
                    while (true && beverageFound) {
                        System.out.println("What condiments you do want?");
                        input = sc.nextLine();
                        if (input.contains("none")) {
                            System.out.println("Beverage Added to order!");
                            System.out.println(String.format("Sending %s to Barista",myItem.GetOrder()));
                            customerOrder.add(myItem);
                            break;
                        }
                        switch (input) {
                            case "milk":
                                myItem = new Milk(myItem);
                                System.out.println(String.format("You picked %s!", myItem.getDescription()));
                                break;
                            case "mocha":
                                myItem = new Mocha(myItem);
                                System.out.println(String.format("You picked %s!", myItem.getDescription()));
                                break;
                            case "soy":
                                myItem = new Soy(myItem);
                                System.out.println(String.format("You picked %s!", myItem.getDescription()));
                                break;
                            case "whip":
                                myItem = new Whip(myItem);
                                System.out.println(String.format("You picked %s!", myItem.getDescription()));
                                break;
                            default:
                                System.out.println("We do not have " + input + ". Pick something else." );
                                break;
                        }
              
                    }
                    
                    System.out.println("Would you like another beverage?");
                    input = sc.nextLine();
                    if (input.equals("no")) {
                        
                        Locale locale = new Locale("en", "US");      
                        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                        double totalCost = ComputeOrderTotal(customerOrder);
                        System.out.println("Your grand total is " + currencyFormatter.format(totalCost) + ".  Pickup your order at the counter.  Thank you and come again!  Next Customer?");
                        break;
                    }
                }
               
            }
        }
	}
}
