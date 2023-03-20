//Иванчиков Василий Александрович ККСО-02-20
import java.util.Arrays;

public class TestSimpleSort {
    public static void main(String[] args) {
        int[] a = new int[]{14,32,1,2,7,5,19};
        SimpleSort.simpleBubble(a);
        System.out.println(Arrays.toString(a));
        int[] b = new int[]{14,32,1,7,2,5,19};
        SimpleSort.simpleBubbleForIndex(b, 2,4);
        System.out.println(Arrays.toString(b));
        System.out.println();

        Double[] c = new Double[] {100.1, 3.0, -1.98, 69.25, 14.69, 11.96, 6.38, -12.124};
        SimpleSort.bubbleG(c);
        System.out.println(Arrays.toString(c));
        Double[] d = new Double[] {100.1, 3.0, -1.98, 69.25, 14.69, 11.96, 6.38, -12.124};
        SimpleSort.bubbleGenForIndex(d, 2 , 5);
        System.out.println(Arrays.toString(d));
        System.out.println();

        Character[] e = new Character[]{'2','1','W','Q','R','3'};
        SimpleSort.bubbleG(e);
        System.out.println(Arrays.toString(e));
        Character[] f = new Character[]{'2','1','W','Q','R','3'};
        SimpleSort.bubbleGenForIndex(f, 2 , 4);
        System.out.println(Arrays.toString(f));
        System.out.println();

        int[] g = new int[]{14,32,1,2,7,5,19};
        SimpleSort.simpleSelection(g);
        System.out.println(Arrays.toString(g));
        int[] h = new int[]{14,32,7,2,1,5,19};
        SimpleSort.simpleSelectionForIndex(h, 2, 5);
        System.out.println(Arrays.toString(h));
        System.out.println();

        Character[] j = new Character[]{'2','1','W','Q','R','3'};
        SimpleSort.selectionG(j);
        System.out.println(Arrays.toString(j));
        Character[] k = new Character[]{'2','1','W','Q','R','3'};
        SimpleSort.selectionGeenForIndex(k, 2,4);
        System.out.println(Arrays.toString(k));
        System.out.println();

        int[] l = new int[]{14,32,7,2,1,5,19};
        SimpleSort.simpleInsertionForIndex(l,2,5);
        System.out.println(Arrays.toString(l));
        int[] z = new int[]{14,32,1,2,7,5,19};
        SimpleSort.simpleInsertion(z);
        System.out.println(Arrays.toString(z));
        System.out.println();

        Character[] x = new Character[]{'2','1','p','Q','R','3'};
        SimpleSort.insertionG(x);
        System.out.println(Arrays.toString(x));
        Character[] v = new Character[]{'2','1','W','Q','R','3'};
        SimpleSort.insertionGeenForIndex(v, 2,4);
        System.out.println(Arrays.toString(v));
        System.out.println();

    }
}

