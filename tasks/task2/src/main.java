public class main {
    public static void main(String[] args) {
        double a, b, c, d, e;
        a = 1;
        b = 10;
        c = 6;
        e = b + Math.sqrt((b * b) + 4 * a * c ) / (2 * a);
        d = e - (a * a * a) * c + 1 / (b * b);

        System.out.println("d = " + d);
    }
}