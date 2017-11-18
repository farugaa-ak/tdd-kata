package pl.akademia.model.finallly;

public class Finallly {

    public static void main(String[] args) {
        try{
            System.out.println("11111");
            throw new RuntimeException();
        }finally {
            System.out.println("22222");
        }
    }

    public static Pair jakasMetoda(){
        return new Pair("napis", 123);
    }

    public static Object[] jakasMetoda2(){
        return new Object[]{ "napis", 123};
    }

    private static class Pair{
        String napis;
        Integer liczba;

        public Pair(String napis, Integer liczba) {
            this.napis = napis;
            this.liczba = liczba;
        }
    }
}
