import java.util.Scanner;
public class Day21 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nama Mahasiswa: ");
        String a = inp.nextLine();
        System.out.print("Nilai Ujian: ");
        String b = inp.nextLine();
        System.out.print("Status Kelulusan: ");
        String c = inp.nextLine();
        
        double d = Double.parseDouble(b);
        boolean e = Boolean.parseBoolean(c);
        double f = d+5;
        
        System.out.println("=== LAPORAN NILAI MAHASISWA ===");
        System.out.println("Nama Mahasiswa\t: " + a);
        System.out.println("Nilai Akhir\t: " + f);
        System.out.println("Status Lulus\t: " + e);
        
    }
    
}
