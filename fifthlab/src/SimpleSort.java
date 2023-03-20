//Иванчиков Василий Александрович ККСО-02-20
public class SimpleSort {
    public static void simpleBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void simpleBubbleForIndex(int[] array, int indexLeft, int indexRight) {
        try {
            for (int i = indexRight; i > indexLeft; i--) {
                for (int j = indexLeft; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static <X extends Comparable<? super X>> void bubbleG(X[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    X temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <X extends Comparable<? super X>> void bubbleGenForIndex(X[] array, int indexLeft, int indexRight) {
        try {
            for (int i = indexRight; i > indexLeft; i--) {
                for (int j = indexLeft; j < i; j++) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        X temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void simpleSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void simpleSelectionForIndex(int[] array, int indexLeft, int indexRight) {
        try {

            for (int i = indexLeft; i <= indexRight; i++) {
                int indexOfMin = i;
                for (int j = i + 1; j <= indexRight; j++) {
                    if (array[indexOfMin] > array[j]) {
                        indexOfMin = j;
                    }
                }
                int temp = array[i];
                array[i] = array[indexOfMin];
                array[indexOfMin] = temp;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static <X extends Comparable<? super X>> void selectionG(X[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            X min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[pos].compareTo(array[j]) > 0) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static <X extends Comparable<? super X>> void selectionGeenForIndex(X[] array, int indexLeft, int indexRight){
        try {
            for (int i = indexLeft; i <= indexRight; i++) {
                int pos = i;
                for (int j = i + 1; j <= indexRight; j++) {
                    if (array[pos].compareTo(array[j]) > 0) {
                        pos = j;
                    }
                }
                X temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void simpleInsertionForIndex(int[] array, int indexLeft, int indexRight) {
        try {
            for (int i = indexLeft + 1; i <= indexRight; i++) {
                int temp = array[i];
                int j = i;
                for (; j > indexLeft && array[j - 1] > temp; j--) {
                    array[j] = array[j - 1];
                }
                array[j] = temp;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void simpleInsertion(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int temp = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
    public static <X extends Comparable<? super X>> void insertionG(X[] array){
        for (int i = 1; i < array.length; i++) {
            X temp = array[i];
            int j = i;
            for (; j > 0 && array[j - 1].compareTo(temp) > 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }

    public static <X extends Comparable<? super X>> void insertionGeenForIndex(X[] array, int indexLeft, int indexRight){
        try {
            for (int i = indexLeft + 1; i <= indexRight; i++) {
                X temp = array[i];
                int j = i;
                for (; j > indexLeft && array[j - 1].compareTo(temp) > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[j] = temp;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}





