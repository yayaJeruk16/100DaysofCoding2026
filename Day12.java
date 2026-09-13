import java.util.Scanner;

public class Day12 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("BIODATA YAYA");
        
        System.out.print("Nama          : ");
        String nama = input.nextLine();
        
        System.out.print("Umur          : ");
        int umur = input.nextInt();
        
        System.out.print("Tinggi Badan  : ");
        double tb = input.nextDouble();
                    input.nextLine();
        System.out.print("Hobby         : ");
        String hobby = input.nextLine();
        
        System.out.print("Jenis Kelamin : ");
        char jk = input.next().charAt(0);
        
        
    }
    
}
