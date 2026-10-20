import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int nilai = d.nextInt();

        String y = nilai >= 95 ? "Lulus" : "Nice try";
        System.out.println(y);
    }
}
