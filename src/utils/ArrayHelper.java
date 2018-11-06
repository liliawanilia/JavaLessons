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
}
