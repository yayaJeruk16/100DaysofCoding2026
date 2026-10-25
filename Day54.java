
import java.util.Scanner;

public class day54 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
