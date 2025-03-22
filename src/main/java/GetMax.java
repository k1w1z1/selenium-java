public class GetMax {
    // Write method to find the biggest number from the 3 input numbers
    public static void main(String[] args) {
        System.out.println(getMax(1, 0, 0));
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(2, 1, 1));
    }

    public static int getMax(int a, int b, int c) {
        int assumeMax = a;
        if (b > assumeMax) {
            assumeMax = b;
        }
        if (c > assumeMax) {
            assumeMax = c;
        } return assumeMax;
    }
}
