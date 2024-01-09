public class auto {

    public int tankSize = 40;
    public double consumption = 6.2;

    protected double maxSpeed = 220.0;
    protected double speed = 100;

    private String licensePlate = "WENF975";
    private String color = "Blau";
    private String driver = "Xhuljan";

    private int distanceTraveled;

    public AutoKlasse(){}

    public void setTankSize(int tankSize){
        this.tankSize =tankSize;
    }
    public int getTankSize(){
        return this.tankSize;
    }

    public void setConsumption(int consumption){
        this.consumption =consumption;
    }
    public double getConsumption(){
        return this.consumption;
    }

    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setDriver(String color){
        this.driver = driver;
    }
    public String getDriver(){
        return this.driver;
    }

    public void setDistanceTraveled(int distanceTraveled){
        this.distanceTraveled = distanceTraveled;
    }
    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

    public void printAuto(){
        System.out.println("Tank Size: " + getTankSize() + " L");
        System.out.println("Consumption: " + getConsumption() + " L/100 Km/h");
        System.out.println("Max Speed: " + getMaxSpeed()+ " Km/h ");
        System.out.println("Speed: " + getSpeed()+ " Km/h ");
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Color: " + getColor());
        System.out.println("Driver: " + getDriver());
    }


    public double calculateDistance( double time){
        return speed * time;
    }
    public double calculateFuelConsumption(double distanceTraveled){
        return ( distanceTraveled * consumption) / 100.0;
    }
}
