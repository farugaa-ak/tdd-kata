package pl.akademia.model.interfacesss;

public interface GeneralInterface {

    void doSomethingGeneral();


    default void theSame(){
        System.out.println("GeneralInterface theSame");
    }

}
