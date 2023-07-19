package day2;

public class TypeCasting {
    public static void main(String[] args) {
        int x = 100;
        long y = x;
        System.out.println(y);

        long a = 1023;
        int b = (int) a;
        System.out.println(b);

        float f = 123.45f;
        int g = (int) f;
        System.out.println(g);

        int h = 345;
        float i = h;
        System.out.println(i);
    }
}
