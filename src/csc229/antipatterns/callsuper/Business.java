package csc229.antipatterns.callsuper;

public class Business {
	
   private String name;
   private String address;
   public Business(String name, String address) {
	   this.name = name;
	   this.address= address;
   }
   public String getDescription() {
      return name + " -- " + address;
   }
}
