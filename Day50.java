import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Harga Satuan : Rp");
        double harga = in.nextDouble();
        System.out.print("Jumlah Beli  : ");
        double jumlah = in.nextDouble();
        double totalAwal = harga * jumlah;
        
        double total = (totalAwal >= 100000) ? totalAwal * 0.1 : totalAwal * 0;
        double totalBayar = totalAwal - total;
        System.out.printf("""
            Total Awal    : Rp%.0f
            Diskon (10%%)  : Rp%.0f
            Total Bayar   : Rp%.0f
            """, totalAwal, total, totalBayar);



        

    }
}
