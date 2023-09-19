package day19;

class Pair {
    int x;
    int y;

    Pair () {
        x = 10;
        y = 20;
    }

    Pair (int v1, int v2) {
        x = v1;
        y = v2;
    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        Pair p1 = new Pair();
        System.out.println(p1.x);
        System.out.println(p1.y);

        Pair p2 = new Pair(100, 200);
        System.out.println(p2.x);
        System.out.println(p2.y);
    }
}
