package csc229.dealership;

import java.util.ArrayList;

public class InventoryPrinter {

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
		LateModelHonda myOldHonda = new LateModelHonda("Civic", 2022, 25000.0, "Bridgestone", "Automatic", 120, 2022, 4.5, 10.0, 40.0);
		LateModelToyota myOldToyota = new LateModelToyota("Camry", 2022, 28000.0, "Michelin", "Automatic", 125, 2022, 5.0, 12.0, 35.0);
		
		inStockVehicles.add(myAudi);
		inStockVehicles.add(myTesla);
		inStockVehicles.add(myTruck);
		inStockVehicles.add(myBike);
		inStockVehicles.add(myOldHonda);
		inStockVehicles.add(myOldToyota);
		return inStockVehicles;
	}
}
