import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = in.nextInt();

        switch(menu){
            case 1:
            System.out.println("YAYA TIDUR");
            break;
            case 2:
            System.out.println("YAYA BANGUN");
            break;
            case 3:
            System.out.println("YAYA BERGERAK");
            break;
            default:
            System.out.println("YAYA LAGI TIDAK ADA");
            break;   

        }

    }
}
