public class day86 {
    public static void main(String[] args) {
        //mengakses
        int[] a = {30, 20, 10, 22};
        System.out.println(a[1]);
        //mengubah
        a[2] = 59;
        //menambahkan
        int[] b = new int [a.length+1];
        System.out.println(b.length);
        //menghapus
        int[] c = new int [a.length-1];
        System.out.println(c.length);
        //mencari elemen
        System.out.println(a[2]);
        //membalik urutan
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+ " ");
            
        }
        

    }
  }
