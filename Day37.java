import java.util.Scanner;
public class Day37 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        if(a > 0){
            System.out.println("positif");
        }else if(a < 0){
            System.out.println("negatif");
        }else{
            System.out.println("nol");
        }
    }
    
}
