import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jari-jari taman (meter): ");
        double r = in.nextDouble();
        
        final double PI = 3.141591111111;
        double l = PI * r * r;
        double kel = 2 * PI * r;
        double tAwal = l * 150000;
        double diskon = 0;
        String Ddskon = "";
        
        if(tAwal >= 50000000){
            Ddskon = "(10%)";
            diskon = tAwal * 0.1;
        }else if(tAwal >= 20000000){
            Ddskon = "(5%)";
        diskon = tAwal * 0.05;
        }else{
            Ddskon = "(0)";
            diskon = 0;
        }
        double tAkhir = tAwal - diskon;
        
        System.out.printf("""
        --- RINCIAN BIAYA RENOVASI ---
        Keliling Lapangan\t: %.2f m
        Luas Lapangan\t\t: %.2f m2
        Total Biaya Awal\t: Rp%,.2f
        Diskon%s\t\t\t: Rp%,.2f
        Total Biaya Akhir\t: Rp%,.2f
        """ , kel, l, tAwal, Ddskon, diskon, tAkhir);
}
    
}
