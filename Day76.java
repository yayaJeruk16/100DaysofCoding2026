
import java.util.Scanner;

public class hihi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        if(n.isEmpty()){
            System.out.println("Nama tidak boleh kosong!");
        }else{
            System.out.println("Halo, " + n + "!");
        }

    

    }
}
