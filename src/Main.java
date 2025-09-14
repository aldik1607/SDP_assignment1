
public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        Car car = director.createCar(carBuilder);
        System.out.println(car);

        Car car1 = director.createUserCar(carBuilder);
        System.out.println(car1);


    }
}