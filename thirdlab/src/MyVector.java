//Иванчиков Василий Александрович ККСО-02-20
import java.util.Arrays;

public class MyVector<X> {
    public X[] array;
    public int size;
    public int max;

    public MyVector(){
        this(0);
    }
    public MyVector(int size) {
        this.size = size;
        this.max = 2 * size + 10;
        this.array = (X[])(new Object[2 * size + 10]);
    }

    public static class ball{
        int R;
        String color;
        public ball(int R, String color){
            this.R = R;
            this.color = color;
        }
    }

    public void delForValueFirst(X value){//Функция для решения задания во время сдачи
        for(int i = 0; i < array.length; i++){
            if (array[i] == value){
                delForIndex(i);
                break;}
            }

        }

    public void cloneMyVector(MyVector<X> vector) {
        this.array = Arrays.copyOf(vector.array, vector.max);
        this.size = vector.size;
        this.max = vector.max;
    }

    public void setSize(int size){
        this.size = size;
        if (size > max){
            max = 2 * size + 10;
            array = Arrays.copyOf(array, max);
        }
    }

    public void setMax(int max) {
        try {
            if (max < 0) {
                throw new RuntimeException("Negative MyVector max");
            }

            this.max = max;
            array = Arrays.copyOf(array, max);

            if (size > max) {
                size = max;
            }
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void addLast(X value){
        setSize(size + 1);
        array[size - 1] = value;
    }

    public void delLast(){
        try {
            if (size == 0){
                throw new RuntimeException("MyVector is empty");
            }
            setSize(size - 1);
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delForIndex(int index){
        try {
            if(index > size - 1 || index < 0){
                throw new RuntimeException("Wrong index");
            }
            if (size == 0){
                throw new RuntimeException("MyVector is empty, deletion is not possible");
            }
            setSize(size - 1);
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addForIndex(X value, int index){
        try{
            if(index > size - 1 || index < 0){
                throw new RuntimeException("Wrong index");
            }
            setSize(size + 1);
            var array1 = (X[])(new Object[array.length + 1]);
            System.arraycopy(array, 0, array1, 0, index);
            System.arraycopy(array, index, array1, index + 1, array.length - index);
            array1[index] = value;
            this.array = array1;
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getSize() {
        return size;
    }

    public int getMax() {
        return max;
    }

    public void delAll(){
        setSize(0);
    }

    public void printVector() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }



}