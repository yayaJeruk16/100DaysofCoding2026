import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Gaji Pokok: ");
        double Gpokok = in.nextDouble();
        System.out.print("Tunjangan Jabatan: ");
        double Tjbtn = in.nextDouble();
        double Gkotor = Gpokok + Tjbtn , diskon = 0;
        String Ppjak = "6";
        
        if(Gkotor > 5000000){
            Ppjak = "(10%)";
            diskon = 0.1;
        }else{
            Ppjak = "(5%)";
            diskon = 0.05;
        }
        double jDiskon = Gkotor * diskon;
        double tAkhir = Gkotor - jDiskon;
        
        System.out.printf("""
        === PERHITUNGAN GAJI BERSIH ===
        Gaji Pokok  : Rp%.1f
        Tunjangan    : Rp%.1f
        -------------------
        Gaji Kotor : Rp%.1f
        Potongan Pajak%s: Rp%.1f
        -------------------
        Gaji Bersih : Rp%.1f
        """,Gpokok,Tjbtn,Gkotor,Ppjak,jDiskon,tAkhir);
}
    
}
