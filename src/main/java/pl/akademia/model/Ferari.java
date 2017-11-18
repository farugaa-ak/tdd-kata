package pl.akademia.model;

import pl.akademia.model.finalexmple.NotFinal;
import pl.akademia.model.finalexmple.UseFinal;

public class Ferari implements Auto {
    public void jedz() {
        UseFinal notFinal = new UseFinal();
        notFinal.doSth();
    }
}
