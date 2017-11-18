package pl.akademia;

import pl.akademia.model.Auto;
import pl.akademia.model.BMW;
import pl.akademia.model.ExampleClass;
import pl.akademia.model.Fiat;
import pl.akademia.model.VW;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ExampleClass.asd();

        new ExampleClass().asd2();
        new ExampleClass().asd2();


        Auto auto = new BMW();
        BMW bmw= new BMW();
        auto.jedz();
        bmw.bmwSpecifc();

        Auto auto1 = new Fiat();

        List<Auto> auta = new ArrayList<Auto>();

        auta.add(new Fiat());
        auta.add(new BMW());

        liskovSubstituionExample(auta);
    }

    private static void liskovSubstituionExample(List<Auto> auta) {
        for (Auto auto2 : auta) {
/*            if (auto2 instanceof BMW) {

            }*/

            auto2.jedz();
        }
    }

    public static void runnn(Auto auto){
        auto.jedz();
    }
}
