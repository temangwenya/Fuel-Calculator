// This class encapsulates the data about a specific trip (distance, consumption, fuel type) and handles the math for that specific trip.

public class Trip {
    // Fields belonging to the Trip
    private String fuelType;
    private double distance;
    private double consumptionRate;

    // Constructor (Used to initialize the trip object with user data)
    public Trip(String fuelType, double distance, double consumptionRate) {
        this.fuelType = fuelType;
        this.distance = distance;
        this.consumptionRate = consumptionRate;
    }

    // Calculates the total cost using its own stored data
    public double calculateTotalCost(double pricePerLitre) {
        double totalLitres = (distance / 100.0) * consumptionRate;
        return totalLitres * pricePerLitre;
    }

    // Getter for fuel type if we need to display it later
    public String getFuelType() {
        return fuelType;
    }

}
