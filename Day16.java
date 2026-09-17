import java.util.Scanner;

public class LatihanDay16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam saat ini (0-23): ");
        int jam = input.nextInt();
        System.out.print("Berapa jam lagi dimulai?: ");
        int BerapaJamLagi = input.nextInt();
        
        int acaraMulai = (jam + BerapaJamLagi) % 24;
        System.out.println("Acara akan dimulai pada jam: " + acaraMulai);
    }
    
}
