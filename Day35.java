import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Pilih Daya (1=900 VA, 2=1300 VA): ");
    	int pD = in.nextInt();
    	System.out.print("Subsidi? (1=Ya, 2=Tidak): ");
    	int Sub = in.nextInt();
    	System.out.print("Pemakaian (kwh): ");
    	double pm = in.nextDouble();
    	
    	
    	if(pD == 1){
    		if (Sub == 1){
    			double totalTgh = pm * 605;
    			System.out.printf("""
    			--- RINCIAN TAGIHAN PLN ---
    			Daya Terminal   : 900 VA
    			Pemakaian       : %.1f kWh
    			Total Tagihan   : Rp %.1f 
    			""",pm,totalTgh);
    			
    		} else if(Sub == 2) {
    			if (pm <=100){
    				double totalTgh = pm * 605;
    		System.out.printf("""
    			--- RINCIAN TAGIHAN PLN ---
    			Daya Terminal   : 900 VA
    			Pemakaian       : %.1f kWh
    			Total Tagihan   : Rp %.1f 
    			""",pm,totalTgh);
    		
    			}
    		else if (pm > 100){
    				double totalTgh = pm * 1444;
    		System.out.printf("""
    			--- RINCIAN TAGIHAN PLN ---
    			Daya Terminal   : 900 VA
    			Pemakaian       : %.0f kWh
    			Total Tagihan   : Rp %.1f 
    			""",pm,totalTgh);
    		
    			}
    		
    		}
    	}
    	else if (pD == 2){
    				if (pm > 300){
    					double totalTgh = pm * 1444.70;
    		            totalTgh = totalTgh + (totalTgh * 0.1);
    		System.out.printf("""
    			--- RINCIAN TAGIHAN PLN ---
    			Daya Terminal   : 1300 VA
    			Pemakaian       : %.1f kWh
    			Total Tagihan   : Rp %.1f 
    			""",pm,totalTgh);
    		
    				}
    			}
    	
    
    	
}
    
}
