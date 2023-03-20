import java.math.BigInteger;
import java.util.Arrays;

public class TestLinSort {
    public static void main(String[] args) {
        int testLen = 20;
        int[] a = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            a[i] = (int)Math.round(Math.random() * 20);
        }
        System.out.println("COUNT\n///////////////////////////////////////////////");
        System.out.println(Arrays.toString(a));
        LinSort.countSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println();
        int[] b = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            b[i] = (int)Math.round(Math.random() * 20);
        }
        System.out.println(Arrays.toString(b));
        LinSort.countSortForIndex(b,5,10);
        System.out.println(Arrays.toString(b));
        System.out.println("///////////////////////////////////////////////");
        System.out.println();

        System.out.println("LSD");
        System.out.println("///////////////////////////////////////////////");

        int[] c = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            c[i] = (int)Math.round(Math.random() * 20);
        }
        System.out.println(Arrays.toString(c));
        LinSort.lsdSort(c);
        System.out.println(Arrays.toString(c));
        System.out.println();

        int[] d = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            d[i] = (int)Math.round(Math.random() * 20);
        }
        System.out.println(Arrays.toString(d));
        LinSort.lsdSortForIndex(d,5,10);
        System.out.println(Arrays.toString(d));
        System.out.println("///////////////////////////////////////////////");
        System.out.println();

        System.out.println("MSD");
        System.out.println("///////////////////////////////////////////////");
        int[] e = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            e[i] = (int)Math.round(Math.random() * 9);
        }
        System.out.println(Arrays.toString(e));
        LinSort.msdSortForIndex(e,5,10);
        System.out.println(Arrays.toString(e));
        System.out.println();
        int[] f = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            f[i] = (int)Math.round(Math.random() * 9);
        }
        System.out.println(Arrays.toString(f));
        LinSort.msdSort(f);
        System.out.println(Arrays.toString(f));
    }
}
