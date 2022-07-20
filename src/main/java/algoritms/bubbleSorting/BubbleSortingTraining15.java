package algoritms.bubbleSorting;

public class BubbleSortingTraining15 {
    public static void main (String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        bubbleSort(numbers);
        System.out.println("");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
