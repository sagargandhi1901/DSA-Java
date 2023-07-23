package day3;

public class FloatDouble {
    public static void main(String[] args) {

        float f = 56.8f;
        double d = f;
        System.out.println(f);
        System.out.println(d);

        float f1 = 1000000 * 1000000;
        System.out.println(f1);

        double d1 = 108 / 34;
        System.out.println(d1);

        double d2 = 108 / 34.8;
        System.out.println(d2);

        double d3 = 123.45;
        float f2 = (float) d3;
        System.out.println(f2);
    }
}
