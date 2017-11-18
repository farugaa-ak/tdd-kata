package pl.akademia.model.finalexmple;

import pl.akademia.model.Auto;
import pl.akademia.model.BMW;

public final class FinalExample {

    private static final String MY_CONSTANT="CONSTANT";
    private static String MY_CONSTANT_2 ="CONSTANT";

    private final String finalInstanceString;
    String instanceString;

    public FinalExample(String finalInstanceString) {
        this.finalInstanceString = finalInstanceString;
    }


    public static void main(String[] args) {
        //variables
        //MY_CONSTANT ="ASDA";
        MY_CONSTANT_2 ="ASDA";

        final Auto auto = new BMW();
        Auto auto2 = new BMW();

        auto2= auto;

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                auto.jedz();
            }
        };

        Thread thread = new Thread(() ->
                auto.jedz()
        );

        thread.start();

    }
}
