package csc229;

import csc229.antipatterns.callsuper.Restaurant;
import csc229.antipatterns.liskov.Rectangle;
import csc229.antipatterns.liskov.Square;

public class MainRunner {

	public static void main(String[] args) {
		//Call Super Anti-pattern
		//https://oowisdom.csse.canterbury.ac.nz/index.php/Call_super
		 Restaurant myFavorite = new Restaurant("Bills Burgers","100 Main St");
		 myFavorite.setRating(5);
	     System.out.println(myFavorite.getDescription());
	     //Liskov Substitution Problem
	     //https://oowisdom.csse.canterbury.ac.nz/index.php/Liskov_substitution_principle
	     Rectangle rect = new Rectangle();
	     rect.setHeight(4);
	     rect.setWidth(5);
	     System.out.println("Area of Rectangle " + rect.area());
	     
	     Square square = new Square();
	     square.setHeight(4);
	     square.setWidth(5);
	     System.out.println("Area of Square " + square.area());
	}

}
