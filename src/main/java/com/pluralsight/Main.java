

package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create an ArrayList to store assets
        ArrayList<Asset> assets = new ArrayList<>();

        // Create two houses
        House house1 = new House(
                "Family Home",
                "2020-05-15",
                new BigDecimal("350000"),
                "123 Main Street",
                1,
                2000,
                8000
        );

        House house2 = new House(
                "Rental Property",
                "2018-08-20",
                new BigDecimal("250000"),
                "456 Oak Avenue",
                3,
                1500,
                6000
        );

        // Create two vehicles
        Vehicle vehicle1 = new Vehicle(
                "Family Car",
                "2022-03-10",
                new BigDecimal("30000"),
                "Toyota Camry",
                2022,
                45000
        );

        Vehicle vehicle2 = new Vehicle(
                "Work Truck",
                "2015-06-12",
                new BigDecimal("40000"),
                "Ford F-150",
                2015,
                120000
        );

        Cash cash = new Cash(
                "Emergency Cash",
                "2026-11-22",
                new BigDecimal("5000.00")
        );
        System.out.println("Cash Value: $" + cash.getValue());


        // Add everything to the ArrayList
        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        // Display all assets
        for (Asset asset : assets) {

            System.out.println("----------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Display additional information based on asset type
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());

            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }
        }

    }
}
