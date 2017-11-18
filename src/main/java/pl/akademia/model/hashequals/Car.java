package pl.akademia.model.hashequals;

import pl.akademia.model.Auto;
import pl.akademia.model.BMW;
import pl.akademia.model.finalexmple.FinalExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Car {

    private String name;
    private String price;

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


    public static void main(String[] args) {
        Car car = new Car("asdas", "asdasdas");
        System.out.println(car.hashCode());
        Car car1 = new Car("asdas2", "asdasdas");
        System.out.println(car1.hashCode());

        //contract
        if (car.equals(car1)) {
            if (car.hashCode() == car1.hashCode()) {
                //always true
            }
        }


        Map<Car, String> carStringMap = new HashMap<>();

        carStringMap.put(car1, "one");
        carStringMap.put(car, "second");

        System.out.println(carStringMap.get(car1)); //one
        System.out.println(carStringMap.get(car));  //second

        ArrayList<String> napisy = new ArrayList<String>() {{
            add("Napis");
        }};


        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");
        System.out.println("sdfsdfsdfsdfsdf");

        for (int i = 0; i < 100000; i++) {
            System.out.println("sdfsdfsdfsdfsdf");
        }

        DAYS monday = DAYS.MONDAY;


        //reference
        BMW bmw = new BMW();
        System.gc();

        bmw = null;
        System.gc();


    }

    public String find(FinalExample finalExample){
        return "asd";
    }

    public String find(Auto auto){
        return "auto";
    }
}
