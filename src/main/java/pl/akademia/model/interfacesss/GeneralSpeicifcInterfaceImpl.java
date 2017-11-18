package pl.akademia.model.interfacesss;

public class GeneralSpeicifcInterfaceImpl implements GeneralInterface, SpecificInterface {
    @Override
    public void doSomethingGeneral() {

    }

    @Override
    public void theSame() {
        System.out.println("GeneralSpeicifcInterfaceImpl");
    }

    @Override
    public void doSomethingSpecifc() {

    }
}
