public class CarBuilder implements Builder {
    private String brand;
    private String model;
    private int year;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }
    public Car build() {
        return new Car(brand, model, year);
    }
}
