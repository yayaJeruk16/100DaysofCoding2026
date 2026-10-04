import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi alas (meter): ");
        int ps = in.nextInt();
        System.out.print("Masukkan tinngi limas (meter): ");
        int tl = in.nextInt();
        
        double luas = ps*ps;
        double volume = luas*tl/3.0;
        
        String kategori;
        if(volume > 5000){
            kategori = "Skala Monumen Nasional";
        } else if(volume >= 1000){
            kategori = "Skala Monumen Kota";
        } else{
            kategori = "Skala Dekorasi Taman";
        }
        
        System.out.println("\n--- SPESIFIKASI MONUMEN ---");
        System.out.println("Luas Alas Monumen : " + luas + " m2");
        System.out.println("Volume Monumen    : " + volume + " m3");
        System.out.println("Kategori Skala    : " + kategori);
	
}
    
    
    
}
