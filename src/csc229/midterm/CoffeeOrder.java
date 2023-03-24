package csc229.midterm;

public class CoffeeOrder {
    private String size;
    private String drink;
    private double price;

    public CoffeeOrder(String size, String drink) {
        this.size = size;
        this.drink = drink;
        if (size.equals("small")) {
            if (drink.equals("coffee")) {
                this.price = 1.50;
            } else if (drink.equals("latte") || drink.equals("americano")) {
                this.price = 3.00;
            }
        } else if (size.equals("medium")) {
            if (drink.equals("coffee")) {
                this.price = 2.00;
            } else if (drink.equals("latte") || drink.equals("americano")) {
                this.price = 3.50;
            }
        } else if (size.equals("large")) {
            if (drink.equals("coffee")) {
                this.price = 2.50;
            } else if (drink.equals("latte") || drink.equals("americano")) {
                this.price = 4.00;
            }
        }
    }

    public void PrintOrder() {
        System.out.println("Size: " + this.size + ", Drink: " + this.drink  + ", Price: $" + this.price);
    }
}