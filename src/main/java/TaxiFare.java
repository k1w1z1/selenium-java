public class TaxiFare {
    // Write method to calculate taxi fare, based on the input kilometers
    // The first 1 kilometer is 13000
    // From 2nd to 10th kilometer, the fare is 10000
    // From 11th kilometer, the fare is 8000
    public static void main (String[] args) {
        System.out.println(getSum(1)); // 13k
        System.out.println(getSum(9)); // 93k
        System.out.println(getSum(15)); // 143k
        System.out.println(getSum(0)); // Invalid kilometer :(
    }
    public static float getSum(float km) {
        if (km <= 0){
            throw new IllegalArgumentException("Invalid kilometer :(");
        }
        float fare = 0;
        int firstKm = 13000;
        int between2to10Km = 10000;
        int after10Km = 8000;
        if (km <= 1) {
            fare += firstKm;
        } else if (km <= 10) {
            fare += firstKm + (km - 1) * between2to10Km;
        } else {
            fare += firstKm + 9 * between2to10Km + (km - 10) * after10Km;
        }
        return fare;
    }
}
