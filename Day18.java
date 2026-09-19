public class Day18 {
    public static void main(String[] args){
        byte a = 6;
        int b = a; //ini otomatis bisa yaa jadi aman
        System.out.println(b);
        
        int c = 389;
        byte d = (byte)c; //kalau ini namanya konversi paksa
        System.out.println(d);
        
        /* int e = 389
        byte f = e; //nah kalau ini eror karna nilai tipe data int ga muat ke tipe data byte
        System.out.println(f);
        
    }
}
