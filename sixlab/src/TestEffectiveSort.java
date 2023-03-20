//Иванчиков Василий Александрович ККСО-02-20
import java.util.Arrays;
import java.util.Random;

public class TestEffectiveSort {
    public static void main(String[] args) {
        int testLen = 100;
        int[] array1 = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            array1[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println("quick\n///////////////////////////////////////////////");
        System.out.println(Arrays.toString(array1));
        EffectiveSort.heapSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        int[] array2 = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            array2[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array2));
        EffectiveSort.quickSortSimple(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        Random random = new Random();
        Double[] array3 = new Double[testLen];
        for (int i = 0; i < testLen; i++) {
            array3[i] = random.nextDouble(100);
        }
        System.out.println(Arrays.toString(array3));
        EffectiveSort.quickSortForIndexG(array3, 10 ,20);
        System.out.println(Arrays.toString(array3));
        System.out.println("///////////////////////////////////////////////");
        System.out.println();

        System.out.println("heap");
        int[] array4 = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            array4[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array4));
        EffectiveSort.heapSort(array4);
        System.out.println(Arrays.toString(array4));
        System.out.println();

        int[] array41 = new int[testLen];
        for (int i = 0; i < 20; i++) {
            array41[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array41));
        EffectiveSort.heapSortForIndex(array41,5,10);
        System.out.println(Arrays.toString(array41));
        System.out.println();

        Double[] array9 = new Double[testLen];
        for (int i = 0; i < testLen; i++) {
            array9[i] = random.nextDouble(100);
        }
        System.out.println(Arrays.toString(array9));
        EffectiveSort.heapSortG(array9);
        System.out.println(Arrays.toString(array9));
        System.out.println();


        System.out.println("merge\n///////////////////////////////////////////////");
        int[] array5 = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            array5[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array5));
        EffectiveSort.mergeSortSimple(array5);
        System.out.println(Arrays.toString(array5));
        System.out.println();

        int[] array6 = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            array6[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array6));
        EffectiveSort.mergeSortForIndex(array6, 5 , 10);
        System.out.println(Arrays.toString(array6));
        System.out.println();

        Double[] array7 = new Double[testLen];
        for (int i = 0; i < testLen; i++) {
            array7[i] = random.nextDouble(100);
        }
        System.out.println(Arrays.toString(array7));
        EffectiveSort.mergeSortGeenForIndex(array7, 5 , 10);
        System.out.println(Arrays.toString(array7));
        System.out.println("///////////////////////////////////////////////");

        int[] array13 = new int[]{1,2,3,4,1,2,6,10};
        EffectiveSort.MyFunc(array13);
        int[] array14 = new int[]{1,2,3,4,5,6,7,8};
        EffectiveSort.MyFunc(array14);
    }
}
