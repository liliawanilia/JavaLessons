package utils;

/**
 * Created by pawelk on 06/11/2018.
 * get min value from array (public T getMinValue(T[] array))
 get max value from array (public T getMaxValue(T[] array))
 find item from array (public bool findItem(T[] array, T item))
 add item to array (public T[] addItem(T[] array, T item))
 remove item from array (public T[] removeItem(T[] array, T item))
 swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 todo
 */
public class ArrayHelper {
    // [3,2,1] 5 => [3,2,1,5]
    public Integer[] addItem(Integer[] oldArray, Integer newItem) {
        Integer[] newArray = new Integer[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length-1] = newItem;

        return newArray;
    }

    public Integer getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;

        if (array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public boolean findItem(int[] array, int item) {
        for (int element:array) {
            if (element==item){
                return true;
            }
        }
        return false;
    }

    public Integer[] removeItem(Integer[] array, Integer item) {
        int actualSize = array.length;
        Integer[] maxArray = new Integer[1];
        Integer[] minArray = new Integer[1];
        maxArray[0] = Integer.MAX_VALUE;
        minArray[0] = Integer.MIN_VALUE;

        if (array.length == 0) {
            return minArray;
        }

        if (item > actualSize || item < 1) {
            return maxArray;
        }

        Integer[] newArray = new Integer[actualSize - 1];
        boolean flag = false;
        for (int i = 0; i < actualSize - 1; i++) {
            if (i == item - 1) {
                flag = true;
                newArray[i] = array[i + 1];
                continue;
            }
            if (flag) {
                newArray[i] = array[i + 1];
            }
            else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public Integer[] swapItems(Integer[] array, Integer firstItem, Integer secondItem) {
        Integer[] newArray = new Integer[array.length];
        Integer[] minArray = new Integer[1];
        Integer[] maxArray = new Integer[1];
        minArray[0] = Integer.MIN_VALUE;
        maxArray[0] = Integer.MAX_VALUE;

        if (array.length < 2) {
            return minArray;
        }

        if (firstItem  > array.length | secondItem  > array.length ||
                 firstItem < 1| secondItem < 1) {                      //Here I am not sure if the statement is correct, but works fine :D
            return maxArray;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == firstItem - 1){
                newArray[i] = array[secondItem - 1];
            }
            else if (i == secondItem - 1) {
                newArray[i] = array[firstItem -1];
            }
            else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
