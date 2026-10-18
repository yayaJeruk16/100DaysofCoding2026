import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String hari = d.next();

        switch (hari.toLowerCase()) {
            case "senin" , "selasa" , "rabu", "kamis", "jumat":
                System.out.println("Hari kuliah");
                break;
            case "sabtu" , "minggu" :
                System.out.println("Hari libur");
                break;
            default:
                System.out.println("Hari anomali");
        }
    }
}
