
public class array2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            total += a[i];
        }
        System.out.println();
        System.out.println(total);

    }
}
