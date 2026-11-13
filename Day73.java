
import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("""
                PILIH MENTOR
                1. Yaya
                2. Reigar
                3. Janah
            """);
            System.out.print("Pilih: ");
            int p = in.nextInt();

            switch (p) {
                case 1: 
                    System.out.println("Kamu memilih Yaya sebagai mentor!");
                    break;
                case 2: 
                    System.out.println("Kamu memilih Reigar sebagai mentor!");
                    break;
                case 3:
                    System.out.println("Kamu memilih Janah sebagai mentor!");
                    break;
                default:
                    System.out.println("Maaf hanya tersedia 3 mentor untuk saat ini");
                    return;
                

            }
            
        } while (true);
    }
}
