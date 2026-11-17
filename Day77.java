

public class day77 {
    public static void main(String[] args) {
       String y = "Yaya Suka Jeruk";

       System.out.println(y.length());
        System.out.println(y.toLowerCase());
        System.out.println(y.toUpperCase());
        System.out.println(y.equals("Yaya Suka Jeruk"));
        System.out.println(y.equalsIgnoreCase(y));
        System.out.println(y.contains(""));
        System.out.println(y.isEmpty());
        System.out.println(y.substring(5,15));
        System.out.println(y.replace("Jeruk", "BuahNaga" ));
        System.out.println(y.trim());
    }
}
