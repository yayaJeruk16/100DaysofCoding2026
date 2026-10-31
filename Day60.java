import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            jumlah = jumlah + i;
        }
        System.out.println();
        System.out.print("Jumlah = " + jumlah);
    }
}
