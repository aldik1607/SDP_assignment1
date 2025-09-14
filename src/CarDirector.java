
public class CarDirector {
    public Car createCar(Builder builder){
        builder.setBrand("Toyota");
        builder.setModel("Camry");
        builder.setYear(2017);
        return builder.build();
    }

    public Car createUserCar(Builder builder){
        builder.setBrand("Mercedes");
        builder.setModel(null);
        builder.setYear(2018);
        return builder.build();
    }

}
