package pl.akademia.model.finalexmple;

import pl.akademia.model.BMW;
import pl.akademia.model.hashequals.Car;
import pl.akademia.model.hashequals.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class UseFinal extends NotFinal {

    transient Map<String, String> maps = new ConcurrentHashMap<>();

    List<String> multiThreadedList = new CopyOnWriteArrayList();
     Set<String> multTHreadedSet =  new CopyOnWriteArraySet();

    @Override
    public void doSth(){
        //functional programming
        Supplier<String> sup = () -> "asd";

        Consumer<String> cons = s -> {};

        Function<Car, BMW> asd = car -> {

            return new BMW();
        };

        //lambda

        AnonymousClass anonymousClass = x -> "jedna";

        AnonymousClass anonymousClass2 = x -> "drugarzecz";


        super.doSth();
    }


    public static void main(String[] args) {
        List<Car> cars =new ArrayList<>();
        cars.add(new Car("panda", "99"));
        cars.add(new Car("maluch", "9fd9"));
        cars.add(new Car("polonez", "df99"));
        cars.add(new Car("", "df99"));

        List<Vehicle> vehicles = cars.stream()
                .filter(car -> !car.getName().isEmpty())
                .map(car -> new Vehicle(car.getName()))
                .collect(Collectors.toList());


        System.out.println(vehicles);


    }



}
