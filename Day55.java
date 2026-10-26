import java.util.Scanner;

public class Yaya2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n <= 10) {
            System.out.println("apala");
            return;
            //klo angkanya tdk valid otw keluar
        }

        for (int i = 1; i <= n; i++) {
            if (i == 11) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
