import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();
        
    if (nilai %3 ==0 && nilai %5==0){
        System.out.println("Angka " +nilai+ " adalah kelipatan 3 dan 5");
    }else if (nilai %5 ==0){
        System.out.println("Angka "+nilai+ " adalah kelipatan 5");
    }else if(nilai %3 == 0){
        System.out.println("Angka " +nilai+" adalah kelipatan 3");
    }else System.out.println("Angka "+nilai+ " bukan merupakan kelipatan 3,5 3 dan 5");
       
    }
}
    
