package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ArrayHelper;

/**
 * Created by pawelk on 06/11/2018.
 */
public class ArrayHelperTest {

    @Test
    public void getMinValue_WhenArrayIsEmpty_ThenReturnNull() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[0];
        Integer expectedValue = null;

        // Act
        Integer result = arrayHelper.getMinValue(array);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void getMinValue_WhenArrayIsNotEmpty_ThenReturnMinValue() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[3];
        Integer expectedValue = new Integer(10);
        array[0] = expectedValue;
        array[1] = expectedValue + 2;
        array[2] = expectedValue + 10;


        // Act
        Integer result = arrayHelper.getMinValue(array);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsEmpty_ThenReturnFalse() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[0];
        int itemToFind = 10;
        boolean expectedValue = false;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementDoesntExistInArray_ThenReturnFalse() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[3];
        int itemToFind = 10;
        array[0] = itemToFind + 1;
        array[1] = itemToFind + 2;
        array[2] = itemToFind + 3;
        boolean expectedValue = false;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementExistsInArray_ThenReturnTrue() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[3];
        int itemToFind = 10;
        array[0] = itemToFind + 1;
        array[1] = itemToFind;
        array[2] = itemToFind + 3;
        boolean expectedValue = true;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }
}
