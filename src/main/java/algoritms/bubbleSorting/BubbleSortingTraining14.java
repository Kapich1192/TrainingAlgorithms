package algoritms.bubbleSorting;
import java.util.*;
class BubbleSortingTraining14 {
    public static void main(String args[]) {
        int[] numbers = new int[25];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(" %d", numbers[i]);
        }
        bubbleSort(numbers);
        System.out.printf("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(" %d", numbers[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}