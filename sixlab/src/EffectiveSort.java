//Иванчиков Василий Александрович ККСО-02-20
import java.util.Arrays;

public class EffectiveSort {
    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    public static void quickSortForIndex(int[] array, int indexLeft, int indexRight){
        if(indexLeft < indexRight){
            int divideIndex = partition(array, indexLeft, indexRight);
            quickSortForIndex(array, indexLeft, divideIndex - 1);
            quickSortForIndex(array, divideIndex, indexRight);
        }
    }

    public static void  MyFunc(int[] array) {//Функция для решения задания во время сдачи
        mergeSortSimple(array);
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                count++;
                System.out.println(array[i]);
            }
        }
        if (count == 0)
            System.out.println("-1");
    }
    public static void quickSortSimple(int[] array){
        quickSortForIndex(array, 0, array.length - 1);
    }
    public static int partition(int[] array, int indexLeft, int indexRight){
        int from = indexLeft;
        int to = indexRight;
        int pivot = array[(indexLeft + indexRight) / 2];
        while (from <= to) {
            while (array[from] < pivot) {
                from++;
            }
            while (array[to] > pivot) {
                to--;
            }
            if (from <= to) {
                swap(array, to, from);
                from++;
                to--;
            }
        }
        return from;
    }
    public static <X extends Comparable<? super X>> int partitionG(X[] array, int indexLeft, int indexRight){
        int from = indexLeft;
        int to = indexRight;
        X pivot = array[(indexLeft + indexRight) / 2];
        while (from <= to) {
            while (array[from].compareTo(pivot) < 0) {
                from++;
            }
            while (array[to].compareTo(pivot) > 0){
                to--;
            }
            if (from <= to) {
                X tmp  = array[from];
                array[from] = array[to];
                array[to] = tmp;
                from++;
                to--;
            }
        }
        return from;
    }
    public static <X extends Comparable<? super X>> void quickSortForIndexG(X[] array, int indexLeft, int indexRight){
        if(indexLeft < indexRight){
            int divideIndex = partitionG(array, indexLeft, indexRight);
            quickSortForIndexG(array, indexLeft, divideIndex - 1);
            quickSortForIndexG(array, divideIndex, indexRight);
        }
    }
    public static void heapSort(int[] array){
        int n = array.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(array, i, n);
        }
        for(int i = n - 1; i >= 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0 , i);
        }
    }
    public static <X extends Comparable<? super X>> void heapSortG(X[] array){
        int n = array.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            heapifyG(array, i, n);
        }
        for(int i = n - 1; i >= 0; i--){
            X temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapifyG(array, 0 , i);
        }
    }

    public static void heapSortForIndex(int[] array, int indexLeft, int indexRight){
        int[] tmp = new int[indexRight - indexLeft + 1];
        System.arraycopy( array, indexLeft, tmp, 0, tmp.length);
        heapSort(tmp);
        System.arraycopy(tmp, 0 , array, indexLeft, tmp.length);
    }

    public static <X extends Comparable<? super X>> void heapifyG(X[] array, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;
        if (l < n && array[l].compareTo(array[largest]) > 0) {
            largest = l;
        }
        if (r < n && array[r].compareTo(array[largest]) > 0) {
            largest = r;
        }
        if (i != largest) {
            X temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapifyG(array, largest, n);
        }
    }
    public static void heapify(int[] array, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;
        if(l < n && array[l] > array[largest]){
            largest = l;
        }
        if(r < n && array[r] > array[largest]){
            largest = r;
        }
        if(i != largest){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, largest, n);
        }
    }
    public static void mergeSortSimple(int[] array) {
        mergeSortForIndex(array, 0, array.length - 1);
    }
    public static void mergeSortForIndex(int[] array, int indexLeft, int indexRight) {
        if (indexRight - indexLeft + 1 < 2) {
            return;
        }

        int indexOfMid = (indexRight - indexLeft + 1) / 2;
        int[] leftArray = Arrays.copyOfRange(array, indexLeft, indexLeft + indexOfMid);
        int[] rightArray = Arrays.copyOfRange(array, indexLeft + indexOfMid, indexRight + 1);

        mergeSortForIndex(leftArray, 0, leftArray.length - 1);
        mergeSortForIndex(rightArray, 0, rightArray.length - 1);

        merge(array, leftArray, rightArray, indexLeft);
    }
    private static void merge(int[] array, int[] leftArray, int[] rightArray, int k) {
        int i = 0;
        int j = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
    public static <X extends Comparable<? super X>> void mergeSortGeenForIndex(X[] array, int indexLeft, int indexRight) {
        if (indexRight - indexLeft + 1 < 2) {
            return;
        }

        int indexOfMid = (indexRight - indexLeft + 1) / 2;
        X[] leftArray = Arrays.copyOfRange(array, indexLeft, indexLeft + indexOfMid);
        X[] rightArray = Arrays.copyOfRange(array, indexLeft + indexOfMid, indexRight + 1);

        mergeSortGeenForIndex(leftArray, 0, leftArray.length - 1);
        mergeSortGeenForIndex(rightArray, 0, rightArray.length - 1);

        merge(array, leftArray, rightArray, indexLeft);
    }
    private static <X extends Comparable<? super X>> void merge(X[] array, X[] leftArray, X[] rightArray, int k) {
        int i = 0;
        int j = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }



}




