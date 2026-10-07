import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    
    if(a > 0){
        if(a % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }else{
        System.out.println("error");
    }
    
}
}
