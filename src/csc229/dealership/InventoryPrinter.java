package csc229.dealership;

import java.util.ArrayList;

public class InventoryPrinter {
/**
 * ### In Class Exercise:
You are given some software that is used to run an inventory printing system for an auto dealership.  The existing code is in the csc229.dealership package:
https://github.com/natesuver/CSC229/tree/main/src/csc229/dealership

The code works, but your boss is annoyed that you are not adhering to proper object oriented principles in your design, and it is extremely difficult to maintain.
Without changing the function of the code (in other words, the output of the code when you are done should be the same output before you made changes), 
modify the class files to use a proper inheritance hierarchy.  
In some cases, you will want to use 2 or 3 levels of inheritance. 
Study the code to find opportunities to create appropriate base classes.  
Feel free to change the "toString()" methods to achieve output with as few lines of code as possible.

#### Notes:
1) You can download the code via git onto your computer, or just download the source code via a zip file.  
Use eclipse (or an editor of your choice) to make the changes.

2) You can fork the repo if you want, and work on it in your own account.  
You can also submit your work as a pull request, or just give me a link to your branch.

3) You can also submit the code via a zip file into the Microsoft teams assignment if you wish.
4) See me or Eric if you need help.

 * @param args
 */
	public static void main(String[] args) {
		ArrayList<Object> dealershipVehicles;
		dealershipVehicles = GetCurrentInventory();
		for (int i = 0; i < dealershipVehicles.size(); i++) {
			System.out.println(dealershipVehicles.get(i).toString());
			System.out.println();
			System.out.println();
		}
	}
	
	public static ArrayList<Object> GetCurrentInventory() {
		ArrayList<Object> inStockVehicles = new ArrayList<Object>();
		Audi myAudi = new Audi("A4", 2022, 45000.0, "Michelin", "Automatic", 150, "Bose", "Sport", 2022, 6.0, 18.5, 0.9, 30.0);
		Tesla myTesla = new Tesla("Model X", 2022, 90000.0, "Michelin", 250, "Bang & Olufsen", "Sport", 2022, 3.0, true, 4.0);
		Ford_F150 myTruck = new Ford_F150("XL", 2022, 35000.0, "Goodyear", "Automatic", 110, "Sony", "Standard", 2022, 6.0, 36.0, 18.0, 6.5, 12000);
		HarleyDavidson myBike = new HarleyDavidson("Road King", 2022, 25000.0, "Michelin", "Manual", 110, 2022, 4.0, 4.5, 35.0, "Classic");
		LateModelHonda myOldHonda = new LateModelHonda("Civic", 2002, 25000.0, "Bridgestone", "Automatic", 120, 2022, 4.5, 10.0, 40.0);
		LateModelToyota myOldToyota = new LateModelToyota("Camry", 2002, 8000.0, "Michelin", "Automatic", 125, 2022, 5.0, 12.0, 35.0);
		LateModelToyota myOldToyotaInBadShape = new LateModelToyota("Corolla", 2001, 6000.0, "Unknown", "Standard", 125, 2022, 5.0, 12.0, 3.0);
		
		inStockVehicles.add(myAudi);
		inStockVehicles.add(myTesla);
		inStockVehicles.add(myTruck);
		inStockVehicles.add(myBike);
		inStockVehicles.add(myOldHonda);
		inStockVehicles.add(myOldToyota);
		inStockVehicles.add(myOldToyotaInBadShape);
		return inStockVehicles;
	}
}
