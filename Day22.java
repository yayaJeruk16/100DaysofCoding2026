public class Day22 {
    public static void main(String[] args){
        String kode = "500";
        int stok = 12;
    
        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.println("KodeBarang: " + kode);
        System.out.println("stokBarang: " + stok);
        
        String kode2 = kode + "10";
        int stok2 = stok + 10;
        
        int kode3 = Integer.parseInt(kode2);
        String stok3 = String.valueOf(stok2);
        
        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.println("kodeBarang: " + stok3);
        System.out.println("stokBarang: " + kode3);
    }
    
}
