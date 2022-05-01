package algoritms.bubbleSorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortingTraining11Test {
    @BeforeAll
    static void setup(){
        System.out.println("Test begin");
    }

    @org.junit.jupiter.api.Test
    void bubbleSortingArray() throws Exception {
        int[] actual = BubbleSortingTraining11.bubbleSortingArray(new int[]{1,2,3,4,3});
        int[] expected = {4,3,3,2,1};
        assertArrayEquals(expected,actual);

    }

    @Test
    void sum() {
        int ac = BubbleSortingTraining11.sum(2,2);
        int ex = 4;
        assertEquals(ac,ex);
    }
}