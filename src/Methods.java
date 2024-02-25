public class Methods {
    public static void main(String[] args) {
        // DRY
     int c = multiple(113,15);
        System.out.println(c);
    }

    public static int multiple(int a, int b) {
        return a * b;
    }
}
