package algoritms.sortingChoise;

import java.util.Arrays;

public class SortChoiceTraining4 {
    public static void main(String[] args) {
        int[] numbers = {5,4,5,2,7,9,1};
        System.out.println(Arrays.toString(choiceSort(numbers)));
    }
    public static int[] choiceSort(int[] array){
        int temp,min;
        for(int i = 0;i<array.length;i++){
            temp = array[i];
            min=min(array,i);
            array[i]=array[min];
            array[min] = temp;
        }

        return array;
    }

    public static int min(int[]array, int startIndex){
        int index = startIndex;
        for(int i = startIndex;i<array.length;i++){
            if(array[index]>array[i])index=i;
        }

        return index;
    }
}
