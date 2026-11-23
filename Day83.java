public class day83 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            j += a[i];
        }
        System.out.println(j);
    }
}
