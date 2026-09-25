import java.util.Scanner;
public class Day024 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = inp.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = inp.nextDouble();
        
        //proses sekuensial dari cm ke m²
        double luasCm = panjang * lebar;
        double luasM = luasCm / 10000; //nah dsni langsunh saja 100 × 100 karena pangkat 2 (1 m = /100)
        
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luasM + " m²");
        
        
        
    }
    
}
