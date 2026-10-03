import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("tot_kata = ");
        int totalKata = in.nextInt();
        System.out.print("jum_salah = ");
        int jumlahSlh = in.nextInt();
        
        if (totalKata>=(40*5)&&jumlahSlh<=5){
            System.out.println("Hasil: Lolos Kualifikasi");
        } else {
            System.out.println("Hasil: Gagal");
        }
}
    
}
