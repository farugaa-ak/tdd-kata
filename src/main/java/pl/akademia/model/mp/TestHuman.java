package pl.akademia.model.mp;

public class TestHuman {
    public static void main(String[] args) {


        Uniform uniform = new Uniform();
        Man man = new Man(uniform);
        Human human = man;

        man.showStrength();
        man.breathe();

        man.uniform.beauty();



        human.breathe();

        Human onlyHuman = new Human();

    }

}
