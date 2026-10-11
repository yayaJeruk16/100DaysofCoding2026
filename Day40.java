import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("""
        === PEMBELIAN TIKET BIOSKOP ===
        1. Regular - Rp40000
        2. Sweetbox - Rp60000
        3. VIP   - Rp90000
        """);
        System.out.print("Pilih kategori (1-3): ");
        int ktg = in.nextInt();
        System.out.print("Jumlah tiket: ");
        int jml = in.nextInt();
        double dsk = 0 , hrg = 0 , hrg1 = 0;
        
        if(ktg == 1){
            System.out.println("Kategori  : Regular");
            hrg = 40000;
             hrg1 = hrg * jml;
            if(hrg1 >= 150000){
                dsk = 0.15;
            }else{
                dsk = 0;
            }
        }else if(ktg == 2){
            System.out.println("Kategori  : Sweetbox");
        hrg = 60000;
         hrg1 = hrg * jml;
            if(hrg1 >= 150000){
                dsk = 0.15;
            }else{
                dsk = 0;
            }
        }else if(ktg == 3){
            System.out.println("Kategori  : VIP");
        hrg =90000;
         hrg1 = hrg * jml;
            if(hrg1 >= 150000){
                dsk = 0.15;
                
            }else{
                dsk = 0;
            }
        }
        double Diskon = hrg1 * dsk;
        double tAkhir = hrg1 - Diskon;
        
        System.out.printf("""
        Harga   : Rp%.0f
        Jumlah   : %d
        Total   : Rp%.0f
        Diskon   : Rp%.0f
        Total Bayar: Rp%.0f
        """, hrg, jml, hrg1, Diskon, tAkhir);
}
    
}
