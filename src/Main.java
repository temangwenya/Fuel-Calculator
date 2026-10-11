/** !Feul Calculator
 * User enters diesel or petrol.
 * User enters distance in kms.
 * User enters fuel consumption rate (litres per 100kms).
 * Method fetches diesel/petrol price.
 * Method calculates diesel/petrol * kms.
 * Main returns fuel_type price.
*/

// Imports
import java.util.*;


public class Main {
// Global Objects & Variables
  // Objects
  public static Scanner scanner = new Scanner(System.in); 
  // Variables
  public static double distance;
  public static String fuel_type;
  public static double petrol_price;
  public static double diesel_price;
  public static double fuel_price;

    public static void main(String[] args) {
      // Greetings
      System.out.println("\n            Fuel Calculator:\n");

      // User Inputs
      System.out.print("Enter fuel type (diesel/petrol): ");
      fuel_type = scanner.nextLine().trim();
      System.out.print("Enter distance in kms: ");
      distance = scanner.nextDouble();
      System.out.print("Enter car fuel consumption (litres per 100km): ");
        double consumptionRate = scanner.nextDouble();
    
      // Running the calculations and displaying results
      System.out.println("\n------------------------------------------");
      try {
            // Ask FuelPrice for the fuel_type price
            double pricePerLitre = FuelPrice.fetchFuelPrice(fuel_type);

            // Create a Trip object with user inputs
            Trip myTrip = new Trip(fuel_type, distance, consumptionRate);

            // Ask the Trip object to calculate its own cost
            double totalCost = myTrip.calculateTotalCost(pricePerLitre);

            // Output Trip Fuel Cost Summary
            System.out.println("     --- Trip Fuel Cost Summary ---");
            System.out.println("Fuel Type: " + myTrip.getFuelType().toUpperCase());
            System.out.println("Price per Litre: R " + pricePerLitre);
            System.out.println("Estimated Total Cost: R " + String.format("%.2f", totalCost));
            
            // Output Additional Fuel Info
            System.out.println("\n------------------------------------------");
            String fuelInfo = FuelInfo.getFuelInfo(fuel_type); // Get additional fuel info
            System.out.println(fuelInfo); // Display additional fuel info
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
      }
    }





/** Where i got Fuel Info: 
Fuel SA - South African Fuel - Petrol and Diesel Data + API. 2026. Available from: https://www.fuelsa.co.za/.
*/
