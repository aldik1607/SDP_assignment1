
public class CarDirector {
    public Car construct(Builder builder){
        builder.setBrand("Toyota");
        builder.setModel("Camry");
        builder.setYear(2017);
        return builder.build();
    }

    public Car constructFromUser(Builder builder){
        builder.setBrand("Mercedes");
        builder.setModel("Benz");
        builder.setYear(2018);
        return builder.build();
    }

}
