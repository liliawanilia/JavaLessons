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

    /**
     * Remove item tests
     * 1. Remove an item from empty array
     * 2. Remove an item that is out of the length of array
     * 3. Remove given item form the array
     */
    @Test
    public void removeItem_WhenArrayIsEmpty_ThenReturnArrayWithMinInteger(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] emptyArray = new Integer[0];
        Integer item = 1;
        Integer[] expectedResult = new Integer[1];
        expectedResult[0] = Integer.MIN_VALUE;

        //Act
        Integer[] result = arrayHelper.removeItem(emptyArray, item);

        //Assert
        Assertions.assertEquals(expectedResult[0], result[0]);
    }

    @Test
    public void removeItem_WhenGivenItemIsOutOfArrayRange_ThenReturnArrayWithMaxInteger(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        Integer item = 4;

        Integer[] expectedResult = new Integer[1];
        expectedResult[0] = Integer.MAX_VALUE;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(expectedResult[0], result[0]);
    }

    @Test
    public void removeItem_WhenGivenItemIsAPartOfArray_ThenIsRemovedFromTheArray(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

        Integer item = 3;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(array.length - 1, result.length);
        Assertions.assertEquals(array[0], result[0]);
        Assertions.assertEquals(array[1], result[1]);
        Assertions.assertEquals(array[3], result[2]);
        Assertions.assertEquals(array[4], result[3]);
    }
    /**
     * Swap items tests
     * 1. Array with less than 2 elements
     * 2. Elements out of range of array
     * 3. Swap 2 elements
     */

    @Test
    public void swapItems_WhenArrayHasLessThanTwoElements_ThenReturnArrayWithMinInteger(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] expectedResult = new Integer[1];
        Integer[] array = new Integer[1];

        expectedResult[0] = Integer.MIN_VALUE;
        array[0] = 3;
        Integer firstItem = 1;
        Integer secondItem = 4;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem);

        //Assert
        Assertions.assertEquals(expectedResult[0], result[0]);
        Assertions.assertEquals(1, result.length);
    }

    @Test
    public void swapItems_WhenItemsAreOutOfArrayRange_ThenReturnMaxInteger(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] expectedResult = new Integer[1];
        Integer[] array = new Integer[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

        expectedResult[0] = Integer.MAX_VALUE;
        Integer firstItem = 3;
        Integer secondItem = -122;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem);

        //Assertion
        Assertions.assertEquals(expectedResult[0], result[0]);
        Assertions.assertEquals(1, result.length);
    }

    @Test
    public void swapItems_WhenGivenItemsAreInArrayRange_ThenReturnArrayWithSwappedItems() {
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer arrayLength = 6;
        Integer[] array = new Integer[arrayLength];
        Integer[] expectedResult = new Integer[arrayLength];
        Integer firstItem = 5;
        Integer secondItem = 6;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
            expectedResult[i] = i + 2;
        }

        Integer temp;
        temp = expectedResult[firstItem - 1];
        expectedResult[firstItem - 1] = expectedResult[secondItem - 1];
        expectedResult[secondItem - 1] = temp;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem);

        //Assert
        Assertions.assertEquals(expectedResult.length, result.length);
        Assertions.assertEquals(expectedResult[0], result[0]);
        Assertions.assertEquals(expectedResult[1], result[1]);
        Assertions.assertEquals(expectedResult[2], result[2]);
        Assertions.assertEquals(expectedResult[3], result[3]);
        Assertions.assertEquals(expectedResult[4], result[4]);
        Assertions.assertEquals(expectedResult[5], result[5]);
    }
}

