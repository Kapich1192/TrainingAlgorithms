package algoritms.bubbleSorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortingTraining12Test {

    @Test
    void bubbleSortArrayTest() {
        int[] actual = BubbleSortingTraining12.bubbleSortArray(new int[]{4,3,4,5,4});
        int[] expected = {3,4,4,4,5};
        assertArrayEquals(actual,expected);
    }

    @Test
    void bubbleSortingListTest(){
        ArrayList<Integer> actual = BubbleSortingTraining12.bubbleSortingList(new ArrayList<Integer>(){{
            add(4);add(3);add(5);add(7);add(2);
        }});
        ArrayList<Integer> expected = new ArrayList<Integer>(){{add(2);add(3);add(4);add(5);add(7);}};
        assertArrayEquals(new ArrayList[]{actual}, new ArrayList[]{expected});
    }


}