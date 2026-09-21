import java.util.Scanner;
public class Day20 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        String str2 = String.valueOf(a);
        String str3 = str2.repeat(2);
        
        //untuk hitung panjang
        int panjang = str3.length();
        
        System.out.println("Hasil String: " + str3);
        System.out.println("Panjang teks: " + panjang);
    }
}
