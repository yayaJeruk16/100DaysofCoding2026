public class day84 {
    public static void main(String[] args) {
        int[] a = {5, 12, 3, 20, 8};

        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Angka maksimal: " + max);
    }
}
