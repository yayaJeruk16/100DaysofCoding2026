import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String sandi = "";
        while (! sandi.equals("61207")) {
            System.out.print("Masukkan sandi yaya: ");
            sandi = in.nextLine();
        }
        System.out.println("Welcome iPad yaya");
    }
}
