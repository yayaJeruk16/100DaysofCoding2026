public class Day22 {
    public static void main(String[] args){
        String kode = "500";
        int stok = 12;
    
        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.println("KodeBarang: " + kode);
        System.out.println("stokBarang: " + stok);
        
        int kode2 = Integer.parseInt(kode);
        String stok2 = String.valueOf(stok);
        
        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.println("kodeBarang: " + stok2 + 10);
        System.out.println("stokBarang: " + (kode2 + 10));
    }
    
}
