public class day85 {
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1, 9};

        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Angka minimal: " + min);
    }
}
