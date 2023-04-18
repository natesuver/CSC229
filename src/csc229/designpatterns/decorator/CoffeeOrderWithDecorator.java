package csc229.designpatterns.decorator;

import java.util.Scanner;

public class CoffeeOrderWithDecorator {
    private Beverage myDrink;

    public void OrderMyCoffee(String size, String drink) {
       
    }

    public void PrintOrder() {
        myDrink.PrintOrder();
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
                while (true) {
                    System.out.println("What would you like?");
                    input = sc.nextLine();
                    boolean beverageFound = true;
                    switch (input) {
                        case "dark roast":
                            System.out.println("You picked dark roast!");
                            break;
                        case "espresso":
                            System.out.println("You picked espresso!");
                            break;
                        case "house blend":
                            System.out.println("You picked house blend!");
                            break;
                        case "decaf":
                            System.out.println("You picked decaf!");
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
                            break;
                        }
                        switch (input) {
                            case "milk":
                                System.out.println("You picked milk!");
                                break;
                            case "mocha":
                                System.out.println("You picked mocha!");
                                break;
                            case "soy":
                                System.out.println("You picked soy!");
                                break;
                            case "whip":
                                System.out.println("You picked whip!");
                                break;
                            default:
                                System.out.println("We do not have " + input + ". Pick something else." );
                                break;
                        }
              
                    }
                    
                    System.out.println("Would you like another beverage?");
                    input = sc.nextLine();
                    if (input.equals("no")) {
                        System.out.println("Sending Order to Barista");
                        System.out.println("Your total is $56.54.  Pickup your order at the counter.  Thank you and come again!  Next Customer?");
                        break;
                    }
                }
               
            }
        }
	}
}
