import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Masukkan password baru: ");
        int pasBaru = in.nextInt();
        int pasLama = 737;
        
        boolean status = pasLama != pasBaru;
        System.out.println(status);
}
    
}
