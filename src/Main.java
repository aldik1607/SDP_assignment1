
public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        Car car = director.construct(carBuilder);
        System.out.println(car);


        Car userCar = director.constructFromUser(carBuilder);
        System.out.println(userCar);
    }
}