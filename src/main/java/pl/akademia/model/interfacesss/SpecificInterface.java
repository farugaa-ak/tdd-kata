package pl.akademia.model.interfacesss;

public interface SpecificInterface {

    void doSomethingSpecifc();

    default void theSame(){
        System.out.println("SpecificInterface theSame");
    }

}
