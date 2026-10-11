// Mock "API" method returning fuel type info

  public class FuelInfo {
    public static String getFuelInfo(String fuel_type) {
    if (fuel_type.equalsIgnoreCase("petrol")) {
      System.out.println("------- Additional Petrol Info -----------");
      String petrol_fuelInfo = "Reef\n" + //
                "Unleaded 95: R30.25\n" + //
                "LRP 93: R29.88\n" + //
                "Coast\n" + //
                "Unleaded 93: R29.09\n" + //
                "Unleaded 95: R29.38\n" + //
                "LRP 95: R29.38";
      return petrol_fuelInfo;

    } else if (fuel_type.equalsIgnoreCase("diesel")) {
      System.out.println("------- Additional Diesel Info -----------");
      String diesel_fuelInfo = "Reef\n" + //
                "50 PPM (0.005%): R32.79\n" + //
                "500 PPM (0.05%): R31.95\n" + //
                "Coast\n" + //
                "50 PPM (0.005%): R32.95\n" + //
                "500 PPM (0.05%): R31.08\n" + //
                "LRP 95: R29.38";
      return diesel_fuelInfo;
      
    } else {
      System.out.println("Invalid fuel type entered.");
      return "Invalid fuel type entered.";
    }
  }


}