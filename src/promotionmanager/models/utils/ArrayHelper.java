package promotionmanager.models.utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

/**
 * Created by pawelk on 30/10/2018.
 */
public class ArrayHelper<T> {
    public T[] addNewItem(T[] array, T newItem) {
        final int N = array.length;
        array = Arrays.copyOf(array, N + 1);
        array[N] = newItem;
        return array;
    }

    public T[] deleteItem(T[] array, T item) {
        throw new NotImplementedException();
    }

    public T[] sort(T[] array, boolean descending) {
        throw new NotImplementedException();
    }

    public T getItem(T[] array, int index) {
        throw new NotImplementedException();
    }

    public T[] swapItems(T[] array, T first, T second) {
        throw new NotImplementedException();
    }
}
