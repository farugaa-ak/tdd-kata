package pl.akademia;

public class StringCalculator {
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String[] split = s.split(",");

        int sum = 0;
        for (String s1 : split) {
            sum += Integer.valueOf(s1);
        }
        return sum;
    }
}
