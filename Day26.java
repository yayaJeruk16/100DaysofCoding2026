import java.util.Scanner;
public class Day26 {
    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
    	int tahunLahir = inp.nextInt();
    	int tahunSkr = inp.nextInt();
    	
    	int umur = tahunSkr-tahunLahir;
    	System.out.println(umur + " Tahun");
}
    
}
