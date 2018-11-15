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

    /*
        1. array is empty => new array should contains one element, equal to provide item
        2. array is not empty => new array should contains one additional element, last element in array should be equal to provided item
     */
    @Test
    public void addItem_WhenArrayIsEmpty_ThenShouldReturnArrayWithSingleElement() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] emptyArray = new Integer[0];
        Integer newElement = 10;

        // Act
        Integer[] result = arrayHelper.addItem(emptyArray, newElement);

        // Assert
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(newElement, result[0]);
    }

    @Test
    public void addItem_WhenArrayIsNotEmpty_ThenShouldContainAdditionalProvidedElement() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] nonEmptyArray = new Integer[3];
        nonEmptyArray[0] = 1;
        nonEmptyArray[1] = 2;
        nonEmptyArray[2] = 3;
        Integer newElement = 10;

        // Act
        Integer[] result = arrayHelper.addItem(nonEmptyArray, newElement);

        // Assert
        Assertions.assertEquals(nonEmptyArray.length + 1, result.length);
        Assertions.assertEquals(nonEmptyArray[0], result[0]);
        Assertions.assertEquals(nonEmptyArray[1], result[1]);
        Assertions.assertEquals(nonEmptyArray[2], result[2]);
        Assertions.assertEquals(newElement, result[3]);
    }
}
