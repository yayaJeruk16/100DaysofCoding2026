import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
            === MENU RESTORAN ===
            1. Paket A = Rp25.000
            2. Paket B = Rp35.000
            3. Paket C = Rp45.000 
                """);

                System.out.print("Pilih paket: ");
                char p = in.next().charAt(0);
                System.out.print("Jumlah: ");
                double j =  in.nextDouble();
                double diskon = 0.1 , tH = 0 , tD = 0 , tB = 0 , hrg = 0;

                if(p == 'A'){
                    hrg = 25000;
                    tH = j * hrg;
                    if(tH >= 100000){
                        tD = (tH * diskon);
                        tB = tH - tD;
                    }else{
                        tD = 0;
                        tB = tH;
                        
                    }
                }
                else if(p == 'B'){
                    hrg = 35000;
                    tH = j * hrg;
                    if(tH >= 100000){
                        tD = (tH * diskon);
                        tB = tH - tD;
                    }else{
                        tD = 0;
                        tB = tH;

                    }
                }
                else if(p == 'C'){
                    hrg = 45000;
                    tH = j * hrg;
                    if(tH >= 100000){
                        tD = (tH * diskon);
                        tB = tH - tD;
                    }else{
                        tD = 0;
                        tB = tH;

                    }

                }else{
                    System.out.println("Paket tidak tersedia");
                    return;
                }
                System.out.printf("""
                        Paket\t\t: %c
                        Harga\t\t: Rp%.0f
                        Jumlah\t\t: %.0f
                        Total\t\t: Rp%.0f
                        Diskon\t\t: Rp%.0f
                        Total Bayar\t: Rp%.0f
                        """,p,hrg,j,tH,tD,tB);

        
    }

}

