package algoritms.bubbleSorting;

import java.util.Arrays;

public class BubbleSortingTraining {
    public static void main(String[] args){
        int[] array = {1,51,6,4,3,1,5,4,2,5,4,7,6,2,3,1};
        System.out.println(Arrays.toString(bubbleSorting(array)));
    }

    public static int[] bubbleSorting(int[] numbers){
        int temp = 0;
        for(int i = 0;i<numbers.length;i++){
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        return numbers;
    }
}
