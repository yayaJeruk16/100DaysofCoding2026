
import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = 0;
        int angka = 0;
        while (angka >= 0) {
            jumlah += angka;
            angka = in.nextInt();
            
        }
        System.out.println(jumlah);
    }
}
