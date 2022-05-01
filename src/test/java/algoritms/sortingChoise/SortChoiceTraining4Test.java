package algoritms.sortingChoise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortChoiceTraining4Test {

    @Test
    void choiceSortTest() {
        int[] actual = SortChoiceTraining4.choiceSort(new int[]{9,8,7,6,5,4,3,2,1});
        int[] expected = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(actual,expected);
    }
}