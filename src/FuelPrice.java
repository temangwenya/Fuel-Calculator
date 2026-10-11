
// Mock "API" method returning standard baseline rates

    public class FuelPrice {
        public static double distance = 0.0;
        public static double fetchFuelPrice(String fuelType) {
            final double petrol_price = 30.25; // Inland price per litre for 95 ULP
            final double diesel_price = 31.95; // Inland wholesale price for 500ppm diesel
            return fuelType.equalsIgnoreCase("petrol") ? petrol_price : diesel_price;
        }
    }


