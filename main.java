
public class Main {
    public static void main(String[] args) {

        AutoKlasse autoKlasse1 = new AutoKlasse();
        autoKlasse1.printAuto();

        double time = 10;
        double distanceTraveled = autoKlasse1.calculateDistance(time);
        double fuelConsumption = autoKlasse1.calculateFuelConsumption(distanceTraveled);


        System.out.println("Calculated Distance Traveled: " + distanceTraveled + " km");
        System.out.println("Calculated Fuel Consumption: " + fuelConsumption + " L");
    }
}
