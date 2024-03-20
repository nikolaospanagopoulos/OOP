public class Car {
    private String brand;
    private double price;
    private int topSpeed;
    public static int numberOfCarsCreated = 0;
    public Car(){
        this.brand = "unknown";
        this.price = 0;
        this.topSpeed = 0;
        numberOfCarsCreated++;
    }
    public Car(String brand,double price){
        this.brand = brand;
        this.price = price;
        numberOfCarsCreated++;
    }
    public static String  sayCarNumber(){
         //doesnt have access to this.
        return ("number of cars created is: "+numberOfCarsCreated);
    }
    public Car(String brand,double price, int topSpeed){
        this.brand = brand;
        this.price = price;
        this.topSpeed = topSpeed;
        this.startEngine();
        numberOfCarsCreated++;
    }
    private void startEngine(){

        System.out.println(this.brand+" starts");
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
