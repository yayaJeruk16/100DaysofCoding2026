
import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int a = 1; a <= 5; a++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
