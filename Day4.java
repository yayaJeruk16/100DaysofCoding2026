public class day4 {
    public static void main(String[] args){
        System.out.println("\"Penggunaan tipe data numerik bilangan bulat, byte, short, int, dan long\"\n");
        byte nilai = 99; //byte ini sifatnya cuma menerima 127 angka, tau batasan ye
        byte skor = 100 ;
        short JumlahPeserta = 20000; //nah kalau short itu menerima atau cuma bisa menggunakan 32.767 angka
        int HadiahTunai = 200000000; //kalau int banyak, bisa sampai 2.1 Miliar wuaww (mungkin ye)
        long HargaLaptop = 3000000000L; //long apalagi, menerima angka sampai dengan 9.2 Triliun (kayaknya)
        
        System.out.println("NilaiUjianYaya: " + nilai);
        System.out.println("Dengan skor: " + skor);
        System.out.println("Bersaing dengan jumlah peserta: " + JumlahPeserta);
        System.out.println("Mendapatkan Hadiah Tunai Senilai: " + HadiahTunai);
        System.out.println("Lumayan untuk nambahin tabungan untuk beli laptop yang harganya senilai: " + HargaLaptop);
        
    }
    
}
