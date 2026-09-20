import java.util.Scanner;
public class Scanner19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga: ");
        int harga = input.nextInt();
        System.out.print("Masukkan diskon: ");
        double diskon = input.nextDouble();
        
        //langsung konversi int nya saja ke double
        double potonganHarga = harga*(diskon/100);
        double hargaSetelahDiskon = harga-potonganHarga;
        
        int hargaAkhir = (int) + hargaSetelahDiskon;
        
        System.out.println("\nHarga awal\t: " + harga);
        System.out.println("Harga setelah diskon\t: " + hargaSetelahDiskon);
        System.out.println("Harga akhir\t: " + hargaAkhir);
    }
}
