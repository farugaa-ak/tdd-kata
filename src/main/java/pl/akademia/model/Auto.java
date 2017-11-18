package pl.akademia.model;

public interface Auto {

    void jedz();

    default public void showSthReal(){
        System.out.println("sth real");
    }

}
