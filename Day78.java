
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("== DAFTAR AKUN YAYA ==");
            System.out.print("Buat Username dulu sini: ");
            String usn = in.nextLine();
            System.out.print("Buat Password sini: ");
            String pss = in.nextLine();

            System.out.println("DONE!");
            System.out.println("SILAHKAN LOGIN YAYA!");

            while (true) {
                System.out.print("Masukkan Username: ");
                String user = in.nextLine();
                System.out.print("Masukkan Password: ");
                String pw = in.nextLine();

                if(user.equals(usn) && pw.equals(pss)){
                    System.out.println("Login Berhasil! Selamat Datang " + user + "!");
                    break;
                }else{
                    System.out.println("Username atau Password yang anda masukkan salah! Silahkan coba lagi.");
                }
            }

    }
}
