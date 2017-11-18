package pl.akademia.model.mp;

public class Man extends Human{

    Uniform uniform;

    public Man(Uniform uniform) {
        this.uniform = uniform;
    }

    public void showStrength(){
        System.out.println("I'm strength!!!!");
    }
}
