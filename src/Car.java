public class Car {
    private final String brand ;
    private final String model;
    private final int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year;
    }


}
