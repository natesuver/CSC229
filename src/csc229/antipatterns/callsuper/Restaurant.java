package csc229.antipatterns.callsuper;

public class Restaurant extends Business {
	   private int rating;
	   public Restaurant(String name, String address) {
		super(name, address);
	}
	public void setRating(int rating) {
		   this.rating = rating;
	   }
	   @Override
	   public String getDescription() {
		   //in order for the output to make sense here, the derived class MUST call the base class method.
	      return super.getDescription() + "\n  Rating: " + rating;
	   }
	}
