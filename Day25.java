import java.util.Scanner;
public class Day025 {
    public static void main(String[] args){
        
       Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nilai r: ");
        double r = inp.nextDouble();
        
        final double phi = 3.14;
        double luas = phi*r*r;
        
        System.out.println("Luas lingkaran = " + luas);
        
    }
}
