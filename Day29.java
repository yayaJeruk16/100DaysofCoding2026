import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("harga = ");
        String harga = in.nextLine();
        System.out.print("Jumlah = ");
        String jumlah = in.nextLine();
        
        int harga2 = Integer.parseInt(harga);
        int jumlah2 = Integer.parseInt(jumlah);
        
        int total = harga2 * jumlah2;
        boolean status = total > 50000;
        boolean status2 = jumlah2 < 2;
        
        System.out.println("=== CEK KELAYAKAN DISKON ===");
        System.out.printf("Harga Buku : Rp %d%nJumlah Beli: %d%nTotal belanja : %d%n" ,harga2,jumlah2,total );
        System.out.printf("\f--- EVALUASI PERBANDINGAN --- %n Layak dapat Diskon?: %b%n Pembeliam sedikit?: %b" ,status,status2);
        
    }
    
}
