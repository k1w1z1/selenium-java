public class MultiplicationTable {
    // Write method to print multiplication table from 1 to 10
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Bang Cuu Chuong %d\n", i );
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            } System.out.println("===================================");
        }
    }
}
