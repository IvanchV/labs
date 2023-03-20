import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class LinSort {

    public static void countSort(int[] array){
        countSortForIndex(array, 0, array.length -1);
    }

    public static void countSortForIndex(int[] array, int indexLeft, int indexRight) {
        int[] tmp = new int[indexRight - indexLeft + 1];
        System.arraycopy(array, indexLeft, tmp, 0, tmp.length);
        int max = Arrays.stream(tmp).max().getAsInt();
        int[] count = new int[max + 1];
        for (int k : tmp) {
            count[k] = count[k] + 1;
        }
        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                tmp[arrayindex] = i;
                arrayindex++;
            }
        }
        System.arraycopy(tmp, 0, array, indexLeft, tmp.length);
    }

    static void countingSortForLsd(int[] array, int s) {
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++){
            count[(array[i] / s) % 10]++;
        }
        for (int i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
        int[] outputArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            outputArray[--count[(array[i] / s) % 10]] = array[i];
        }
        System.arraycopy(outputArray, 0, array, 0, array.length);
    }


    public static void msdSort(int[] array) {
        msdSortForIndex(array, 0, array.length - 1);
    }



    public static void msdSortForIndex(int[] array, int indexLeft, int indexRight) {
        ArrayList<ArrayList<Integer>> radixArray = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            radixArray.add(new ArrayList<>());
        }

        int max = -1;

        for (int i = indexLeft; i <= indexRight; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int divisor = 1;

        while (max / 10 > 0) {
            divisor = divisor * 10;

            max = max / 10;
        }

        for (int i = indexLeft; i <= indexRight; i++) {
            if (array[i] < 0) {
                radixArray.get(0).add(array[i]);
            } else {
                radixArray.get(1).add(array[i]);
            }
        }

        int arrayIndex = indexLeft;

        for (int i = 0; i < 2; i++) {
            for (int element : radixArray.get(i)) {
                array[arrayIndex++] = element;
            }

            radixArray.get(i).clear();
        }

        while (divisor > 0) {
            for (int i = indexLeft; i <= indexRight; i++) {
                int temp =Math.abs(array[i]) / divisor;
                radixArray.get(temp % 10).add(array[i]);
            }

            arrayIndex = indexLeft;

            for (int i = 0; i < 10; i++) {
                for (int element : radixArray.get(i)) {
                    array[arrayIndex++] = element;
                }

                radixArray.get(i).clear();
            }

            divisor = divisor / 10;
        }
    }

    static void lsdSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        for (int s = 1; max / s > 0; s *= 10) {
            countingSortForLsd(array, s);
        }
    }

    static void lsdSortForIndex(int[] array, int indexLeft, int indexRight){
        int[] tmp = new int[indexRight - indexLeft + 1];
        System.arraycopy(array, indexLeft, tmp, 0, tmp.length);
        int max = Arrays.stream(tmp).max().getAsInt();
        for (int s = 1; max / s > 0; s *= 10){
            countingSortForLsd(tmp, s);
        }
        System.arraycopy(tmp, 0, array, indexLeft, tmp.length);
    }

}