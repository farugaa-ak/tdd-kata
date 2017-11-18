package pl.akademia.model;

public class ExampleClass {

    private static final String WOWOW="ASDASDAS";
    static {
        System.out.println("tworze klase");
    }

    public ExampleClass() {
        System.out.println("tworze obiekt");
    }


    public static void asd(){
        System.out.println("statyczna metoda");
    }

    public void asd2(){
        System.out.println("metoda instacji");
    }

}
