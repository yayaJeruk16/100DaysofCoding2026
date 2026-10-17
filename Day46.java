
import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== SELAMAT DATANG DI KANTIN DELICIOUS===");
        System.out.print("Masukkan Nama Pemesan: ");
        String nama = in.next();
        System.out.println("""
            Pilih Kategori Menu:
            [M] Makanan
            [D] Minuman""");
        System.out.print("Masukkan pilihan kategori (M/D): ");
        char kategori = in.next().charAt(0);
        int noMenu = 0, jumlah = 0;
        double harga = 0;
        String menu = "";

        switch (kategori){
            case 'M':
                System.out.println("""
                    \n--- MENU MAKANANAN ---
                    1. Nasi Goreng Spesial - Rp 25.000
                    2. Ayam Bakar Madu - Rp 30.000
                    3. Mie Goreng Seafood - Rp 22.000""");
                System.out.print("Masukkan nomor pilihan makanan (1-3): ");
                noMenu = in.nextInt();
                switch (noMenu){
                    case 1:
                        menu = "Nasi Goreng Spesial";
                        harga = 25000;
                        break;
                    case 2:
                        menu = "Ayam Bakar Madu";
                        harga = 30000;
                        break;
                    case 3:
                        menu = "Mie Goreng Seafood";
                        harga = 22000;
                        break;
                    default:
                        System.out.println("Nomor menu tidak valid");
                        return;
                }
                System.out.print("Masukkan jumlah porsi: ");
                jumlah = in.nextInt();
                break;
            case 'D':
                System.out.println("""
                    \n--- MENU MINUMAN ---
                    1. Es Teh Manis - Rp 5.000
                    2. Jus Jeruk Segar - Rp 10.000
                    3. Air Mineral - Rp 4.000""");
                System.out.print("Masukkan nomor pilihan minuman (1-3): ");
                noMenu = in.nextInt();
                switch (noMenu){
                    case 1:
                        menu = "Es Teh manis";
                        harga = 5000;
                        break;
                    case 2:
                        menu = "Jus Jeruk Segar";
                        harga = 10000;
                        break;
                    case 3:
                        menu = "Air Mineral";
                        harga = 4000;
                        break;
                    default:
                        System.out.println("Nomor menu tidak valid");
                        return;
                }
                System.out.print("Masukkan jumlah gelas: ");
                jumlah = in.nextInt();
                break;
        }
        double total = harga * jumlah;
        System.out.println("===========================================");
        System.out.printf("""
                \tSTRUK PESANAN ANDA
                -------------------------------------------------------------
                Nama Pemesan  : %s
                Menu Dipilih  : %s
                Harga Satuan  : Rp %,.0f
                Jumlah porsi  : %d
                -----------------
                Total Harga\t\t: Rp %,.0f
                ===============================
                Terima kasih atas pemesanan Anda!
            """ , nama, menu, harga, jumlah, total);




    }
    
}
