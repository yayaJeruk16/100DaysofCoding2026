import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("=== RESTORAN SUP DAENG FIKI ===");
        System.out.print("Jumlah porsi: ");
        String jp = in.nextLine();
    	int jp2 = Integer.parseInt(""+jp.charAt(0));
    	System.out.print("Total Kotor: Rp ");
    	int tK = in.nextInt();
    	System.out.print("Total Bersih: Rp ");
    	int tB = in.nextInt();
    	System.out.println("--------------------------");
    	
    	if(tK >= 100000 && tB < 85000 || jp2 >=5){
    		System.out.println("Status Promo: SELAMAT! Anda mendapatkan SUPER PROMO REGULER (DISKON 40%)!");
    	}else if(tB >= 60000){
    		System.out.println("Status Promo: SELAMAT! Anda mendapatkan PROMO REGULER (DISKON 15%)!");
    	}else{
    		System.out.println("Status Promo: TIDAK DAPAT DISKON DISKON (0%)!");
    	}
    	
    	
    	
        
}
    
}
